import java.util.Scanner;
  
  public class _menu {
    public static void main(String[] args) {

        /* 
        
        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        seguir, calcule e mostre o valor da conta a pagar.

        * 1  cachorro quente R$ 4.00
        * 2  X-Salada R$ 4.50
        * 3  X-Bacon R$ 5.00
        * 4  Torrada simples R$ 2.00
        * 5  Refrigerante R$ 1.50
         
        */

        Scanner sc = new Scanner(System.in);

        int pedido,qtd;

        double total = 0.0;

        System.out.print("Qual o número do pedido gostaria? ");
        pedido = sc.nextInt();
        System.out.print("Qual a quantidade? ");
        qtd = sc.nextInt();

        if (pedido == 1){

            total = (qtd * 4.00);

           } else if(pedido == 2) {

              total = (qtd * 4.50);

              }
                if (pedido == 3){

                total = (qtd * 5.00);

                } else if(pedido == 4) {

                   total = (qtd * 2.00);

                  }
                    if (pedido == 5){

                     total = (qtd * 1.50);
                     } else{
                      System.out.println("Pedido inválido.");
                      }
                        if (total > 0.0) {
                         System.out.printf("Total: R$ %.2f%n", total);
                        }

                        sc.close();
    }
}