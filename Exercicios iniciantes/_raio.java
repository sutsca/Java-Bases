  import java.util.Locale;
import java.util.Scanner;
  
  public class _raio {
    public static void main(String[] args){
         /*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    casas decimais conforme exemplos.
    Fórmula da área: area = π . raio2 (ao quadrado)
    Considere o valor de π = 3.14159 */

    Scanner sc = new Scanner(System.in);

    double x, area, raio;
    Locale.setDefault(Locale.US);

    x = sc.nextDouble();
    raio = Math.pow(x, 2);
    area = (3.14159 * raio);

    System.out.printf("Area = %.4f%n", area);

    

    sc.close();

    }
  
   



    
}
