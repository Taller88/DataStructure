package recrusion;

public class CountDown {

	public static void countDown(int n) {
		
		System.out.println("남은 시간: "+n);
		if(n==0) {
			System.out.println("Boom!!!!");
			return;
		}
		
		countDown(n-1);
		
	}
	
	public static void main(String []args) {
		countDown(5);
	}
}
