class Solution {
    public int minInsertions(String s) {
        int open=0;
        int balance=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                if (i + 1 < s.length() && s.charAt(i + 1) == ')'){

                
                    if (open > 0) {
                        open--;
                    }
                    else{
                        balance++;
                    }
                   i++;
                }
                else{
                    balance++;
                    if (open > 0) {
                        open--;
                    } else {
                        balance++;
                    }
                }
            }

        }

        return balance+2*open;
    }
}