import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer =0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<10;i++){
            map.put(i,0);
        }
        for(int num : numbers){
            map.put(num,1);
        }
        System.out.print(map.entrySet());
        for(Map.Entry<Integer,Integer> en :map.entrySet()){
            if(en.getValue()==0){
                answer+=en.getKey();
            }
        }
        return answer;
    }
}