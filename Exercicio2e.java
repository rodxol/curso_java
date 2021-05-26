import java.util.Scanner;
public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

double area, basemaior, basemenor, altura;

//entrada
System.out.println("Programa para calcular a area de um trapezio");
System.out.println("Digite o valor da base maior");
basemaior = teclado.nextDouble();
System.out.println("Digite o valor da base menor");
basemenor = teclado.nextDouble();
System.out.println("Digite o valor da altura");
altura = teclado.nextDouble();

//processamento
area = (basemaior + basemenor)* altura/2;

//saida
System.out.println("A area do trapezio eh " + area);
    }
}