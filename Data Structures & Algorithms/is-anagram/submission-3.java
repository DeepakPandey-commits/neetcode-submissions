
class Solution {
    public boolean isAnagram(String s, String t) {
        // convert to lower case
        s = s.toLowerCase();
        t = t.toLowerCase();

        //check if length is equal
        if(s.length() == t.length()){
            //convert to char array
            char[] scharArray = s.toCharArrays();
            char[] tcharArray = t.toCharArrays();
        
             //sort the array
            Arrays.sort(scharArray);
            Arrays.sort(tcharArray);

            boolean result = Arrays.equals(scharArray , tcharArray);
            if(result == true){
            return true;
            }
            return false;
        }
    }
}
