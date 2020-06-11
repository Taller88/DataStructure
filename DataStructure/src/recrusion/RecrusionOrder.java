package recrusion;

public class RecrusionOrder {

	public static void recrusion2(int n) {
		if(n==1) {
			System.out.println("현재 n의 값: "+1);
			return;
		}else {
			recrusion2(n-1);
			System.out.println("현재 n의 값:"+n);
			
		}
		
	}
	public static void main(String []args) {
		recrusion2(5);
	}
}
