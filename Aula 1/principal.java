import javax.print.attribute.standard.JobOriginatingUserName;
import javax.sql.rowset.JoinRowSet;
import javax.swing.JSpinner.DateEditor;

public class principal
{
    /*constante
    public static final = imutavel
    double = tipo da constante
    PI = valor

    */

    public static final double PI = 3.14159;
    
    public static void main (String [] args)
    { 
    
        /* no java 3 tipos de declaracao de variavel 
            1- constante -- nao muda com o passar do tempo
            2- variavel -- muda com o passar do tempo
                Tipos de variaveis (
                    local e global
                )
            3- atributos -- relacionado a objeto
        
        */

        /***
         * o que sao tipos de dados - como linguagem JAVA é uma linguagem tipada
         * quando declaramos uma memoria devemos informar o "tipo de dado"
         * 
         * vamos aos tipos de dados -- tupos de dados NATIVOS DE DADOS
         * 
         * boolean  -- logico "verdadeiro e falso"
         * int      -- numero inteiro
         * double   -- numero decimal
         * String   -- texto; O String é uma classe e ao mesmo tempo um tipo de dado. Deve ser escrito com a primeira letra em maiuscula.
         */

         //quando declaramos uma variavel
         // tipo de dado       nome da variavel

         int        numero;
         double     valor;
         String     nome;
         boolean    ligado; // true or false // ligado ou desligado

         numero = 12;
         valor  = 3.65;
         nome   = "Jose";
         ligado = true;

         int resultado;

         int numero1 = 1236 ,numero2 = 432;
         
         char letra = 'a';

         resultado = numero1 + numero2;
         
         System.out.println(resultado);
         System.out.println();
         System.out.print("O valor do numero 1 é: ");
         System.out.println(numero1);
         System.out.println();
         System.out.println("-----------------");
         System.out.println("O Valor do numero é: "+numero1+"\nO Valor do numero é: "+numero2);
         System.out.println("hoje \n\t\t\t\t é sexta feira");
         System.out.println("================");
         System.out.println("o caminho do arquivo é: ");
         System.out.println("C:\\Arquivos e programa\\eclipse");
         System.out.println("===========================");
         System.out.println("O nome da pessoa é \"jose\"");
         System.out.println("O nome da pessoa é 'jose'");
         System.out.println("=========================");
         System.out.println("\u0169");
         System.out.println(Integer.SIZE);
         System.out.println("===================================");
         int n1 = 12;
         int n2 = 45;
         int res; 

         res = n1+n2;

        
         System.out.println("O valor da soma é "+res);
         System.out.println("===================================");
         

         res = n1*n2;

        
         System.out.println("O valor da multiplicacao é "+res);
         System.out.println("===================================");
         

         res = n1/n2;

        
         System.out.println("O valor da divisao é "+res);
         System.out.println("===================================");
         

         res = n1-n2;

        
         System.out.println("O valor da subtracao é "+res);
        

    
    

    }
}
