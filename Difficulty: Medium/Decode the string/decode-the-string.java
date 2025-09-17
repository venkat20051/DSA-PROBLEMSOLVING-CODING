


class Solution {
    static String decodeString(String s) {
        // code here
       Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Build the full number (handles multi-digit numbers)
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                // Push current number and string onto stacks, then reset
                numStack.push(num);
                strStack.push(currStr);
                num = 0;
                currStr = new StringBuilder();
            } else if (ch == ']') {
                // Pop and repeat the string
                StringBuilder temp = currStr;
                currStr = strStack.pop();
                int repeatTimes = numStack.pop();
                
                while (repeatTimes-- > 0) {
                    currStr.append(temp);
                }
            } else {
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }
}