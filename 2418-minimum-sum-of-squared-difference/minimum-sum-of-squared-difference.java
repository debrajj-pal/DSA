class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k = (long)k1 + k2;
        int[] diff = new int[n];
        long sum=0;
        int max=0;
        for(int i=0; i<n;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            sum+=diff[i];
            max=Math.max(diff[i],max);
        }
        if(k>=sum){
            return 0;
        }
        int low=0,high=max;
        while(low<high){
            int mid=(low+high)/2;
            long oper=0;
            for (int d : diff) {
                if (d > mid) {
                    oper += d - mid;
                }
            }
            if (oper <= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        int level = low;
        long ans = 0;
        for (int d : diff) {
            int reduced = Math.min(d, level);
            ans += (long) reduced * reduced;
            k-=d-reduced;
        }
        for(int i=0;i<n && k>0;i++){
            if (diff[i] >= level && level > 0) {
                ans-=(long)level*level;
                ans+=(long)(level-1)*(level-1);
                k--;
            }
        }
        return ans;



        
    }
}