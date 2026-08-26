class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int i=0;
        int count=0;
        int j=0;
        ArrayList<String> sample=new ArrayList<>();
        StringBuilder str=new StringBuilder("");
        while(i<s.length())
        {
            if(s.charAt(i)=='0')
            str.append('0');
            else
            {
                str.append('1');
                count++;
                // System.out.println(str+" "+count);
                if(count==k)
                {
                    // sample.add(str);
                    // System.out.println("Inside........");
                    for(j=0;j<str.length();j++)
                    {
                        // System.out.println(str.substring(j,str.length()));
                        if(str.charAt(j)=='1')
                        {
                            sample.add(str.substring(j,str.length()));
                            count--;
                            break;
                        }
                        else
                        {
                            sample.add(str.substring(j,str.length()));
                        }
                    }
                str.delete(0,j+1);
                }
            }
            i++;
        }
        // System.out.println(sample);
        if(sample.size()==0)
        return "";
        else
        {
            sample.sort((a, b) -> {
    if (a.length() < b.length())
        return -1;
    else if (a.length() > b.length())
        return 1;
    else
        return a.compareTo(b);
});
            return sample.get(0);
        }
    }
}