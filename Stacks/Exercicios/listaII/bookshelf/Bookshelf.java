package listaII.bookshelf;
import listaII.ex02.StackString;

public class Bookshelf {
    public static void main(String[] args) {
        StackString s = new StackString();
        StackString nova = new StackString();

        s.push("Memorias Postumas");
        s.push("O cortiço");
        s.push("Orgulho e preconeito");

        System.out.println("Livros disponíveis: ");
        System.out.println("");

        //aqui os livros decrescem
        while (!s.isEmpty()){
           // System.out.println(s.pop());
            nova.push(s.pop());
        }

        //aqui crescem
        System.out.println("Nova pilha: ");
        System.out.println(" ");

        while (!nova.isEmpty()){
            System.out.println(nova.pop());
        }


    }
}
