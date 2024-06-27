package listaFIAP.conversor;
import listaFIAP.stacks.Stack_Int;

import java.util.Scanner;
//2.Construa um programa principal que converta um número representado em decimal em binário.
// Use as funções já implementadas de pilha de inteiros.

/*
10/2
resto  total/2

num/2, armazena o resto (em um vetor) e o total/2
* */
public class Binary {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        Stack_Int s = new Stack_Int();

        int num;
        int remainder;

        System.out.print("Insert number: ");
        num = e.nextInt();

        while (num!=0){
            remainder = num%2;
            s.push(remainder);
            num = num/2;
        }

        System.out.println("Converted number: ");
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
    }

}
