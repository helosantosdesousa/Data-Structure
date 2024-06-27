package listaFIAP.conversor;

import listaFIAP.stacks.Stack_Int;

import java.util.Scanner;

public class Decimal {
    /* a = num^2
    [i] = a*i
    * */
    public static void main(String[] args) {
        String binary;
        Scanner e = new Scanner(System.in);
        Stack_Int s = new Stack_Int();

        System.out.println("Insert number: ");
        binary = e.next();

        //convert binary string to a char array
        char array[] = binary.toCharArray();
        for (int i = 0; i < array.length; i++) {
            s.push(array[i]);
        }
        //a -> quantidade de numeros
        int a=0;
        int sum=0;
        while (!s.isEmpty()){
           // System.out.println(a);
            //s.pop();
            char bitChar = (char) s.pop();
            int bit = bitChar - '0';
            //System.out.print(bit);
           int r = (int) Math.pow(2, a);
           //System.out.println("square" + r);
            sum = r*bit+sum;

            a++;
        }
        System.out.println("Converted number: " + sum);
    }
}
