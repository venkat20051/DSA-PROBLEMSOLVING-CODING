//{ Driver Code Starts
#include <algorithm>
#include <bits/stdc++.h>
#include <cstdlib>
#include <iostream>
#include <map>

using namespace std;


// } Driver Code Ends

class Solution {
  public:
    // Function to return the name of candidate that received maximum votes.
    vector<string> winner(vector<string> &arr) {
        // code here
      map<string, int> win;

    for (const auto& st : arr) { 
        win[st]++;
    }

    int max = 0;
    string winn = "";
    vector<string> ans;

    for (const auto& pair : win) { 
        if (pair.second > max) {
            max = pair.second;
            winn = pair.first;
        }
    }

    ans.push_back(winn);          
    ans.push_back(to_string(max));
    return ans;
        
    }
};


//{ Driver Code Starts.

vector<string> inputLine() {
    string str;
    getline(cin, str);
    stringstream ss(str);
    string s;
    vector<string> res;
    while (ss >> s) {
        res.push_back(s);
    }
    return res;
}

int main() {
    int t;
    cin >> t;
    cin.ignore();
    for (int i = 0; i < t; i++) {
        vector<string> arr = inputLine();
        Solution obj;
        vector<string> result = obj.winner(arr);

        cout << result[0] << " " << result[1] << endl;
        cout << "~" << endl;
    }
    return 0;
}

// } Driver Code Ends