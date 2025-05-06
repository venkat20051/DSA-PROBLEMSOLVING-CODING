#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

#User function Template for python3
class Solution:
    def printAscii(self, ch):
        ascii = ord(ch)
        print(ascii)


#{ 
 # Driver Code Starts.

t = int(input())
while t:
    t-=1
    ch = input()[0]
    s = Solution()
    s.printAscii(ch)
# } Driver Code Ends