class Solution {
    public int minimumDeletions(int[] nums) {
        int min= Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
                maxIndex=i;
            }
        }
        int front = Math.max(minIndex, maxIndex) + 1;
        int back=n-Math.min(minIndex, maxIndex);
        int minFrontMaxBack = minIndex + 1 + (n - maxIndex);
        int maxFrontMinBack=maxIndex+1+(n-minIndex);
        return Math.min(Math.min(front, back),Math.min(minFrontMaxBack, maxFrontMinBack));


        
        
    }
}