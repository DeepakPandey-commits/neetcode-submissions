class Solution {
    public int addtillKth(int[] helper , int k){
        int sum = 0;
        for(int j=0; j<= k ; j++){
            sum += helper[j];
        }

    }
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;
        int helper[] = new int[n-1];
        int i = 0; //bills travrse
        int k = 0; // helper traverse
        while(i<n){
            if(bills[i] == 5){
                helper[k++] = 5;
                i++;
            }
            int diff = bills[i] - 5;
            int y = addtillKth(helper, i);
            if(y == dif){
                return true;
            }
        }
        return false;
    }
}