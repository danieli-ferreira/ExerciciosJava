import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.5: Troca de dinheiro
  - informar um valor inteiro em reais, sem os centavos
  - calcular quantas notas e moedas podem ser obtidas na troca

  TAREFA:
  - peça para o usuário informar um valor inteiro em reais, sem os centavos
  - calcule e imprima quantas notas de 50, 10, 5 e 2 reais
    e quantas moedas de 1 real é preciso para fazer esse valor
  - não é necessário usar if em nenhum lugar: use apenas divisão inteira (/)
    e resto da divisão (%)

  DESAFIO:
  - depois de terminar, altere o programa para aceitar um valor double,
    incluindo os centavos
  - calcule e imprima também quantas moedas de 50, 25, 10, 5 e 1 centavo
    podem ser obtidas
-------------------------------------------------------------------*/
public class Ex01_5 {
    public static void main(String[] args) {
    Scanner notas = new Scanner(System.in);

         int valor;
         int nota50;
         int nota10;
         int nota5;
         int nota2;
         int moedas;

         System.out.print("Informe um valor inteiro,sem os centavos: ");
         valor = notas.nextInt();

         nota50 = valor / 50;
         valor = valor % 50;

         nota10= valor/10;
         valor= valor % 10;

         nota5= valor /5;
         valor = valor % 5;


         nota2 = valor /2;
         valor= valor % 2;


        moedas = valor /1;
        valor = valor % 1;

        System.out.println("\nNotas de 50: " +nota50);
        System.out.println("\nNotas de 10: "+nota10);
        System.out.print("\nNotas de 5: "+nota5);
        System.out.println("\nNotas de 2: "+nota2);
        System.out.println("Moedas de 1: "+moedas);









    }
}
