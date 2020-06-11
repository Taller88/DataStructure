package recrusion;

public class Factorial {
	public static int factorial(int n) {
		int answer=n;
		String check=n+"*";
		System.out.print(check);
		if(answer==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void main(String[]args) {
		System.out.print("5!=");
		System.out.println("="+factorial(5));
	}
}
