def solution(n, m, section):
    answer = 0
    arr={}
    for a in range(1,n+1):
        arr[a]=1
    for se in section:
        arr[se]=0
    
    for k in arr.keys():
        if arr.get(k)==0:
            a=k+m
            if a>n:
                a=n+1
            for num in range(k,a):
                arr[num]=1
                
            answer+=1
        
            
    return answer