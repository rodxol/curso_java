import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario = teclado.nextDouble();
        double nsalario;

        if (salario <= 400.00f){
            nsalario = salario * 1.15;
            System.out.printf("Novo salario %.2f\n", nsalario);
            System.out.printf("Reajuste ganho %.2f\n", nsalario - salario);
            System.out.printf("Em percentual %.0f\n", nsalario - salario, "%%");
        }
        else if (salario > 400.00f && salario <= 800.00f){
            nsalario = salario * 1.12;
            System.out.printf("Novo salario %.2f\n", nsalario);
        }
        else if (salario > 800.00f && salario <= 1200.00f){
            nsalario = salario * 1.10;
            System.out.printf("Novo salario %.2f\n", nsalario);
            System.out.printf("Reajuste ganho %.2f\n", nsalario - salario);
            System.out.printf("Em percentual %.0f\n", nsalario - salario);
        }
        else if (salario > 1200.00f && salario <= 2000.00f){
            nsalario = salario * 1.07;
            System.out.printf("Novo salario %.2f\n", nsalario);
            System.out.printf("Reajuste ganho %.2f\n", nsalario - salario);
            System.out.printf("Em percentual %.0f\n", nsalario - salario);
        }
        else{
            nsalario = salario * 1.04;
            System.out.printf("Novo salario %.2f\n", nsalario);
            System.out.printf("Reajuste ganho %.2f\n", nsalario - salario);
            System.out.printf("Em percentual ", nsalario / salario ," %%");         //percentual no printf %%
        }        
    }
}