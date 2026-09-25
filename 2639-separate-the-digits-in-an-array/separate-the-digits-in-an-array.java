class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num:nums){
            ArrayList<Integer> list = new ArrayList<>();
            while(num>0){
                list.add(num%10);
                num=num/10;
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                answer.add(list.get(i));
            }
        }
        int[] result = new int[answer.size()];

        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        return result;
        
    }
}