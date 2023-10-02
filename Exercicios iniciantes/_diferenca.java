  import java.util.Locale;
import java.util.Scanner;
  
  public class _diferenca {
    public static void main(String[] args) {
        /*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
        Scanner sc = new Scanner(System.in);

        int a,b,c,d,diferença;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        diferença = (a * b - c * d);
        System.out.println("Diferença de: " + diferença);


        sc.close();
    }
}