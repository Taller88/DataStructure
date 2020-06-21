package ds.sort.heapSorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MinHeap {

	public static class minHeap{
		private ArrayList<Integer> heap;
		
		public minHeap() {
			heap=new ArrayList<>();
			heap.add(0);//0번째 인덱스를 쓰지 않기 위해서
		}
		public void insert(int val) {
			heap.add(val);
			int cIndex=heap.size()-1;
		
			while(cIndex>1 && heap.get(cIndex)<heap.get(cIndex/2)) {
				//'cIndex>1'는 그래프를 만들때 첫번째의 값이면 힙 정렬을 해줄 필요가 없음 
				//heap.get(cIndex)<heap.get(cIndex/2) - 현재 넣어준 값이 부모노드의 값보다 작으면 swap!
				int tmp=heap.get(cIndex);
				heap.set(cIndex,heap.get(cIndex/2));
				heap.set(cIndex/2,tmp);
				
				cIndex=cIndex/2;
				//현재 바뀐 노드의 부모가 현재 노드보다 작을시 다시 반복을 통해 바꿔준다. 
				
			}//while
			
		}//insert
		public int delete() {
			if(heap.size()-1<1) {
				return 0;
			}
			
			int deleteItem=heap.get(1);
			
			heap.set(1,heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			
			//이 밑에서는 현재 root노드와 가장 밑에 있는 자식노드를 바꿨기 때문에 현재 root노드의 적절한 위치를 찾아주기 위한 과정
			int pos=1;
			while((pos*2)<heap.size()) {//pos노드가 끝 노드인지 Check 
				int min=heap.get(pos*2);
				int minPos=pos*2;
				if((pos*2)+1 <heap.size() && min>heap.get((pos*2)+1)) {
					min=heap.get((pos*2)+1);
					minPos=heap.get((pos*2)+1);
				}
				if(heap.get(pos)<min) {
					break;
				}
				
				int tmp=heap.get(pos);
				heap.set(pos,min);
				heap.set(minPos, tmp);
				pos= minPos;
			}
			
			return deleteItem;
		}
	}//minHeap Class
	
	
	
	public static void main(String []args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		minHeap heap=new minHeap();
		try {
			int cnt=Integer.parseInt(br.readLine());
			for(int i=0; i<cnt;i++) {
				int val=Integer.parseInt(br.readLine());
				if(val==0) {
					System.out.println(heap.delete());
				}else {
					heap.insert(val);
				}
			}
			
			
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
