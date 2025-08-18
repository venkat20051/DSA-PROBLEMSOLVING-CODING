//User function Template for C++

class Solution{
    public:
    long long get_Sum(int n,vector<int>&input)
    {
        //your code here
        long long ans=0;
        for(int i=0;i<n;i++)
        {
            ans+=input[i];
        }
        return ans;
    }
};
