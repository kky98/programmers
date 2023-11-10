class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int l = 10;
        int r = 12;
        
        for(int i =0; i<numbers.length;i++){
        int n = numbers[i];
            
            if( n == 1 || n == 4 || n==7){
                l=n;
                answer+="L";
                
            }
            if(n==3||n==6||n==9){
                 r=n;
                answer+="R";
               
            }
            if(n == 2 || n == 5 || n == 8 || n == 0){
                if(n == 0){
                    n=11;
                }
                
                int ld =((Math.abs(l-n)/3)+(Math.abs(l-n)%3));
                int rd =((Math.abs(r-n)/3)+(Math.abs(r-n)%3));
                if(ld == rd){
                    if(hand.equals("right")){
                      answer+="R";
                    r=n;     
                    }else{
                        answer+="L";
                    l=n;
                    }
                    
                }else if (ld<rd){
                     l=n;  
                    answer+="L";
                    
                }else{
                    r=n;
                    answer+="R";
                       
                }
            }
        }
        return answer;
    }
}