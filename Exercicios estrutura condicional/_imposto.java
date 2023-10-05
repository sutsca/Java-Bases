import java.util.Locale;
import java.util.Scanner;
  
  public class _imposto {
    public static void main(String[] args) {

        /* 
          Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
          que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
          qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
          Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
          mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.

          * de 0.00 a 2000.00  = isento
          * de 2000.01 a 3000.00 = 8%
          * de 3000.01 a 3000.00 = 18%
          * acima de 4500.00 = 28%

          Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
          salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
          de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
          duas casas decimais.
         
        */
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.print("Digite um número: ");
        salario = sc.nextDouble();

        

         if (salario >= 0.00  && salario <= 2000.00){

            imposto = 0.0;
            
            } else if (salario <= 3000.00) {
                imposto = (salario - 2000.00) * 0.08;

                    } else if (salario <= 4500.00) {
                      imposto = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);

                        } else {
                         imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);

                            } if (imposto > 0.0) {
                              System.out.printf("Imposto de Renda: R$ %.2f%n", imposto);

                                } else {
                                  System.out.println("Isento de Imposto de Renda");
                                    }

        sc.close();
    }
}






