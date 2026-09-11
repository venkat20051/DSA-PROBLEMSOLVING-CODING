class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] visited = new boolean[digits.length];
        Arrays.sort(digits);

        int ans = findAll(digits, visited, 0, 0);

        return ans;
    }

    int findAll(int[] digits, boolean[] visited, int number, int count) {

        if(count == 3) {
            if(number % 2 == 0)
                return 1;
            else
                return 0;
        }

        int total = 0;

        for(int i = 0; i < digits.length; i++) {

            if(visited[i])
                continue;

            if(count == 0 && digits[i] == 0)
                continue;

            if(i > 0 && digits[i] == digits[i - 1] && !visited[i - 1])
                continue;

            visited[i] = true;

            total += findAll(
                digits,
                visited,
                number * 10 + digits[i],
                count + 1
            );

            visited[i] = false;
        }

        return total;
    }
}