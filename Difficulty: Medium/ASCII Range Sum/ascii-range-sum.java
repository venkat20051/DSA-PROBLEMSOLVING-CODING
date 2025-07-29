class Solution {
    public ArrayList<Integer> asciirange(String s) {
        // code here
        int[] pre=new int[s.length()];
        pre[0]=0;
        int n=s.length();
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+(int)(s.charAt(i));
        }
        // System.out.println(Arrays.toString(pre));
        HashMap<Character,ArrayList<Integer>> sam=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(sam.containsKey(s.charAt(i)))
            {
                ArrayList<Integer> prev=sam.get(s.charAt(i));
                prev.add(i);
                sam.put(s.charAt(i),prev);
            }
            else
            {
                ArrayList<Integer>  cur=new ArrayList<>();
                cur.add(i);
                sam.put(s.charAt(i),cur);
            }
        }
        // System.out.println(sam);
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Character,ArrayList<Integer>> hm:sam.entrySet())
        {
            ArrayList<Integer> st=hm.getValue();  
            // System.out.println(st);
            if(st.size()>=2)
            {
                int val=pre[st.get(st.size()-1)]-pre[st.get(0)]-(int)hm.getKey();
                if(val>0)
                ans.add(val);
            }
        }
        return ans;
    }
}