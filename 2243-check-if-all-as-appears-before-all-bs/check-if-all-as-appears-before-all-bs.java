class Solution {
    public boolean checkString(String s) {
        boolean seen_b= false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='b'){
                seen_b=true;
            }else if(seen_b){
                return false;
            }
        }
        return true;
        
    }
}