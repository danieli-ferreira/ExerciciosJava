import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String palavra;
        int tentativas = 1;

        do{
            System.out.print("Tentativa "+tentativas);
            tentativas++;
            System.out.print("\nDigite uma palavra: ");
            palavra = leitor.next();
        }while(!palavra.equalsIgnoreCase("banana"));

    }
}
