import java.util.Scanner;
  import java.util.Locale;
  
  public class _bases {
    public static void main(String[] args) {


       /* Notas
       
       Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
       mostre:
       a) a área do triângulo retângulo que tem A por base e C por altura. 
       b) a área do círculo de raio C. (pi = 3.14159)
       c) a área do trapézio que tem A e B por bases e C por altura.
       d) a área do quadrado que tem lado B.
       e) a área do retângulo que tem lados A e B. 


       formulas¹

       a) Área = (A * C) / 2  
       Nessa fórmula, "A" representa a base do triângulo e "C"
       representa a altura do triângulo. Ao multiplicar a base pela altura e dividir o resultado por 2, 
       você obterá a área do triângulo retângulo. Certifique-se de que os valores de "A" e "C" 
       estejam em unidades compatíveis (por exemplo, metros, centímetros, etc.) para que a área seja expressa na unidade correta.

       b) Área = π * C^2

       c) Área = ((A + B) * C) / 2
      

       *o que é dupla precisao?

       Isso significa que você deve escrever um programa em Java que será capaz de receber como entrada três números reais (valores de ponto flutuante de dupla precisão)
       e armazená-los nas variáveis A, B e C. Em Java, você pode usar um objeto Scanner para ler a entrada do usuário ou ler valores de um arquivo, 
       dependendo de como você deseja obter esses números.
       
       Fim notas
       */


      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);
      
      double A,B,C;
      double areaT,areaC,areaTrap,areaQ,areaR;
      double pi = 3.14159;

      System.out.print("Digite o valor de A: ");
      A = sc.nextDouble();
      System.out.print("Digite o valor de B: ");
      B = sc.nextDouble();
      System.out.print("Digite o valor de C: ");
      C = sc.nextDouble();

       //formulas
       areaT = (A * C) / 2;
       areaC = pi * (Math.pow(C,2));
       areaTrap = (A * B) * Math.pow(C,2);
       areaQ = B * 4;
       areaR = A * C;

       System.out.printf("Triangulo: %.3f %n Circulo: %.3f %n Trapézio: %.3f %n Quadrado: %.3f %n Retangulo: %.3f %n", areaT, areaC, areaTrap, areaQ, areaR);

       




      

      


        sc.close();
    }
}