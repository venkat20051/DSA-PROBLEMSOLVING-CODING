class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
       int count=0;
        for(int i=0;i<fruits.length;i++)
            {
                for(int j=0;j<baskets.length;j++)
                    {
                        if(fruits[i]<=baskets[j] && baskets[j]!=-1)
                        {
                            baskets[j]=-1;
                            count++;
                            break;
                        }
                    }
            }
        return fruits.length-count;
    }
}