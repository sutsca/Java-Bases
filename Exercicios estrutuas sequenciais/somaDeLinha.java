import java.util.Scanner;
import java.util.Locale;

public class somaDeLinha {
    public static void main(String[] args) {
        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
      código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
       Locale.setDefault(Locale.US);

      Scanner sc = new Scanner(System.in);
     
      int codP1,codP2,numP1,numP2;
      double valorP1, valorP2, valorTot;

      System.out.print("Digite o codigo do primeiro produto: ");
      codP1 = sc.nextInt();
      System.out.print("Qual a quantidade que deseja comprar? ");
      numP1 = sc.nextInt();
      System.out.print("Qual o valor unitário do produto? ");
      valorP1 = sc.nextDouble();
      System.out.print("Digite o codigo do segundo produdo:");
      codP2 = sc.nextInt();
      System.out.print("Qual a quantidade que deseja comprar? ");
      numP2 = sc.nextInt();
      System.out.print("Qual o valor unitário do produto? ");
      valorP2 = sc.nextDouble();

      valorTot = ((numP1*valorP1)+(numP2*valorP2));

      System.out.printf("VALOR A PAGAR: R$ %.2f", valorTot);


        sc.close();
    }
  }
