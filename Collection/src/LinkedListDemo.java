/*
 
LinkedList - LinkedList is also implements Queue interface
           - LinkedList present under both interface List and Queue (but it works same)

Declaration  of LinkedList as Queue -  Queue<dataType> queueName = new LinkedList<dataType>();
                               e.g. -  Queue<String> nameQueue = new LinkedList<String>();

Declaration of LinkedList as List - List<dataType> nameList = new LinkedList<dataType>();
                             e.g. - List<String> nameList = new LinkedList<String>();

 
 */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListDemo {
    
    public static void main(String[] args){

        Queue<String> nameQueue = new LinkedList<String>();

        //System.out.println("remove() - "+nameQueue.remove());     //it will throw exception because of null Queue
        System.out.println("poll() - "+nameQueue.poll());         // it returns null
        //System.out.println("element() = "+nameQueue.element());   //it will throw exception for null queue
        System.out.println("peek() - "+nameQueue.peek());    // it returns null

        nameQueue.offer("prathamesh");
        nameQueue.offer("digvijay");
        nameQueue.offer("Rushikesh");

        System.out.println("nameQueue = "+nameQueue);

        nameQueue.add("pranav");
        nameQueue.add("pratik");

        System.out.println("nameQueue = "+nameQueue);

        System.out.println("poll() = "+nameQueue.poll());    //it will remove head element i.e "prathamesh" from queue and return "prathamesh"
        System.out.println("nameQueue = "+nameQueue);
        System.out.println("add() - "+nameQueue.add("arjun"));   // it will add element at rear end and return true
        System.out.println("nameQueue = "+nameQueue);
        System.out.println("remove() = "+nameQueue.remove());     //it will also remove element from front i.e digvijay and returns it
        System.out.println("nameQueue = "+nameQueue);


System.out.println("--------------------------------------------------------------------------");

        List<String> nameList = new LinkedList<String>();
        System.out.println("remove() - "+ nameList.remove(""));         // it returns false
        //System.out.println("get() - "+nameList.get(1));    // it will show exception

        nameList.add("prathamesh");
        nameList.add("digvijay");
        nameList.add("Rushikesh");

        System.out.println("nameList = "+nameList);

        nameList.add("pranav");
        nameList.add("pratik");

        System.out.println("nameList = "+nameList);

        System.out.println("remove() = "+nameList.remove("pranav"));    //it will remove pranav
        System.out.println("nameList = "+nameList);
        System.out.println("add() - "+nameList.add("arjun"));   // it will add element at rear end and return true
        System.out.println("nameList = "+nameList);
        System.out.println("remove() = "+nameList.remove("prathamesh"));     //it will also remove "prathamesh"
        System.out.println("nameList = "+nameList);

    }
}
