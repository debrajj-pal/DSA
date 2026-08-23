class Solution {
    public boolean sumGame(String num) {
        int mid=num.length()/2;
        int leftSum = 0;
        int rightSum = 0;
        int leftQ = 0;
        int rightQ = 0;
        for(int i=0;i<num.length();i++){
            char ch = num.charAt(i);
            if(i<mid){
                if(ch=='?'){
                    leftQ++;
                }else{
                    leftSum += ch - '0';
                }
            }
            else{
                if(ch=='?'){
                    rightQ++;
                }
                else{
                    rightSum += ch - '0';
                }
            }

        }
        int totalQ = leftQ+rightQ;
        return totalQ % 2 == 1 || leftSum - rightSum != 9 * (rightQ - leftQ) / 2;
        
        
    }
}