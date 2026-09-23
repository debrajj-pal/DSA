class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int total=0;
        for (int i=0;i<n;i++){
            total+=nums[i];
        }
        int target=total-x;
        if(target<0){
            return -1;
        }
        int left = 0;
        int right = 0;
        int windowSum = 0;
        int maxlen=-1;
        while(right<n){
            windowSum+=nums[right];
            right++;
            while(windowSum>target){
                windowSum-=nums[left];
                left++;
            }
            if(windowSum==target){
                maxlen=Math.max(maxlen,right-left);
            }
            

        }
        if(maxlen==-1){
            return -1;
        }
        else{
            return n-maxlen;
        }
        
    }
}