import java.text.DecimalFormat;
//THIS IS NOT RIGHT!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class Node  {  //page 892 in Wu's book .pdf

// this is a node only. the "linklist" is a separate class

    Employee worker = new Employee();

    Node next; //  WHY  is "next" type Node??????? Wu's book page 892!!

    private int cnt = 0;

    public Node()   {                             //CONSTRUCTOR
//        this (setEmployee(worker));
        next = null;
        cnt++;
    }

    public Node(Employee worker, Node node)    {  //CONSTRUCTOR
        setEmployee(worker);
        setNext(node);
        cnt++;
    }
/******************************************************************************/
    public Node getNext()   {
        return next;
    }

    public Employee getEmployee()    {
        return worker;
    }
    
/******************************************************************************/
    public void setEmployee(Employee a) {   //this is not right!!!!!!!!!
        worker = a;
    } 
    
    public void setNext(Node node)  {
        next = node;
    }

    public int getCnt() {
        return cnt;
    }
}
