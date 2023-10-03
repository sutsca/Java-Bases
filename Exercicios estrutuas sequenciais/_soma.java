import java.util.Scanner;

public class _soma{
    /*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
     mensagem explicativa */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int a;
     int b;
     int soma;

     a = sc.nextInt();
     b = sc.nextInt();
     soma = a + b;

     System.out.println("Soma = " + soma );

     sc.close();

    }
}
