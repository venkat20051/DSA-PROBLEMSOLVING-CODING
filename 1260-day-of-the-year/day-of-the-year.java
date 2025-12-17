class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int cur = 1;
        int count = 0;

        while (cur < month) {
            if (cur == 2) {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    count += 29;
                } else {
                    count += 28;
                }
            } 
            else if (cur == 1 || cur == 3 || cur == 5 || cur == 7 ||
                     cur == 8 || cur == 10 || cur == 12) {
                count += 31;
            } 
            else {
                count += 30;
            }
            cur++;
        }

        count += day;
        return count;
    }
}
