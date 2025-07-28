class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>sam=new HashMap<>();
        for(char a:stones.toCharArray())
        {
            sam.put(a,sam.getOrDefault(a,0)+1);
        }
        int count=0;
        for(char a:jewels.toCharArray())
        {
            if(sam.containsKey(a))
            count+=sam.get(a);
        }
        return count;

    }
}