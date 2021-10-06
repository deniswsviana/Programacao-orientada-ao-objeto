import java.util.Scanner;

public class Main {
	
	static String nomeUsuario;
    static String sobrenomeUsuario;

	public static void main(String[] args) {
		// Lista de Exercícios - Desenvolver em linguagem Java
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Exercicio - 1"); // programa para digitar nome e sobrenome do usuario.
        
        System.out.printf("Digite seu nome: ");
        nomeUsuario = entrada.next();
        
        System.out.printf("Digite seu Sobrenome: ");
        sobrenomeUsuario = entrada.next();
        
        System.out.println("Olá bem vindo "+nomeUsuario+" "+sobrenomeUsuario );

	}

}

================================================================================


import java.util.Scanner;

public class Main {
	
	static float numero;
	static float res;
    
	public static void main(String[] args) {
		// Lista de Exercícios - Desenvolver em linguagem Java
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Exercicio - 2"); //  programa para calcular o dobro de um número qualquer.
        
        System.out.printf("Digite um numero: ");
        numero = entrada.nextFloat();
        
        res = numero *2;
              
        System.out.println("O dobro do numero digitado é:  "+res);

	}

}


=========================================================================================


import java.util.Scanner;

public class Main {
	
	static float numero;
	static float sucessor;
    static float antecessor;

    
	public static void main(String[] args) {
		// Lista de Exercícios - Desenvolver em linguagem Java
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Exercicio - 3"); //   algoritmo para mostrar o sucessor e o antecessor de um número qualquer.
        
        System.out.printf("Digite um numero: ");
        numero = entrada.nextFloat();
        
        sucessor    = numero+1;
        antecessor  = numero-1;
              
        System.out.println("O numero digitado é: "+numero+"\nO seu sucessor é: "+sucessor+"\nE o seu Antecessor é: "+antecessor);

	}

}


====================================================================

import java.util.Scanner;

public class Main {
	
	static int numero;
	static int sucessor;
    static int antecessor;

    
	public static void main(String[] args) {
		// Lista de Exercícios - Desenvolver em linguagem Java
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Exercicio - 3"); //   algoritmo para mostrar o sucessor e o antecessor de um número qualquer.
        
        System.out.printf("Digite um numero: ");
        numero = entrada.nextInt();
        
        sucessor    = numero+1;
        antecessor  = numero-1;
              
        System.out.println("O numero digitado é: "+numero+"\nO seu sucessor é: "+sucessor+"\nE o seu Antecessor é: "+antecessor);

	}

}

================================================================================

import java.util.Scanner;

public class Main {
	
	static int numero;
	static int sucessor;
    static int antecessor;

    
	public static void main(String[] args) {
		// Lista de Exercícios - Desenvolver em linguagem Java
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Exercicio - 3"); //   algoritmo para mostrar o sucessor e o antecessor de um número qualquer.
        
        System.out.printf("Digite um numero: ");
        numero = entrada.nextInt();
        
        sucessor    = numero+1;
        antecessor  = numero-1;
              
        System.out.println("O numero digitado é: "+numero+"\nO seu sucessor é: "+sucessor+"\nE o seu Antecessor é: "+antecessor);

	}

}


=====================================================================================


import java.util.Scanner;

public class Lista_resp {
	
	    
	public static void main(String[] args) {
		// Lista de Exercícios - Desenvolver em linguagem Java
		
		float raio;
		double area;
	    double pi;
		
		Scanner entrada = new Scanner(System.in);
        
        System.out.println("Exercicio - 4"); //   Dado de entrada o valor do raio calcular a área da circunferência
        
        System.out.printf("Digite o numero do raio: ");
        raio = entrada.nextFloat();
        
        pi   = 3.14;
        area = pi*(raio*raio);
              
        System.out.println("O Raio é: "+raio+"\nA circunferencia é: "+area+" m²");

	}

}
