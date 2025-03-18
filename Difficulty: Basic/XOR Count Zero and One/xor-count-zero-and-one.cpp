//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

//User function Template for C++

class Solution
{
public:
	int find_xor(int n)
	{
	    // Code here
	    int set_bit=0;
	    int unset_bit=0;
	    while(n!=0)
	    {
	        if((n&1)>0)
	        {
	            set_bit++;
	        }
	        else
	        {
	            unset_bit++;
	        }
	        n=n>>1;
	    }
	    return set_bit^unset_bit;
	}
};


//{ Driver Code Starts.
int main(){
    int T;
    cin >> T;
    while(T--)
    {
    	int n; 
    	cin >> n;
    	Solution ob;
    	int ans = ob.find_xor(n);
    	cout << ans << "\n";
    
cout << "~" << "\n";
}
	return 0;
}

// } Driver Code Ends