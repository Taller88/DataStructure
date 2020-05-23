package recrusion;

public class Fibonachi {
	//recrusion으로 풀지 말라고 해서 확인차 재귀함수로 풀어봤지만 역시나 '시간초과'
	
	//다른 방법을 알아보자
	static int sum=0;
    public static int recrusion(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
         sum=recrusion(n-1)+recrusion(n-2);
        return sum%=1234567;
        
             
    }
    
    public int solution(int n) {
        int answer = 0;
        answer=recrusion(n);
        return answer;
    }
}
