public class Converter {
    public static void main(String[] args) {
    int num = 172;
    Stack s = new Stack();

    int remainder;

    //A pilha é pra armazenar os >RESTOS<

// FASE 1 --> EMPILHAR OS RESTOS
    while (num!=0){
        remainder = num % 2; //pega o resto da divisao deste numero por 2 (vale 0 ou 1)
        s.push(remainder); //armazeno na pilha
        num = num/2; //gero um novo numero, resultado da divisao por 2
    }

    //FASE 2 --> PRINT OS RESTOS
        while (!s.isEmpty()){
            remainder = s.pop();
            System.out.print(remainder);
        }
        System.out.println("\nTHE END");
    }
}

//(172)10 = (10101100)/2
//172 / 2
/*
remainder -- num
  0 86/2
  0 43/2
  0 21/2
  1  10/2
  0  5/2
  1  2/2
  0  1/2
  1   0*/
