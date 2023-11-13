import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i =0; i<10;i++){
        map.put(i,0);
            }
        
        for(int num:numbers){
            map.put(num,1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                answer += entry.getKey();
            }
        }
        
        return answer;
    }
}