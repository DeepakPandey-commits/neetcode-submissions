class Solution {
    public static int SearchRotatedSorted(int arr[] , int target ,  int si , int ei){
    if(si>ei){
        return -1;
    }

    //kaam
    int mid = si + (ei-si)/2;

    // case found
    if(arr[mid]==target){
        return mid;
    }
    
    //mid lie on L1
    if(arr[si] <= arr[mid]){
        //case A : left
        if(arr[si]<= target && target<=arr[mid]){
            return SearchRotatedSorted(arr, target, si, mid - 1);
        }else{ //case B : right
            return SearchRotatedSorted(arr, target, mid+1, ei);
        }
    }
    // mid lie on L2
    else{
        // case c : right
        if(arr[mid]<=target && target<=arr[ei]){
            return SearchRotatedSorted(arr, target, mid+1, ei);
        }else{ // case d : left
            return SearchRotatedSorted(arr, target, si, mid-1);
        }

    }
}
    public int search(int[] nums, int target) {
        int si = 0;
        int ei = nums.length-1;
        return  SearchRotatedSorted(nums, target , si , ei);
    }
}
