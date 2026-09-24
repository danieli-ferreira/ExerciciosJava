import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String texto;
        int voltas = 0;

        do{
            System.out.print("Digite qualquer palavra: ");
            texto=leitor.next();
            voltas ++; //soma mais 1 em cada volta
        }while(!texto.equals("banana"));
        System.out.printf("\nVoçê tentou %d vezes",voltas);
    }
}
