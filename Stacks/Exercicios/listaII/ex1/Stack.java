package listaII.ex1;
/*Crie uma classe Pilha com as operações básicas de uma pilha: push, pop, peek e isEmpty.
*/
public class Stack {
    private final int N = 3;
    private int top;
    private int values[] = new int[N];
    public void init(){
        top=-1;
    }
    public int peek(){
        return values[top];
    }
    public void push(int data){
        top++;
        values[top] = data;
    }
    public int pop(){
        int p = values[top];
        top--;
        return p;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
}
