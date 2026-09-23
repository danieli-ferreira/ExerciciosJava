import java.util.Scanner;

/*-------------------------------------------------------------------
  Ex 1.4: Ovos das galinhas
  - calcular quantas caixas de ovos cheias podem ser levadas ao mercado
  - calcular quantos ovos sobram

  TAREFA:
  - peça para o usuário informar quantos ovos suas galinhas botaram no dia
  - considere que cada caixa comporta 12 ovos
  - calcule e imprima quantas caixas cheias ele poderá levar ao mercado
  - calcule e imprima quantos ovos sobram
  - use a operação de divisão inteira (/) e resto da divisão (%)
-------------------------------------------------------------------*/
public class Ex01_4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);


        int quantidadeOvos;
        int caixasInteiras;
        double sobraDeOvos;

        System.out.print("Informe quantos ovos suas galinhas botaram no dia: ");
        quantidadeOvos = leitor.nextInt();

         caixasInteiras = quantidadeOvos / 12;
        sobraDeOvos =  quantidadeOvos % 12;
        System.out.printf("Com essa quantidade de ovos, podemos encher "+caixasInteiras +" caixas inteiras ");
        System.out. print("\nSobram " +sobraDeOvos+ "ovos");













    }
}
