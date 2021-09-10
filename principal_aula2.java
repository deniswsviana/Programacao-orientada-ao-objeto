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
        

        uno.imprimir();
        palio.imprimir();



    }   
}
