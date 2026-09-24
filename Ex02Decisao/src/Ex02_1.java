import java.util.Scanner;
import java.util.regex.Matcher;

/*-------------------------------------------------------------------
    Ex 2.1: Subtotal e raspadinhas
    - informar o valor da compra
    - dar raspadinhas de brinde para compras acima de R$ 100

    TAREFA:
    - peça para o usuário informar o valor em reais da compra
    - se o valor for maior que R$ 100, calcule quantas raspadinhas o
      cliente deve receber: uma raspadinha para cada R$ 100
    - imprima a quantidade de raspadinhas recebidas

    ATENÇÃO:
    - não pode existir uma quantidade fracionária de raspadinhas
    - use a função Math.round() para arredondar a quantidade calculada
    - uma forma de calcular é: Math.round(valor / 100.0)
-------------------------------------------------------------------*/
public class Ex02_1 {
        public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);

         double valorCompra;
         int brinde=0;

         System.out.print("Digite o valor da compra em reais: ");
         valorCompra = leitor.nextDouble();

         if(valorCompra > 100) {
             brinde = (int)(valorCompra / 100);
             System.out.println("Parabéns voçê ganhou raspadinhas. "+brinde);
         }else {
             System.out.print("Voçe nao ganhou raspadinhas. ");
         }
        System.out.print("\nO valor da compra foi: "+valorCompra);
        System.out.print("\nO brinde é esse: "+brinde+ " raspadinha (as). ");
        }
}
