import java.util.Scanner;
import java.util.InputMismatchException;

public class TreinoTry {
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double n1 = leitor.nextInt();
            System.out.print("Digite outro número: ");
            int n2 = leitor.nextInt();

            double result = n1 / n2;
            System.out.print("O número "+n1+ " dividido pelo número " +n2+ " tem o seguinte resultado: "+ result);
                 }catch (InputMismatchException ex){
                 String nextLine = leitor.nextLine();
                 System.out.print("Erro: digite apenas números. ");
                 }catch(ArithmeticException ex){
                 System.out.print("Erro: não é possível dividir por 0. ");
        }finally {
            System.out.print("\nFim do programa! ");
        }
    }

}
