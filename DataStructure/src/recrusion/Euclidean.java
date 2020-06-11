package recrusion;

public class Euclidean {

	public static int gcd(int x, int y) {
		System.out.println("x: "+x+" y: "+y+"의 최대공약수 구하기");
		if(x%y==0) {
			return y;
		}
		if(y==1) {
			return 1;
		}
		return gcd(y,x%y);
	}
	
	public static void main(String[]args) {
		System.out.println(gcd(13,7));
	}
}
