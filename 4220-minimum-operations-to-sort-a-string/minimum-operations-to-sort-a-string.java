class Solution {
    public int minOperations(String s) {
        int n = s.length();

        boolean sorted = true;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) return 0;
        if (n == 2) return -1;

        char min = 'z', max = 'a';

        for (char c : s.toCharArray()) {
            min = (char) Math.min(min, c);
            max = (char) Math.max(max, c);
        }

        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

       if (s.charAt(0) == max && s.charAt(n - 1) == min
        && s.indexOf(min) == n - 1
        && s.lastIndexOf(max) == 0) {
            return 3;
        }

        return 2;
    }
}