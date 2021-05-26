import java.util.Scanner;
public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

int num, sal;
float horas, salario;

//entrada
/*System.out.println("Programa SALARIO");
System.out.println("Informe numero");
num = teclado.nextDouble();
System.out.println("informe a quantidade de horas trabalhadas");
horas = teclado.nextDouble();
System.out.println("informe o salario hora");
sal = teclado.nextDouble();*/




//processamento
salario = num*horas*sal;

//saida
System.out.printf("NUMERO = %.5f\n" , num);
System.out.printf("SALARIO = %.5f\n" , salario);

    }
}