def solution(my_string, alp):
    answer = ''
    for s in my_string:
        
        if s==alp:
            answer+=s.upper()
        else:
            answer+=s
    return answer