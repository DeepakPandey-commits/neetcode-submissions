class Solution {
    public boolean isAsc(int[] nums , int start , int end){
        for(int i=start; i<end; i++){
            if(nums[i] >= nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public int maxAscendingSum(int[] nums) {
        int Maxsum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(isAsc(nums, i , j)){
                    int sum = 0; 
                    for(int k=i; k<=j ; k++){
                        sum += nums[k];
                    }
                    if(sum > Maxsum){
                    Maxsum = sum;
                    }
                }
                
            }
        }
        return Maxsum;
    }
}
                }
                if(sum > Maxsum){
                    Maxsum = sum;
                }
            }
        }
        return Maxsum;
    }
}