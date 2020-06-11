package recrusion;

/**
 * Fibonachi
 * @author user
 *  1,1,2,3,5,8.....
 *
 *
 *
 */
public class Fibonachi2 {
	/**
	 * n까지의 피보나치수열 값 구하는 메서드
	 * @param n
	 * @return
	 */
	public static int solution(int n) {
		System.out.println(n);
		
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return 1;
		}
		
		return solution(n-2)+solution(n-1);
	}
	
	public static void main(String[]args) {
		System.out.print("Result: ");
		System.out.println(solution(5));
	}
}
