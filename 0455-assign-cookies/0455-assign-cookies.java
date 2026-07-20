class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int childrencontext=0;
        int cookie=0;
        while(cookie<s.length && childrencontext<g.length){
            if(s[cookie]>=g[childrencontext]){
                childrencontext++;
            }
            cookie++;
        }
        return childrencontext;
    }
}