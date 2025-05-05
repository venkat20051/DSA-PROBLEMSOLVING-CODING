class Solution {
    public int smallestNumber(int n) {
        StringBuilder st = new StringBuilder(Integer.toString(n, 2));

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == '0') {
                st.setCharAt(i, '1');
            }
        }
        int num = Integer.parseInt(st.toString(), 2);
        return num;
    }
}
