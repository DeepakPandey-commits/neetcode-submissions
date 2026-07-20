class Solution {
    public boolean found = false;
    public void helper(String str , String curr , String s2){
        if(found){
            return;
        }

        if(str.length() == 0){
            if(s2.contains(curr)){
                found = true;
            }
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0 , i) + str.substring(i+1);
            helper(newstr , curr+ch , s2);
        }
    }
    public boolean checkInclusion(String s1, String s2) {
        helper(s1 , ""  , s2);
        return found;
    }
}
