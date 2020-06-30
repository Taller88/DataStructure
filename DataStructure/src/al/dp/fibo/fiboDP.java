package al.dp.fibo;
/**
 * 
 * @author user
 * DP(Dynamic Programming) 
 * 그리디 알고리즘 설계 기법과 같이 최적화 문제를 해결하는 알고리즘 설계 기법 
 * 먼저 입력 크기가 작은 부분 문제들을 모두 해결한 후에 그 해들을 이용하여 보다 큰 크기의 부분 문제들을 해결 
 * 최종적으로 원한 주어진 입력의 문제를 해결 
 * 
 * 정의: 하나의 문제는 단 한번만 풀도록 하는 알고리즘 
 * 		한 번 푼 것을 여러 번 다시 푸는 비효율적인 알고리즘을 개선하는 방법
 * 
 * 핵심: Memoization 
 * 		기존에 이미 구한 값은 배열에 저장해서 구할 필요가 있을 때 활용하는 기법 
 * 
 */

public class fiboDP {

	public static int fiboDP(int x) {
		
		int[] d=new int[x+1];//Memoization 할 변수
				
		d[0]=1;
		d[1]=1;
		
		if(x==1) {
			return 1;
		}
		if(x==2) {
			return 1;
		}
		if(d[x]!=0) {
			return d[x];
		}
		
		return fiboDP(x-1)+fiboDP(x-2);
	}
	
	
	public static void main(String []args) {
		System.out.println(fiboDP(30));
	}
}
