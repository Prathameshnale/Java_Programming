/*

Priority Queue - Priority queue is class comes under the queue interface.
               - In Priority Queue order of element is set based on the priority(algorithum)
               - by default highest priority of priority Queue is ascending order
                e.g let us cosider we offer 4 elements in priorityqueue and now we want to pull,peek element from
                    priorityQueue then, element will be pull,peek which has highest priority. so by default 
                    priority of priorityQueue is ascending order so the smallest digit element will be cosider for pull or peek


declaration -    Queue<datatype> priorityQueueName = new PriorityQueue<datatype>();
        e.g -    Queue<Integer> pQueue = new PriorityQueue<Integer>();

*/

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    
    public static void main(String[] args){

        Queue<Integer> pQueue = new PriorityQueue<Integer>();

        pQueue.offer(40);
        pQueue.offer(12);
        pQueue.offer(24);
        pQueue.offer(36);

        System.out.println("pQueue = "+pQueue);  // [12, 36, 24, 40]  here we can see output, by default priority is set
        								// to the smallest element in queue (no matter of order of further element in queue)
        									//it means now if we perform the 
                                            //pull or peek operation the will done on the element 12 i.e. high priority
        
        System.out.println("peek() = "+pQueue.peek());   
        System.out.println("poll() = "+pQueue.poll());   //12 will be removed and then highest priority will be 24
        
        System.out.println("pQueue = "+pQueue);		//[24, 36, 40]
        
        pQueue.offer(5);		//since 5 is smallest, highest priority will set to 5
        System.out.println("pQueue = "+pQueue);  //[5, 24, 40, 36]
        
        
        //by default priority is set to the ascending order element. 
        
        
        
        
        //if we want to priority change to descending... then we need to declare priorityQueue as below
        
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>(Comparator.reverseOrder());  
        														//we need to set reverseOrder() method of comparator
        
        priorityQueue.offer(40);
        priorityQueue.offer(12);
        priorityQueue.offer(24);
        priorityQueue.offer(36);
        
		System.out.println("priorityQueue = " + priorityQueue); // [40, 36, 24, 12] here we can see output, priority is set
		// to the greater element in queue (no matter of order of further element in
		// queue)
		// it means now if we perform the
		// pull or peek operation the will done on the element 40 i.e. high priority

		System.out.println("peek() = " + priorityQueue.peek());
		System.out.println("poll() = " + priorityQueue.poll()); // 40 will be removed and then highest priority will be 36

		System.out.println("priorityQueue = " + priorityQueue); //[36, 12, 24]

		priorityQueue.offer(50); // since 50 is greater, highest priority will set to 50
		System.out.println("priorityQueue = " + priorityQueue); // [50, 36, 24, 12]

	}

}
