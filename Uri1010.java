import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

int cod1, cod2, num1, num2;
float  val1, val2, total;

//entrada
cod1 = teclado.nextInt();
num1 = teclado.nextInt();
val1 = teclado.nextFloat();
cod2 = teclado.nextInt();
num2 = teclado.nextInt();
val2 = teclado.nextFloat();

//processamento
total = num1 * val1 + num2 * val2;

//saida
System.out.printf("VALOR A PAGAR: R$%.2f\n" , total);

    }
}