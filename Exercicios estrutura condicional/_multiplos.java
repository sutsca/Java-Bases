import java.util.Scanner;
  
  public class _multiplos {
    public static void main(String[] args) {

        /* Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
           Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
           ordem crescente ou decrescente. 

           *O valor só sera multiplo se o resultado da equação pertencer ao numeros de inteiros(3,5,45,... ) (3,44 nao pertence)
           Formula nA = B
           
           Exemplo:

           * n18 = 86 / 18
           * 18n/18 = 86/18
           * n = 86/18
           * n = 4,778... (aqui não é multiplo)

           * se o quociente da divisao de A e B for decimal (2,0009), não é multiplo.


        */

        Scanner sc = new Scanner(System.in);

        int A,B;

        System.out.print("Digite o primeiro número: ");
        A = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        B = sc.nextInt();


        //em qualquer ordem que vc coloque os numeros solicitados, o programa sempre fará a divisao do maior pelo menor.
        // e vai checar se o resto é 0. Se for 0 é multiplo.

        if (A % B  == 0 || B % A == 0){

            System.out.println("São múltiplos ");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();
    }
}