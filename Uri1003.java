import java.util.Scanner;
public class Uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

double soma, num1, num2;

//entrada
System.out.println("Programa SOMA");
System.out.println("Informe o primeiro número");
num1 = teclado.nextDouble();
System.out.println("informe o segundo número");
num2 = teclado.nextDouble();

//processamento
soma = num1 + num2;

//saida
System.out.printf("SOMA = %.0f\n" , soma);

    }
}