package listaFIAP.conversor;

import listaFIAP.stacks.Stack_Int;

import java.util.Scanner;

public class Converter {
    static Scanner e = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("------- TECH CONVERTER -------");
        System.out.println("Choose an option and write your number");
        System.out.println("1. Decimal -> Binary\n2. Binary -> Decimal");
        System.out.print("Option: ");
        int resp = e.nextInt();


        System.out.println("Insert number: ");
        String number = e.next();

            switch (resp){
                case 1:
                    convertToBinary(number);
                    break;
                case 2:
                    convertToDecimal(number);
                    break;
                default:
                    System.out.println("Invalid, try again!");
            }



    }
    public static void convertToBinary(String number){
        int num = Integer.parseInt(number);

        Stack_Int s = new Stack_Int();
        int remainder;

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
    public static void convertToDecimal(String number){
        Stack_Int s = new Stack_Int();

        //convert binary string to a char array
        char array[] = number.toCharArray();
        for (int i = 0; i < array.length; i++) {
            s.push(array[i]);
        }
        int a=0;
        int sum=0;
        while (!s.isEmpty()){
            char bitChar = (char) s.pop();
            int bit = bitChar - '0';
            int r = (int) Math.pow(2, a);
            sum = r*bit+sum;
            a++;
        }
        System.out.println("Converted number: " + sum);
    }
}
