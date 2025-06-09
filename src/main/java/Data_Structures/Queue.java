package Data_Structures;

public class Queue {

    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] arr = new int[4];
    public static void main(String[] args) {

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(5);
        queue.enqueue(90);

        System.out.println(queue.dequeue());

        queue.enqueue(32);
        queue.enqueue(55);
        System.out.println("Peek: " + queue.peek());

        queue.show();

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }

    public void enqueue(int data){
        if(!isFull()) {
            rear = (rear + 1) % 4;
            arr[rear] = data;
            size++;
        }else{
            System.out.println("Queue is Full.");
        }
    }

    public int dequeue(){
        if(!isEmpty()){
            int data = arr[front];
            front = (front + 1) %4;
            size--;
            return data;
        }else{
            System.out.println("Queue is Empty.");
        }
        return 0;
    }

    public int peek(){
        if(!isEmpty()) {
            System.out.println("Queue is Empty.");
        }

        return arr[front];
    }

    public boolean isFull(){
        return size==4;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void show(){
        for(int i = front; i <= size; i++){
            System.out.print(arr[i % 4] + " ");
        }
        System.out.println();
    }
}
