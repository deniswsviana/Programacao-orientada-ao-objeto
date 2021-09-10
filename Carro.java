public class Carro 
{
// Identificador de classes
    //Caracteristicas comuns aos objetos desta classe

     String marca;
     String  modelo;
     String cor;
     int quantidaDedeRodas; 
     int quantidaDedePortas; // Caracteristicas == Atributos

     // metodos ou acoes 
     //futuramente 
     
     public void imprimir() 
     { 
        System.out.println("\n---------Carro----------");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cor: "+cor);
        System.out.println("Quantidade de Rodas: "+quantidaDedeRodas);
        System.out.println("Quantidade de Portas: "+quantidaDedePortas);
        System.out.println();



     }


}
