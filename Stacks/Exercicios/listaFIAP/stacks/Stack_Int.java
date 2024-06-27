package listaFIAP.stacks;

public class Stack_Int {
    private final int N = 15;
    private int values[] = new int[N];
    private int top;

    public Stack_Int(){
        top=-1;
    }
    public int top(){
      return values[top];
    }
    public void push(int data){
        top++;
        values[top] = data;
    }
    public int pop(){
        int x = values[top];
        top--;
        return x;
    }
    public boolean isEmpty(){
        return (top==-1);
    }

}
