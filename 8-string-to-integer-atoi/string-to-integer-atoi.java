class Solution {
    public int myAtoi(String s) {
        String digit = "0123456789";
        s = s.strip();
        if (s.length() == 0)
            return 0;
        
        int neg = 0;
        int ans = 0;
        int i = 0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            if (s.charAt(0) == '-') {
                neg = 1;
            }
            i++;
        }

        for (; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int dig = s.charAt(i) - '0';

                if (ans > (Integer.MAX_VALUE - dig) / 10) {
                    return neg == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }

                ans = (ans * 10) + dig;
            } else {
                break;
            }
        }

        return neg == 1 ? -ans : ans;
    }
}
