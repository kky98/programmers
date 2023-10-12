def solution(balls, share):
    answer = 0
    n=1
    nm=1
    m=1
    for bn in range(1,balls+1):
        n*=bn
    for bn in range(1,balls-share+1):
        nm*=bn
    for bn in range(1,share+1):
        nm*=bn
    answer=n/(nm*m)
    return answer