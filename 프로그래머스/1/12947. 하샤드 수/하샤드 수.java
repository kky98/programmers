class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x1 = x;
        int sum=0;
        while(x1>0){
            sum+=x1%10;
            x1=x1/10;
        }
        if(x%sum == 0){
            answer=true;
        }else{
            answer = false;
        }
        return answer;
    }
}