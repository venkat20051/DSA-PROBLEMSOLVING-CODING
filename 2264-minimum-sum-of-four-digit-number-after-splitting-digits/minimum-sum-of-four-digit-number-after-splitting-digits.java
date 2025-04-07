class Solution {
    public int minimumSum(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        Arrays.sort(digits);
        int new1 = 0, new2 = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                new1 = new1 * 10 + (digits[i] - '0');
            } else {
                new2 = new2 * 10 + (digits[i] - '0');
            }
        }
        return new1 + new2;
    }
}