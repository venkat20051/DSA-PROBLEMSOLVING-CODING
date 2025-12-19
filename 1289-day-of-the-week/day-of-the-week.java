class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        // Jan 1, 1971 was Friday → index 5
        int totalDays = 0;

        // Count days from 1971 to year - 1
        for (int y = 1971; y < year; y++) {
            totalDays += isLeap(y) ? 366 : 365;
        }

        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Count days from Jan to month - 1
        for (int m = 0; m < month - 1; m++) {
            totalDays += monthDays[m];
            if (m == 1 && isLeap(year)) {
                totalDays++; // leap year February
            }
        }

        // Add days of current month
        totalDays += day - 1;

        return days[(totalDays + 5) % 7];
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
