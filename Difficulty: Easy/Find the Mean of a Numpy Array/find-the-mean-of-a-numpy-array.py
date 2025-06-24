def mean_of_elements(arr):
    # Code here
    n=len(arr)
    sum=0
    for i in arr:
        sum+=i
    # print(sum)
    ans=sum/n
    return ans