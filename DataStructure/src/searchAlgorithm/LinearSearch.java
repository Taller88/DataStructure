package searchAlgorithm;

import java.util.Scanner;

public class LinearSearch {

	public static int seqSearch(int array[], int key) {
		int i=0;
		while(true) {
			if(i==array.length) {
				return -1;
			}
		
			if(array[i]==key) {
				//1이면 true
				return i;
			}
			i++;
		}
	}
	public static int seqSearchFor(int array[], int key) {
		for(int i=0; i<array.length; i++) {
			if(array[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array= {6,4,3,2,1,3,8};
		Scanner sc=new Scanner(System.in);
		System.out.print("검색할 값을 입력해주세요. ");
		int key=sc.nextInt();
		System.out.println();
		int result=seqSearchFor(array, key);
		if(result!=-1) {
			System.out.println("검색하려는 값("+key+")의 위치는 "+(result+1)+" 입니다.");
		}else {
			System.out.println("검색하는 값이 없습니다. ");
		}

	}
}