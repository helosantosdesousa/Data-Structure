package stack;

public class Stack_Int {
    private final int N = 5;
    private int nums[] = new int[N];
    private int top;

    public void init(){
        top=-1;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("Stack Overflow !");
        } else {
            top++;
            nums[top] = data;
        }
    }
    public int pop(){
        int r = nums[top];
        top--;
        return r;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==N-1);
    }
}
