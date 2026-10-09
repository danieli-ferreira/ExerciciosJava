import java.util.Scanner;
import java.util.InputMismatchException;
public class Exercício {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Digite sua idade (inteiro): ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura (ex: 1,75): ");
            double altura = scanner.nextDouble();

            System.out.println("\nDados cadastrados com sucesso!");
            System.out.println("Idade: " + idade + " anos | Altura: " + altura + "m");
        }catch (InputMismatchException e){
            String nextLine = scanner.nextLine();
            System.out.print("Erro: digite valores válidos. ");
        }


        scanner.close();
    }
}

