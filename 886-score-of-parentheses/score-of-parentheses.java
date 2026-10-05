class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        int count = 0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '(') {
                stack.push(0);
            }
            else{
                int inner=stack.pop();
                int score;
                if(inner==0){
                    score=1;
                }
                else{
                    score=2*inner;
                }
                int previous=stack.pop();
                
                stack.push(previous + score);
            }
        }
        return stack.pop();
    }
}