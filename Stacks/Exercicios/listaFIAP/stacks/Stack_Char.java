package listaFIAP.stacks;

public class Stack_Char {
    private int N = 15;
    private char values[];
    private int top;

    public Stack_Char(){
        values = new char[N];
        top=-1;
    }

    public void push(char data){
        top++;
        values[top] = data;
    }
    public char pop(){
        char elem = values[top];
        top--;
        return elem;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
}
