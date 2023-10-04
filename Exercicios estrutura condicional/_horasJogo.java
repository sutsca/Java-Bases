import java.util.Scanner;
  
  public class _horasJogo {
       public static void main(String[] args) {

        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
           começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
         
        */

        Scanner sc = new Scanner(System.in);

        int inic;
        int finall;
        int soma;

        

        System.out.print("Digite a hora que o jogo iniciou: ");
        inic = sc.nextInt();
        System.out.print("Digite a hora que o jogo acabou: ");
        finall= sc.nextInt();


        soma = (inic + finall);


        if (soma <= 24 ){

            System.out.printf("O jogo durou %f hora(s)", soma);
           } else if(soma >= 1 ){

                System.out.printf("O jogo durou %f hora(s)", soma);

               } else if (soma == 0) {
                
                System.out.printf("O jogo durou 24 horas");
               } else {
                System.out.printf("O jogo menos que uma hora");
               }

                 sc.close();



        } 
    }

        
