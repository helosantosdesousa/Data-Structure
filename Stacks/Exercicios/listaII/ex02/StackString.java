package listaII.ex02;
/*Crie uma classe Pilha com as operações básicas de uma pilha: push, pop, peek e isEmpty.
*/
public class StackString {
    private final int N = 20;
    private int top;
    private String values[];
    public StackString(){
        values = new String[N];
        init();
    }
    public void init(){
        top=-1;
    }
    public String peek(){
        return values[top];
    }
    public String last(){
        return values[0];
    }
    public void push(String data){
        top++;
        values[top] = data;
    }
    public String pop(){
        String p = values[top];
        top--;
        return p;
    }
    public boolean isEmpty(){
        return (top==-1);
    }
}
