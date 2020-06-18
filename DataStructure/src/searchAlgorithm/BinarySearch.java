package searchAlgorithm;
import java.util.*;

public class BinarySearch {

	public static int binarySearch(int[] array, int key) {
		int mid=array.length/2;
		System.out.println(mid);
		if(key>array[mid]) {
			for(int i=mid; i<array.length; i++) {
				if(array[i]==key) {
					return i;
				}
			}
			return -1;
		}
		else{
			for(int i=mid; i>=0; i--) {
				if(array[i]==key) {
					return i;
				}
			}
			return -1;
		}
	}
	public static void main(String[] args) {
	
		int[] array= {6,4,3,2,1,3,8,9};
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 값을 입력해주세요. ");
		int key=sc.nextInt();
		System.out.println();
		Arrays.sort(array);
		int result=binarySearch(array, key);
		if(result==-1) {
			System.out.println("검색하고자하는 값이 없습니다.");
		}else {
			System.out.println("찾고자하는"+key+"값의 위치는  "+(result+1)+"입니다.");
		}
		
	}

}
