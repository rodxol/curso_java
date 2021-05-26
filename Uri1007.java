import java.util.Scanner;
public class Uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

int diferenca, num1, num2, num3, num4;

//entrada
/*System.out.println("Programa DIFERENÇA");
System.out.println("Informe o primeiro numero");
num1 = teclado.nextDouble();
System.out.println("informe o segunda número");
num2 = teclado.nextDouble();
System.out.println("informe o terceiro número");
num3 = teclado.nextDouble();
System.out.println("informe o quarto número");
num4 = teclado.nextDouble();*/

num1 = teclado.nextInt();
num2 = teclado.nextInt();
num3 = teclado.nextInt();
num4 = teclado.nextInt();


//processamento
diferenca = num1*num2-num3*num4;

//saida
System.out.println("DIFERENCA = " + diferenca);

    }
}