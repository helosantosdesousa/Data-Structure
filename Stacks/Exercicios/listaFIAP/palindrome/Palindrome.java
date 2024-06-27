package listaFIAP.palindrome;

import listaFIAP.stacks.Stack_Char;

import java.util.Scanner;

/*.Escreva um programa que use a pilha de inteiros positivos para verificar se a sequência digitada é um palíndromo.  O programa deve inserir valor inteiro na pilha enquanto não for digitado um valor negativo.
   Exemplos de palíndromos: 1221, 02022020, 1001, etc.*/
/*string -> array
array -> pilha
tira da pilha e se string.equals(pilha) ok!
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        Stack_Char s = new Stack_Char();

        System.out.println("------ PALINDROME CHECKER ------");
        System.out.println("Insert a word: ");
        String word = e.next().toLowerCase();

        char wordArray[] = word.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
           s.push(wordArray[i]);
        }

        //reversed
        String reversed = "";
        while (!s.isEmpty()){
            reversed = reversed+s.pop();
        }


        if(verifyPalindrome(word, reversed)){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
    public static boolean verifyPalindrome(String word, String reversed){
        if (word.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }
}
