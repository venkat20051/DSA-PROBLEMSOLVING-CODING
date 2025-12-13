class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> ans=new ArrayList<>();
        TreeMap<String,ArrayList<String>> sam=new TreeMap<>();
        String valid="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_";
        for(int i=0;i<code.length;i++)
        {
            boolean codeValid=true;
            boolean bussinessValid=false;
            for(int j=0;j<code[i].length();j++)
            {
                 if(!valid.contains(""+code[i].charAt(j)))
                 {
                     codeValid=false;
                     break;
                 }
            }
            if(code[i].length()==0)
                codeValid=false;
            // System.out.println(bussinessLine[i]);
            if(businessLine[i].equals("electronics") || businessLine[i].equals("grocery") || businessLine[i].equals("pharmacy") || businessLine[i].equals("restaurant"))
            {
                bussinessValid=true;
            }
            if(codeValid==true && bussinessValid==true && isActive[i]==true)
            {
                // ans.add(businessLine[i]);
                if(sam.containsKey(businessLine[i]))
                {
                    ArrayList<String> exist=sam.get(businessLine[i]);
                    exist.add(code[i]);
                    sam.put(businessLine[i],exist);
                }
                else
                {
                    ArrayList<String> exist=new ArrayList<>();
                    exist.add(code[i]);
                    sam.put(businessLine[i],exist);
                }
                // sam.put(businessLine[i],code[i]);
                
            }
        }
        for(Map.Entry<String,ArrayList<String>>hm:sam.entrySet())
            {
                ArrayList<String> check=hm.getValue();
                Collections.sort(check);
                for(int k=0;k<check.size();k++)
                    {
                        ans.add(check.get(k));
                    }
            
            }
        // Collections.sort(ans);
        return ans;
    }
}