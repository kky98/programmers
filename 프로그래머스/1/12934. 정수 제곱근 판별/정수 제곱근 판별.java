import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = -1;

        for (long i = 1; i <= n; i++) {
            long a = i * i;
            if (n == a) {
                answer = (i + 1) * (i + 1);
                break;  
            }
        }
        return answer;
    }
}
