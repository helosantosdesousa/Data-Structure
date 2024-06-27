package listaI.ex01;
import stack.String_Stack;

public class Books {
    public static void main(String[] args) {
        String_Stack stack = new String_Stack();
        stack.init();
        stack.push("Os sete maridos");
        stack.push("Orgulho e preconceito");
        stack.push("A seleção");
        if (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.push("Memórias póstumas de Brás Cubas");
        if (!stack.isEmpty()){
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
        System.out.println("TOP: " + stack.top());
    }

}
