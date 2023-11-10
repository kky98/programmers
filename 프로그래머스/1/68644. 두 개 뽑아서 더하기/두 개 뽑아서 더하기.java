import java.util.*;
class Solution {
    public List solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> sum = new HashSet<>();
        for(int i =0 ;i<numbers.length;i++){
            for(int j =i+1 ;j<numbers.length;j++)
            sum.add(numbers[i]+numbers[j]);
        }
        List<Integer> li = new ArrayList<Integer>(sum);
        Collections.sort(li);

        return li;
    }
}