class Solution {
    public int maxArea(int[] h) {
        int ans=0;
        int l=0,n=h.length;
        int r=n-1;
        while(l<r){
            int area=Math.min(h[l],h[r]) * (r-l);
            ans=Math.max(ans,area);
            if(h[l] < h[r])l++;
            else r--;
        }
        return ans;

    }
}
