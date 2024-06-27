package listaII.parenthesis;

import listaII.ex02.StackString;

public class Parenthesis {
    public static void main(String[] args) {
        StackString s = new StackString();

        //adiciona o 1
        s.push("(");
        //adiciona o 2
        s.push(")");

        //ver o top e o ultimo

            if (s.peek().equals(s.last())){
                System.out.println("Parenteses balanceados");
            } else {
                System.out.println("Parenteses nao balanceados");
            }

    }
}
