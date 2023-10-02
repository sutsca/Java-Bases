  import java.util.Locale;
import java.util.Scanner;
  
  public class _funcionarios {
    public static void main(String[] args) {
    /* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
    hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
    decimais.*/

    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int numeroFunc,horasTrab;
    double valorH,salario;

    numeroFunc = sc.nextInt();
    horasTrab = sc.nextInt();
    valorH = sc.nextDouble();

    //Você está usando %f para formatar o número do funcionário, mas como o número do funcionário é um valor inteiro, você deve usar %d para formatá-lo corretamente. 
    //Neste código usamos %d para formatar o número do funcionário como um número inteiro

    salario = (horasTrab*valorH);
    System.out.printf("Numero do funcionario = %d%nSalário = R$ %.2f%n", numeroFunc, salario);

    sc.close();

    }
  }
