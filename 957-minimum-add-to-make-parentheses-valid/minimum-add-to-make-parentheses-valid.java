class Solution {
    public int minAddToMakeValid(String s) {
        int balance=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                balance++;
            }
            else{
                if(balance==0){
                    ans++;
                }
                else{
                    balance--;
                }
            }
        }
        ans+=balance;
        return ans;
        
    }
}