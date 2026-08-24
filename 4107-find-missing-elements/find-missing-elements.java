class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        HashMap<Integer,Integer>map = new HashMap<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        List<Integer> ans= new ArrayList<>();
        for(int num: nums){
            map.put(num,1);
        }
        for(int num=min;num<=max;num++){
            if(!map.containsKey(num)){
                ans.add(num);
            }
        }
    
        return ans;
        
    }
}