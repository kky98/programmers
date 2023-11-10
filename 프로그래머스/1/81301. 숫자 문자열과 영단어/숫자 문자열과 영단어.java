import java.util.*;
class Solution {
    public int solution(String s) {
        HashMap<String,String> nummap= new HashMap<String,String>(){
        {
            put("zero","0");
            put("one","1");
            put("two","2");
            put("three","3");
            put("four","4");
            put("five","5");
            put("six","6");
            put("seven","7");
            put("eight","8");
            put("nine","9");
           
            
        }
    };
        int answer = 0;
          for (String word : nummap.keySet()){
        s = s.replaceAll(word, nummap.get(word));
        }
        answer= Integer.parseInt(s);
        return answer;
    }
}