public class principal_aula2
{ 

    public static void main (String[] args)
    {
        
        Carro uno = new Carro(); // instanciando o objeto || Criar objeto // uno do tipo Carro
        uno.cor     = "Branco com escada";
        uno.marca   = "Fiat";
        uno.modelo  = "Uno 1.0 com escada";
        uno.quantidaDedePortas  =   2;
        uno.quantidaDedeRodas   =   4;
        
        
        Carro palio = new Carro();
        palio.cor       =   "Vermelho menstru";
        palio.marca     =   "Fiat";
        palio.modelo    =   "Palio 1.0";
        palio.quantidaDedePortas    =   4;
        palio.quantidaDedeRodas     =   4;

        Carro gol = new Carro(); 
        

        uno.imprimir();
        palio.imprimir();

        System.out.println("\n\n");

        // Operador aritimeticos

        double x = 7, y = 3;

        System.out.println("O resto da divisao "+ x%y); // operador de modulo %
        

        // operador de usuario

        x += y; // igual á x = x+y; 
        x -= y; // igual a x = x-y;

        System.out.println("O valor de x é: "+x); // Sobrescrever o valor de "x" com o resultado da soma
         

        x = y; // igual a x = x-y;
        
        x = 50; // igual á x = x+y; 
        x -= y; // igual a x = x-y;

        System.out.println("O valor de x é: "+x);

        x = 8; // igual á x = x+y; 
        x *= y; // igual a x = x-y;

        System.out.println("O valor de x é: "+x);

        x = 7; // igual á x = x+y; 
        x /= y; // igual a x = x-y;

        System.out.println("O valor de x é: "+x);

        x = 7;
        y = 5;
        // incremento
        x++;    // igual a x + 1
        //Decremento
        y--;    // igual a y - 1

        System.out.println("O valor de x apos o incremento: "+x);
        System.out.println("O valor de x apos o decremento: "+y);

        int contador = 0;  
        contador++;  // contodor = 1;   
        contador++;
        contador++;
        contador++;
        contador++; 

        System.out.println("Contador: "+contador);

        for(int i = 0; i <= 10; i++){     System.out.println(i); } // laco de repeticao || condicao dentro do laco


        x = 7; // 
        x %= y; // igual a x = x % y; | % é o resto da divisao 
        System.out.println("O valor de x é: "+x); // o valor da resto da divisao de x por y. 
        

    }   
}
