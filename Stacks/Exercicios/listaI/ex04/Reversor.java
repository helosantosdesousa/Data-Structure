package listaI.ex04;

import stack.String_Stack;

public class Reversor {
    public static void main(String[] args) {
        String_Stack s = new String_Stack();

        s.init();
        s.push("P");
        s.push("I");
        s.push("L");
        s.push("H");
        s.push("A");

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }





    }
}
