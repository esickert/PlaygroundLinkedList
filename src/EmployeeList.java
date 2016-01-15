import java.util.*;

public class EmployeeList {
 // this tries to create a linked list of nodes. It doesn't work.!!!!!!!!!!!!!!!!!!!   
    private static int num = 0;

    static EmployeeConsoleView test = new EmployeeConsoleView();
    
        
    public void linkedList()    {       //LINKED LIST-NEED TO UNDERSTAND HOW THIS WORKS NODE TO NODE
        Node head, succeeding, tail;    //these nodes don't exist YET!!        
        head = new Node();              //initialize head
        test.setConsoleInput(head.worker);
        head.next = null;               //set pointer "next" to point to null
        System.out.println(head.worker + " line 9\n"); //worker of node head
        tail = head;                    //set tail to point to head???
        succeeding = new Node();        //initialize succeeding
        while (num < 2) {
            head.setNext(succeeding);   //set head next to point to succeeding, but the loop resets this back to head
            test.setConsoleInput(head.worker);
            System.out.print(head.worker + " ********************line 13\n");  //this is all fucked up!!!!!!!!!!!!!!!!
            test.setConsoleInput(succeeding.worker);
            succeeding.setNext(tail);
            System.out.println(succeeding.worker);
            tail = succeeding;
            System.out.println(tail.worker); 
            num++;
        }
        System.out.println(head.worker); //all you are doing is refilling head.worker!!!!

//        while (tail.next != null) {
//            ??????????????????????????????????????????????
//        }
    }       
}


