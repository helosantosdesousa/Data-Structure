package stack;

public class String_Stack {
    private int N = 6;
    private String values[] = new String[N];
    private int top;

    public void init(){
        top =-1;
    }
    public String top(){
        return values[top];
    }
    public void push(String data){
        if (isFull()){
            System.out.println("Stack Overflow");
        } else{
            top++;
            values[top] = data;
        }

    }
    public String pop(){
        String e = values[top];
        top--;
        return e;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (top==N-1);
    }
}
