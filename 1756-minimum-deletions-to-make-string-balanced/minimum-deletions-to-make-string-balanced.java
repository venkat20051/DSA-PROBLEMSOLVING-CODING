class Solution {
    public int minimumDeletions(String s) {
        int minCount=0;
        Stack<Character> str=new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            if( !str.isEmpty() && str.peek()=='b' && s.charAt(i)=='a')
            {
                if(!str.isEmpty())
                {
                    str.pop();
                    minCount++;
                }
            }
            else{
                str.push(s.charAt(i));
            }
        }
        return minCount;
    }
}