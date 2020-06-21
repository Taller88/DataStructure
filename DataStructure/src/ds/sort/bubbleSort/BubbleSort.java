package ds.sort.bubbleSort;

public class BubbleSort {
	public static void swap(int[] arr,int x, int y) {
		int tmp=arr[x];
		arr[x]=arr[y];
		arr[y]=tmp;
	}
	
	public static void main(String[] args) {
		int[] arr= {6,4,3,7,1,9,8};
		for(int i=0; i<arr.length; i++) {
			for(int j=arr.length-i-1; j>i; j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
