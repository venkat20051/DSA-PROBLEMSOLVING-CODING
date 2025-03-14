//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

//User function Template for C++

class Solution {
  public:    
    int setBitCount(int n) {
        // code here
        int c=0;
        while(n>0)
        {
            if((n&1)>0)
            c++;
            n=n>>1;
        }
        return c;
    }
};


//{ Driver Code Starts.

int main()
{
    int t; cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        
        Solution ob;
        
        cout <<ob.setBitCount(n) << endl;
    
cout << "~" << "\n";
}
}



// } Driver Code Ends