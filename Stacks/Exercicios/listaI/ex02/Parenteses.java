package listaI.ex02;

import stack.String_Stack;

public class Parenteses {
    public static void main(String[] args) {
        verificaParentese();
    }
    public static boolean verificaParentese(){
        String_Stack s = new String_Stack();
        s.init();
        s.push("(");
        s.push("()");
        s.push("{}");

        while (!s.isEmpty()){
            if (s.top().equals("()")){
                System.out.println("Parentese balanceado");
                System.out.println("retirando...");
                s.pop();
                System.out.println("TOP:" + s.top() );
                return true;
            }
        }
        System.out.println("Fila vazia");
        return false;
    }

}
