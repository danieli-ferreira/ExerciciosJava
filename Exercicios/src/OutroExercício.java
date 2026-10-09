import java.util.Scanner;
import java.util.InputMismatchException;
public class OutroExercício {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String resposta;
        do {
            try {
                System.out.println("Digite um número: ");
                double n1 = leitor.nextInt();
                System.out.println("Digite outro número: ");
                int n2 = leitor.nextInt();

                double result = n1 / n2;
                System.out.println("O resultado da divisão do número " + n1 + " e " + n2 + "é" + result);
            } catch (InputMismatchException ex) {
                String nextLine = leitor.nextLine();
                System.out.println("Erro: digite somente números. ");
            } catch (ArithmeticException ex) {
                System.out.printf("\nErro: não é possível dividir por 0. ");
            }
            System.out.printf("Deseja fazer outra divisão? S/N ");
            resposta = leitor.next();

        }while(resposta .equalsIgnoreCase("S"));

    }
}
