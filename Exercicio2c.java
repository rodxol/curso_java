import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

double base, altura, area;

//entrada
System.out.println("Programa para calcular a area de um triangulo");
System.out.println("Digite o valor da base");
base = teclado.nextDouble();
System.out.println("Digite o valor da altura");
altura = teclado.nextDouble();

//processamento
area = (base * altura) /2;

//saida
System.out.println("A area do triangulo eh " + area);

    }
}