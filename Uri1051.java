import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double renda = teclado.nextDouble();
        double imposto;  
        
        if (renda <= 2000.00f){
            System.out.printf("Imposto de renda Isento");
        }
        else if (renda > 2000.00f && renda <= 3000.00f){
            renda = renda - 2000f;
            imposto = renda * 0.08;
            System.out.printf("Imposto de renda %.2f\n", imposto);
        }
        else if (renda > 3000.00f && renda <= 4500.00f){
            imposto = (renda - 2000f) * 0.18f;
            System.out.printf("Imposto de renda R$ %.2f\n", imposto);
        }
        else if (renda > 4500.00f){
            imposto = (renda - 2000f) * 0.28f;
            System.out.printf("Imposto de renda R$ %.2f\n", imposto);
        }
    }
}