package listaI.ex03;

import stack.Stack_Int;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Binário: ");
        converteBinario();
        //dá errado pq o proprio java faz confusao na hora de imprimir =(
        System.out.println("\nHexadecimal: ");
        converteOctal();
    }
    public static void converteBinario(){
        Stack_Int s = new Stack_Int();

        int num=10;
        int resto;

        s.init();
        //empilhar os restos
        while (num!=0){
            resto = num % 2;
            s.push(resto);
            num = num/2;
        }
        //printar os restos
        while (!s.isEmpty()){
            System.out.print(s.pop());        }
    }
    public static void converteOctal(){
        Stack_Int s = new Stack_Int();
        int num = 10 ;
        int resto;

        while (num!=0){
            resto = num % 8;
            s.push(resto);
            num = num/8;
        }
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
