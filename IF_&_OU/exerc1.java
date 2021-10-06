import java.util.Scanner;

public class exerc1 {
    public static void main (String[] args){
        Scanner entrada = new Scanner (System.in);
        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        System.out.println("O numero digitado foi: "+numero);
        
        // verificar se o numero é divisivel por 3 

        /* operador aritimetico % MODULO

        if ( numero % 3 == 0) {
            
            System.out.println ("O numero é divisivel por 3");
        }
        else { System.out.println("O numero náo e divisivel por 3");   
        } 

        */

        if ( numero % 3 == 0) 
            
            System.out.println ("O numero é divisivel por 3");
        else System.out.println("O numero náo e divisivel por 3");    
           
        


    
    }
}
