import java.util.Scanner;
public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);       //ler do teclado

int dist;
double qtlitros, consumo;

//entrada
dist = teclado.nextInt();
qtlitros = teclado.nextDouble();

//processamento
consumo = dist / qtlitros;

//saida
System.out.printf("%.3f km/l\n", consumo);

    }
}