package Data_Structures;

public class LinkedList {

    Node head;

    public static void main(String[] args) {

        LinkedList nums = new LinkedList();

        nums.add(5);
        nums.add(9);
        nums.add(6);

        nums.addFirst(7);

        nums.delete(9);

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

    public void addFirst(int data){

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printValues(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void delete(int data){

        Node current = head;

        while(current.next != null && current.next.getData() != data){
            current = current.next;
        }

        if(current.next != null){
            current.next = current.next.next;
        }else{
            System.out.println("The value specified does not exist in the LinkedList.");
        }
    }

}

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    }
    public int getData(){
        return data;
    }
}
