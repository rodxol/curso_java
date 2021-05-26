import java.util.Scanner;
public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

double volume, raio, altura, pi;

//entrada
System.out.println("Programa para calcular o volume de um cilindro");
System.out.println("Informe o raio do cilindro");
raio = teclado.nextDouble();
System.out.println("informe a altura do cilindro");
altura = teclado.nextDouble();

//processamento
pi = 3.14;
volume = pi * raio * raio * altura;

//saida
System.out.printf("O volume do cilindro vale %.2f\n" ,volume);

    }
}