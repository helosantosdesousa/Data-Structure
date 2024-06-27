package listaII.ex02;

import java.util.Scanner;

//import listaII.ex1.StackString;
public class Palindrome {
static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        StackString s = new StackString();

        s.push("O");
        s.push("S");
        s.push("O");

        while (!s.isEmpty()){

        }
        StackString reverse = new StackString();
        while (!s.isEmpty()){
            reverse.push(s.pop());
        }



    }
}
