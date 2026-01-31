class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Character ans=target;
        for(int i=0;i<letters.length;i++)
        {
            if(ans==target && letters[i]>target)
            {
                ans=letters[i];
            }
            else if(letters[i]>target && letters[i]<ans)
            {
                ans=letters[i];
            }
            // System.out.println(letters[i]+" "+ans);
        }
        return ans==target?letters[0]:ans;
    }
}