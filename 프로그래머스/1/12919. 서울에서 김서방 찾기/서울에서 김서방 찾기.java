class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int n = 0;
        for(String s:seoul){
            
            if(s.equals("Kim"))
                answer="김서방은 "+n+"에 있다";
            n++;
        }
        return answer;
    }
}