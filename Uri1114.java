import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;

        for (int cont=1; cont <= 5; cont++){
            valor = teclado.nextInt();
           if (valor %2 == 0){
               System.out.println(valor+ " pares");
            }
        }
    }
}