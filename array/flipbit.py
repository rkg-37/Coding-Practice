def flipBits(arr, n): 
    curr_max=0
    max_diff=0
    one=0
    for i in range(n):
        if arr[i]==1:
            one=one+1

        if arr[i]==1:
            val=-1
        else:
            val=1
        
        curr_max = max(val,curr_max+val)
        max_diff = max(max_diff,curr_max)

    max_diff = max(0,max_diff)
    print(max_diff+one)

flipBits([1, 0 ,0 ,1, 0],5)