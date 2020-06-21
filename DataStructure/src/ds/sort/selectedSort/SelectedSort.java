package ds.sort.selectedSort;

public class SelectedSort {

	public static void swap(int[] arr, int x, int y) {
		int tmp=arr[x];
		arr[x]=arr[y];
		arr[y]=tmp;
		
	}
	public static void main(String[]args) {
		/**
		 * 단순 선택 정렬 
		 * - 가장 작은 요소부터 정렬하는 알고리즘 
		 * - 배열 값중 가장 작은 요소를 선택해서 맨 앞에 두고 맨 앞에 둔 요소를 제외한 배열에서 다시 최소값을 찾아 정렬하는 알고리즘
		 */
		int[] arr= {6,4,3,7,1,9,8};
		for(int i=0; i<arr.length; i++) {
			int min=10;
			int index=0;
			for(int j=i; j<arr.length; j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			swap(arr,index,i);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}
