package array;

public class Array05_reverse {

	public static int[] solution(int[] numbers) {
		int[] reverse=new int[numbers.length];
		int temp=0;
		for(int i=0; i<numbers.length; i++) {
			reverse[i]=numbers[numbers.length-1-i];
			
		}
		
		return reverse;
		
	}
	
	public static void main(String[] args) {
		int[] input={22,57,11,32,91,68,70};		
		int reverse[]=solution(input);
		for(int i=0; i<reverse.length; i++) {
			System.out.print(reverse[i]+",");
			}
	}

}
