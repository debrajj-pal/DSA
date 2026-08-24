class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=position[position.length-1]-position[0];
        int answer=0;
        while(low<=high){
            int mid=(high+low)/2;
            if (canPlace(position,m,mid)){
                answer=mid;
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return answer;
    }

        private boolean canPlace(int[] position, int m, int distance){
            int count=1;
            int lastpos=position[0];
            for(int i=1;i<position.length;i++){
                if(position[i]-lastpos>=distance){
                    count++;
                    lastpos=position[i];
                }

                if(count>=m){
                    return true;
                }
        
            }
            return false;
        }
}