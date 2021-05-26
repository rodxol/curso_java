import java.util.Scanner;
public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

double area, diagonal1, diagonal2;

//entrada
System.out.println("Programa para calcular a area de um losango");
System.out.println("Digite o valor da primeira diagonal");
diagonal1 = teclado.nextDouble();
System.out.println("Digite o valor da segunda diagonal");
diagonal2 = teclado.nextDouble();

//processamento
area = diagonal1 * diagonal2;

//saida
System.out.println("A area do losango eh " + area);

    }
}