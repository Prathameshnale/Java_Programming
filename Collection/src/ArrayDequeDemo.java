/*
  
 ArrrayDeque - ArrayDeque is class comes under Queue interface.
 		     - in ArrayDeque we can perform operations on both ends of the queue.
 		     
 ArrayDeque methods - offerFirst() 	//usually we add element in queue at end but this function will add at first
                      offerLast()   // it will add element in queue at end as we add usually in queue
                      offer()  //this function comes from queue interface that add element as usual at end of queue
                               // basically offerLast() and offer() works same
                           
                      peek(),peekFirst()  //both are same they will peek element from queue at start/front
                      peekLast()  //it will peek element from deque from end/last
                      
                      poll(),pollFirst()  //both are same they will remove element from deque at start/front
                      pollLast()   //this will remove element from deque at end/rare side.
                      
                      
                                 
                                
 Declaration  -  ArrayDeque<String> adName = new ArrayDeque<String>();
  
 */

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> adName = new ArrayDeque<String>();
		
		adName.offer("Prathamesh");
		adName.offer("Prasad");
		adName.offer("Rushikesh");
		
		System.out.println("adName = "+adName);			//[Prathamesh, Prasad, Rushikesh]
		
		adName.offerFirst("Digvijay");		//this will add "Digvijay" at the first in deque
		System.out.println("adName = "+adName);		//[Digvijay, Prathamesh, Prasad, Rushikesh]
		
		adName.offerLast("Arjun");		//this will add "Arjun" at the end in deque same like offer()
		System.out.println("adName = "+adName);		//[Digvijay, Prathamesh, Prasad, Rushikesh, Arjun]
			
		
		System.out.println("peek() = "+adName.peek()); 			//"Digvijay"
		System.out.println("peekFirst() = "+adName.peekFirst());  //"Digvijay"
		System.out.println("peekLast() ="+adName.peekLast());     //"Arjun"		
		
		
		adName.poll();	//this will remove element from deque  (i.e Digvijay)
		System.out.println("adName = "+adName);   // [Prathamesh, Prasad, Rushikesh, Arjun]
		
		adName.pollFirst();   //this will remove element from deque  (i.e Prathamesh)
		System.out.println("adName = "+adName);   // [Prasad, Rushikesh, Arjun]
		
		adName.pollLast(); 	//this will remove element from last/end  (i.e. Arjun)
		System.out.println("adName = "+adName);   // [Prasad, Rushikesh]
		
	}

}
