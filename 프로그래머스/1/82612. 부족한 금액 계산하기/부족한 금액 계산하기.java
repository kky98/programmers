import java.util.*;
class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long sum =0;
        for(int i =1; i<count+1;i++){
            sum +=price*i;
            
        }
        if(sum>=money){
            answer = sum-money;
        }else{
        answer = 0 ;    
        }
         
        return answer;
    }
}