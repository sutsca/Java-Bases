import java.util.Scanner;
  
  public class _positNegativ {
    public static void main(String[] args) {

        /*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. */

        Scanner sc = new Scanner(System.in);

        int A;

        System.out.print("Digite um número: ");
        A = sc.nextInt();

        if (A > 0){

            System.out.println("Numero positivo");
        } else {

            System.out.println("Numero negativo");

        }

        sc.close();
    }
}