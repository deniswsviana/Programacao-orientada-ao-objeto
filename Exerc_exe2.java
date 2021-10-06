import java.util.Scanner;


public class Exerc_exe2 
{
    public static void main (String[] args)
    {
        double base;
        double altura;
        double resultado;

        Scanner entrada = new Scanner(System.in); 
       
        System.out.print("Insira o valor da base: ");
        
        // entrada de dados
        base = entrada.nextInt(); // .nextInt(); le um inteiro
        System.out.print("Insira o valor da altura: ");

        altura = entrada.nextInt();
        
        System.out.printf("%.1f",base*altura,"m²");

          

    }
    
}
