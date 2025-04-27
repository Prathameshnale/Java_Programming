/*

ArrayList - ArrayList is a dynamic array implementation in java. (automatically resize the array)
          - Maintain order
          - Random access
          - Null element allowed
          - Non-synchornized (not thread safe, in case of multiple thread not safe)

Declaration ->      ArrayList<dataType> name = new ArrayList<dataType>();
        e.g ->      ArrayLits<Employee> employeeList = new AraryList<Employee>();



    -In case of array, at the declaration time we declare the size of array. and once we declared the size and
     in case we want to change the size of array then we need to redeclared the array mannualy. and in array we do not
     have any pre-defined method like arrayList to use of array. So arrayList can dynamically resize the arrayList and 
     it has pre-defined methods to easy access/manipulate the element in arrayList.



*/

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args){
        
        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Prathamesh");     //add element at last
        nameList.add(1,"Digvijay");     //add element at specific index
        System.out.println("nameList after add() - "+nameList);

        ArrayList<String> newNameList = new ArrayList<String>();
            newNameList.add("Pranav");
            newNameList.add("Pratik");
            newNameList.add("Prathamesh");

        //nameList.addAll(newNameList);      //it will add newNameList at the end of nameList
        nameList.addAll(1,newNameList);     //it will add newNameList at given index 
        System.out.println("nmaeList after addAll() -> "+nameList);


        nameList.set(2,"Prasad");   //set/change element at given index
        System.out.println("nameList after set() element at index 2 - "+nameList);


        System.out.println("access specific index - "+nameList.indexOf("Prasad"));      //access index where "prasad" is present
        System.out.println("access last index - "+nameList.lastIndexOf("Prasad"));       //access last index of nameList


        // nameList.remove("Pranav");
        System.out.println("remove based on value - "+nameList.remove(String.valueOf("Pranav")));

        System.out.println("nameList after remove 'Pranav' - "+nameList);       //remove specific element from arraylist

        System.out.println("nameList before removeAll - "+nameList);
        System.out.println("nameList while removing another arraylist - "+nameList.removeAll(newNameList));      //remove arraylist form arraylist
        System.out.println("nameList after removeAll - "+nameList);

        nameList.clear();
        System.out.println("nameList after clear - "+nameList);

        nameList.add("Rushikesh");
        nameList.add("Arjun");
        nameList.add("Swapnil");

        System.out.println("get element from specific index - "+nameList.get(1));

        System.out.println("contains - "+nameList.contains("Swapnil"));     //it will check "Swapnil" is present in nameList

        nameList.add("Sourabh");
        nameList.add("Ashish");


        //Iterating arrayList 

        // 1. for loop
        
        System.out.println("iterating using for loop");
        for(int i=0; i<nameList.size(); i++){
            System.out.println(nameList.get(i));
        }

        System.out.println("iterating using for each loop");
        for(String element:nameList){
            System.out.println(element);
        }

        System.out.println("iterating using Iterator");

        Iterator<String> itr = nameList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());

        }
    }
    
}
