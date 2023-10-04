import java.util.Scanner;
  
  public class _horasJogo {
       public static void main(String[] args) {

        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
           começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         
        */

        Scanner sc = new Scanner(System.in);

        int inic;
        int fim;
        int duracao;

        

        System.out.print("Digite a hora que o jogo iniciou: ");
        inic = sc.nextInt();
        System.out.print("Digite a hora que o jogo acabou: ");
        fim= sc.nextInt();


        duracao = (inic + fim);

        /*
        Neste código, calculamos a diferença entre as horas iniciais e finais e consideramos a situação em que o 
        jogo pode começar em um dia e terminar no próximo. Em seguida, verificamos se a duração está dentro do 
        intervalo de 1 a 24 horas antes de exibir a mensagem. 
        */

       if (inic < fim) {
            duracao = fim - inic;
        } else {
            duracao = 24 - inic + fim;
        }

        if (duracao >= 1 && duracao <= 24) {
            System.out.printf("O jogo durou %d hora(s)", duracao);
        } else {
            System.out.println("Horas de jogo inválidas");
        }

        sc.close();
    }
}