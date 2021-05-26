import java.util.Scanner;
public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

int media, nota1, nota2, nota3;

//entrada
System.out.println("Programa MEDIA DAS NOTAS");
System.out.println("Informe a primeira nota");
nota1 = teclado.nextInt();
System.out.println("informe a segunda nota");
nota2 = teclado.nextInt();
System.out.println("informe a segunda nota");
nota3 = teclado.nextInt();

//processamento
media = (nota1 *3+nota2 *3+nota3 *5)/10;

//saida
System.out.printf("MEDIA = " + media);

    }
}