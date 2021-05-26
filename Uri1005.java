import java.util.Scanner;
public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

double media, nota1, nota2;

//entrada
System.out.println("Programa MEDIA DAS NOTAS");
System.out.println("Informe a primeira nota");
nota1 = teclado.nextDouble();
System.out.println("informe a segunda nota");
nota2 = teclado.nextDouble();

//processamento
media = ((nota1*3.5)+(nota2*7.5)) /11;

//saida
System.out.printf("MEDIA = %.5f\n" , media);

    }
}