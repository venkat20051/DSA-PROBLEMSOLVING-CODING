def diagonal_elements(arr):
    # Code here
    ans=[]
    for i in range(0,len(arr)):
        for j in range(0,len(arr)):
            if i==j:
                # print(arr[i][j])
                ans.append(int(arr[i][j]))
    num=np.array(ans)
    return num