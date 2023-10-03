import java.util.Scanner;
  
  public class _parImpar {
    public static void main(String[] args) {

        /* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar. 

           *usamos o operador % (módulo) para calcular o resto da divisão de numero por 2. Se o resultado for 0, 
            o número é par; caso contrário, é ímpar. Em seguida, exibimos a mensagem apropriada com base no resultado da verificação.
         
        */

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0){

            System.out.println("Numero par");
        } else {

            System.out.println("Numero ímpar");

        }

        sc.close();
    }
}