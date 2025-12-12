class Solution {
    public int[] countMentions(int n, List<List<String>> events) {
     events.sort(
    Comparator
        .comparingInt((List<String> e) -> Integer.parseInt(e.get(1)))
        .thenComparing(e -> e.get(0).equals("OFFLINE") ? 0 : 1)
);


        TreeMap<Integer,ArrayList<Integer>> offline=new TreeMap<>();
        ArrayList<Integer>active=new ArrayList<>();
        // ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            active.add(i);
        }
        // System.out.println(active);
        // System.out.println(events);
        HashMap<Integer,Integer> ans=new HashMap<>();

        for(int i=0;i<events.size();i++)
        {
            // System.out.println("BEFORE++"+" "+offline);
            int time=Integer.parseInt(events.get(i).get(1));
            List<Integer> removeKeys = new ArrayList<>();
                for(Map.Entry<Integer,ArrayList<Integer>>hm:offline.entrySet())
                {
                    int curtime=hm.getKey();
                    if(curtime<=time)
                    {
                        ArrayList<Integer> curids=hm.getValue();
                        for(int j=0;j<curids.size();j++)
                        {
                            active.add(curids.get(j));
                        }
                         removeKeys.add(curtime);
                        
                    }
                    else
                    break;
                }
                for (int key : removeKeys) {
                    offline.remove(key);
                    }

            // System.out.println("After++"+" "+offline);
            if(events.get(i).get(0).equals("MESSAGE"))
            {
                
                if(events.get(i).get(2).equals("HERE"))
                {
                    System.out.println("HERE"+" "+active);
                    for(int ind=0;ind<active.size();ind++)
                    {
                        ans.put(active.get(ind),ans.getOrDefault(active.get(ind),0)+1);
                    }
                }
                else if(events.get(i).get(2).equals("ALL"))
                {
                    for(int ind=0;ind<n;ind++)
                    {
                        ans.put(ind,ans.getOrDefault(ind,0)+1);
                    }
                }
                else
                {
                String[] str=events.get(i).get(2).split(" ");
                // System.out.println(Arrays.toString(str));
                for(int ind=0;ind<str.length;ind++)
                {
                    int num = Integer.parseInt(str[ind].substring(2));
                    ans.put(num,ans.getOrDefault(num,0)+1);
                }
                }
                // System.out.println(ans);
                // System.out.println(active);
            }
            else
            {

                int temp=Integer.parseInt(events.get(i).get(1));
                int len=events.get(i).get(2).length();
                temp+=60;
                int id=Integer.parseInt(events.get(i).get(2));
                if(offline.containsKey(temp))
                {
                    ArrayList<Integer>chandu=offline.get(temp);
                    chandu.add(id);
                    offline.put(temp,chandu);
                }
                else
                {
                    ArrayList<Integer>chandu=new ArrayList<>();
                    chandu.add(id);
                    offline.put(temp,chandu);
                }
                if (active.contains(id)) {
                    active.remove(Integer.valueOf(id));
                }
                // System.out.println("After"+" "+active);
            }

        }
        int[] ans2=new int[n];
        for(Map.Entry<Integer,Integer>hm:ans.entrySet())
        {
            ans2[hm.getKey()]=hm.getValue();
        }
        return ans2;
    }
}