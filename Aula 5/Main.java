/*

Calcule a area de um triangulo.
O usuario vai inserir os valores das dimensoes de um triangulo.

area = (base * altura)/2;

*/
import java.util.Scanner;

public class Main 
{
    public static void main (String [] args){
        System.out.println("Hello Wolrd!");

        double base;
        double altura;
        double area;

        Scanner entrada = new Scanner (System.in);
        System.out.printf("Digite o numero da base: ");

        base = entrada.nextInt();
        System.out.printf("Digite o numero da altura: ");

        altura = entrada.nextInt();

        System.out.printf("O Valor do triangulo é: %.1f",(base*altura)/2,"m²");
        



    }
    
}
