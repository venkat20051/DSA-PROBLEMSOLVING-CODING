class Solution:
    def maxFrequencyElements(self, nums: List[int]) -> int:
        l=[]
        for i in nums:
            k=nums.count(i)
            l.append(k)
        a= all(element == l[0] for element in l)
        if a==True:
            return len(l)
        else:
            m=max(l)
            o=l.count(m)
            return o

        