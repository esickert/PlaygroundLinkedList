//import java.util.*;
//THIS IS THE LINKED LIST CLASS
public class EmployeeList {
 // this tries to create a linked list of nodes. It doesn't work.!!!!!!!!!!!!!!!!!!!   
//    private static int num = 0;

    static EmployeeConsoleView test = new EmployeeConsoleView();
    
        
    public void linkedList()    {       //LINKED LIST-NEED TO UNDERSTAND HOW THIS WORKS NODE TO NODE
        Node head, succeeding, tail;    //these nodes don't exist YET!!        
        head = new Node();              //initialize head
        test.setConsoleInput(head.worker);
//        head.next = null;               //set pointer "next" to point to null
        System.out.println("head.worker is: \n" + head.worker); //worker of node head
        System.out.println("head.next is " + head.next + "\n");
//        tail = head;                    //set tail to point to head???
        succeeding = new Node();        //initialize succeeding
        test.setConsoleInput(succeeding.worker);
        System.out.println("\nThis is succeeding worker: \n" + succeeding.worker);   
        
/*        for(int i = 0; i <= 2; i++) {     //  04-05-16 COMMENTED OUT AS LOOP DOESN'T SEEM TO WORK!!
            head.setNext(succeeding);   //set head next to point to succeeding, but the loop resets this back to head
            test.setConsoleInput(head.worker);
            System.out.print(head.worker + " ********************line 13\n");  //THIS IS ALL FUCKED UP!!!!!!!!!!!!!!!
            test.setConsoleInput(succeeding.worker);
            succeeding.setNext(tail);
            System.out.println(succeeding.worker);
            tail = succeeding;
            System.out.println(tail.worker); 
            num++;
        }  */
//        System.out.println(head.worker + "head******************"); //all you are doing is overwriting head.worker!!!!
//        System.out.println(tail.worker + "tail**************");

//        while (tail.next != null) {
//           System.out.println(tail.worker); //??????THIS DOES NOT WORK!!!!!!!!!!!!!!!!!
}
    
    }       
//}


