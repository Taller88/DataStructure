package ds.sort.heapSorted;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

import ds.sort.heapSorted.MinHeap.minHeap;

public class PrioritySorted {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		minHeap heap=new minHeap();
		try {
			int cnt=Integer.parseInt(br.readLine());
			Queue<Integer> q=new PriorityQueue<Integer>();
			
			for(int i=0; i<cnt;i++) {
				int val=Integer.parseInt(br.readLine());
				if(val==0) {
					if(q.isEmpty()) {
						System.out.println(0);
					}else {
						System.out.println(q.poll());
						
					}
				}else {
					q.offer(val);
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
