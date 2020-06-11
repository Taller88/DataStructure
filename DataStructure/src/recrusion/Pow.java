package recrusion;

public class Pow {

	public static int power(int x, int n) {
		System.out.println(x+"*");
		if(n==0) {
			return 1;
		}
		
		return x*power(x, n-1); 
	}
	
	
	public static void main(String[]args) {
		System.out.println(power(4,3));
	}
}
