/*
Stack - Stack class also implements the List-collection interface
      - Stack follows Last-In-First-Out approch     (recently added element will be removed first)
      

declaration - Stack<datatype> stackName = new Stack<datatype>();
       e.g  - Stack<String> nameStack = new Stack<String>();
       

methods - push()  //to add elements
          pop()    // to remove element
          peek()   //to find the element at the top of the stack without removing it
          search()   // to search element from the stack
 
 */

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args){

        Stack<String> nameStack = new Stack<String>();

        System.out.println("after declare nameStack - "+nameStack);

        nameStack.push("Lion");   //to add element in Stack 
        nameStack.push(("Tiger"));
        nameStack.push("Elephant");
        nameStack.push("Zebra");

        //after above 4 push operations, the top element will be "Zebra"  and last (bottom) element will be "Lion";
        //now if we perform pop() operation then top element i.e "Zebra" will be remove from nameStack

        System.out.println("nameStack after push() - "+nameStack);

        nameStack.pop();    //it will remove top element i.e "Zebra"  and "Elephant" become the top element of nameStack
        System.out.println("nameStack after pop() -"+nameStack);

        System.out.println("peek() operation - "+nameStack.peek());     //it will return the top element from stack i.e "Elephant"


        System.out.println("search() opearation - "+nameStack.search("Lion"));   //it will give actuall position from the top i.e 3
    }
    
}
