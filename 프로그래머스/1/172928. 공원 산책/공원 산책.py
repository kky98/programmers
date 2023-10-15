def solution(park, routes):
    # 시작점('S') 찾기
    x, y = 0, 0
    for row in range(len(park)):
        for col in range(len(park[row])):
            if park[row][col] == 'S':  # 시작 지점 'S'
                x, y = row, col
    
    # 이동 방향 정의
    op = {'N':(-1, 0), 'S':(1, 0), 'W':(0, -1), 'E':(0, 1)}
    
    # 이동
    for i in routes:
        dx, dy = op[i.split()[0]]  # op에서 해당 방향에 맞는 이동 값 dx, dy로 가져오기
        n = int(i.split()[1])  # 이동 횟수
        
        xx, yy = x, y  # n번의 이동 동안 변하는 좌표 저장 xx, yy
        canmove = True  # 이동할 수 있는 route인지 확인
        
        # n번 이동해보기
        for _ in range(n):
            nx = xx + dx  # 이동한 위치
            ny = yy + dy  # 이동한 위치
            
            # 공원 안에 있고, 장애물이 아니면 이동 가능(True)
            if 0 <= nx <= len(park)-1 and 0 <= ny <= len(park[0])-1 and park[nx][ny] != 'X':
                canmove = True
                xx, yy = nx, ny
            else:  # 공원을 벗어낫거나, 장애물이면 이동 불가(False)
                canmove = False
                break
                
        if canmove:  # 이동이 가능하면 위치 반영해주기
            x, y = nx, ny  
        
    return [x, y]