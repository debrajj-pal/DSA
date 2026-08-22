class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int mul=1;
        int og=n;
        while (n>0){
            int digit=0;
            digit=n%10;
            sum+=digit;
            mul*=digit;
            n=n/10;
        }
        if(og%(sum+mul)==0){
            return true;
        }
        else{
            return false;
        }

        
    }
}