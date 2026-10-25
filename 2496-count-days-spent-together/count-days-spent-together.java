class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob){
    int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int aliceStart = dateToDay(arriveAlice, daysInMonths);
        int aliceEnd = dateToDay(leaveAlice, daysInMonths);
        int bobStart = dateToDay(arriveBob, daysInMonths);
        int bobEnd = dateToDay(leaveBob, daysInMonths);

        int overlapStart = Math.max(aliceStart, bobStart);
        int overlapEnd = Math.min(aliceEnd, bobEnd);

        return Math.max(0,overlapEnd-overlapStart+1);
    }
    private int dateToDay(String dateStr, int[] daysInMonths) {
        String[] parts = dateStr.split("-");
        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);
        
        int totalDays = day;
        for (int m = 0; m < month - 1; m++) {
            totalDays += daysInMonths[m];
        }
        return totalDays;
        
        
    }
}