class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        int i = 0;
        int j=0;
        while(i<g.length){
            if(g[i++]<=s[j++]){
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}