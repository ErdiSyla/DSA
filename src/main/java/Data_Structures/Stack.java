package Data_Structures;

public class Stack {

    private int[] arr;
    int top;
    int size;

    public Stack(){
        arr = new int[5];
        size = arr.length;
        top = -1;
    }

    public static void main(String[] args) {
        Stack nums = new Stack();

        nums.push(10);
        nums.push(30);
        nums.push(50);
        System.out.println(nums.pop());
        nums.push(20);
        nums.push(70);
        nums.push(7021);

        nums.printStack();
    }

    public void push(int data){
        if(top < size){
            arr[++top] = data;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public void printStack(){
        for(int n: arr){
            System.out.print(n +" ");
        }
        System.out.println();
    }

    public int pop(){
        if(top > -1){
            return arr[top--];
        }else{
            System.out.println("Stack Underflow");
        }
        return 0;
    }

    public int peek(){
        return arr[top];
    }
}
