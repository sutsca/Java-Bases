import java.util.Scanner;

public class _soma{
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
