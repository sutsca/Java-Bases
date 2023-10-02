import java.util.Locale;

public class Main {
   public static void main(String[] args) {

     String produto1 = "Computador";
     String produto2 = "Mesa de escritório";
     int idade = 30;
     int codigo = 5290;
     char genero = 'F';
     double preco1 = 2100.0;
     double preco2 = 650.50;
     double tamanho = 53.23456;

     System.out.println("Produtos:");
     System.out.printf("%s, que o preço é R$: %.2f%n", produto1,preco1);
     System.out.printf("%s, que o preço é R$: %.2f%n%n", produto2,preco2);
     System.out.printf("Dados: %d anos, codigo %d e genero: %s %n%n", idade, codigo, genero);
     System.out.printf("Tamanho com 8 numeros depois da virgula: %.8f%n", tamanho);
     System.out.printf("Tamanho arredondado com 3 numeros depois da virgula: %.3f%n", tamanho);
     Locale.setDefault(Locale.US);
     System.out.printf("Tamanho arredondado com ponto: %.3f%n", tamanho);

     }   
}


