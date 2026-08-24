class Solution {
    public int minimizedMaximum(int n, int[] quan) {
        int low=1;
        int high=0;
        for(int q:quan){
            high=Math.max(q,high);
        }
        int ans=high;
        while(low<=high){
            int mid=(high+low)/2;
            int storeneed=0;
            for(int q:quan){
                storeneed+=(q+mid-1)/mid;
            }

            if(storeneed<=n){
                ans=mid;
                high=mid-1;
            }

            else{
                low=mid+1;
            }
        }
        return ans;

    }
}