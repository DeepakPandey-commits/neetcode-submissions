class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g.length; j++){
                if(g[i]<=s[j]){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}