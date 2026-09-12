class Solution {
    public int largestAltitude(int[] gain) {
        int current_altitude=0;
        int highest_altitude=0;
        for(int i=0;i<gain.length;i++){
            current_altitude+=gain[i];
            highest_altitude = Math.max(highest_altitude, current_altitude);

        }
        return highest_altitude;
        
    }
}