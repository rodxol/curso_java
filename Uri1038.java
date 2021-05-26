import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int cod, qtde;
        double valor;


        /*cod1 = 4.00;
        cod2 = 4.50;
        cod3 = 5.00;
        cod4 = 2.00;
        cod5 = 1.50;*/

        System.out.println("informe o codigo do produto");
        cod = teclado.nextInt();

        System.out.println("informe a quantidade de produtos");
        qtde = teclado.nextInt();

        if (cod == 1){
            valor = qtde * 4.00f;
            System.out.println(qtde + " cachorro(s) quente(s), total " + valor);
            }
        else if (cod == 2){
            valor = qtde * 4.50f;
            System.out.println(qtde + " X salada(s), total " + valor);
        }
        else if (cod == 3){
            valor = qtde * 5.00f;
            System.out.println(qtde + " X Bacon(s), total " + valor);
        }
        else if (cod == 4){
            valor = qtde * 2.00f;
            System.out.println(qtde + " torrada(s), total " + valor);
        }
        else if (cod == 5){
            valor = qtde * 1.50f;
            System.out.println(qtde + " refri(s), total " + valor);
        }
    }
}

