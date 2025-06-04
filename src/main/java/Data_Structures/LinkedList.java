package Data_Structures;

public class LinkedList {

    Node head;

    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(6);

        nums.printValues();
    }

    public void add(int data){
        Node newNode = new Node(data);

        Node current = head;
        if(head == null) {
            head = newNode;
        }else{
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printValues(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
}
