package exemploJuros;

import java.util.Scanner;

public class Juros {

	public static void main(String[] args) {

        float valor_i, valor_f, juros=0;
        int meses;
		
		Scanner entrada = new Scanner(System.in);		
		
		System.out.print("Qual o valor inicial da dívida: ");
        valor_i = entrada.nextFloat();
        
        System.out.print("Você vai atrasar quantos meses [0-5]?: ");
        meses = entrada.nextInt();

        switch(meses)
        {
            case 5:
                juros = juros +76.32f;
            case 4:
                juros= juros +32.62f;
            case 3:
                juros= juros +21.91f;
            case 2:
                juros= juros +11.44f;
            case 1:
                juros= juros +5.32f;
                break;
            default:
                System.out.println("Você não digitou um valor válido de meses");
            
        }
        
        System.out.println("Juros: "+juros+"%");    
        valor_f=( (1 + (juros/100))*valor_i);    
        System.out.println("Valor final da dívida: R$ "+valor_f);     
    
	}
}
