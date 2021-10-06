/*
 * import java.util.Scanner;

public class MenuPagamento {

	public static void main(String[] args) {
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Selecione a forma de pagamento digite:\n1\tpara dinheiro\n");
		System.out.println("2\tpara D�bito\n3\tpara Cr�dito\n4\tpara PIX\nOP��O: ");
		opcao = entrada.nextInt();
		
		System.out.println("-------------------------------------");
	
		/*
		if(opcao == 1) System.out.println("Voc� escolheu pagar em Dinheiro");
		else if(opcao == 2) System.out.println("Voc� escolheu pagar em D�bito");
		else if(opcao == 3) System.out.println("Voc� escolheu pagar em Cr�dito");
		else if(opcao == 4) System.out.println("Voc� escolheu pagar em PIX");
		else System.out.println("Op��o Inv�lida");
		*/
		
		switch (opcao){
			case 1:
				System.out.println("Voc� escolheu pagar em Dinheiro");
				break;
			case 2:
				System.out.println("Voc� escolheu pagar em D�bito");
				break;
			case 3:
				System.out.println("Voc� escolheu pagar em Cr�dito");
				break;
			case 4:
				System.out.println("Voc� escolheu pagar em PIX");
				break;
			default:
				System.out.println("Op��o Inv�lida");
		}		
	}
}


 * 
 * 
 */

public class MenuPagamento {

	public static void main(String[] args) {
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Selecione a forma de pagamento digite:\n1\tpara dinheiro\n");
		System.out.println("2\tpara D�bito\n3\tpara Cr�dito\n4\tpara PIX\nOP��O: ");
		
		
		//tratamento de erros
		// a estrutura try, catch,finally
		// o bloco try tenta executar o c�digo
		//		caso n�o der nenhum erro exucuta o c�digo normalmente
		// 		caso se der erro ele executa o c�digo do catch || s� executa em caso de erro
		try {
			opcao = entrada.nextInt();
		}catch(Exception e) {
			System.out.println("ERRO entrada inv�lida:");		// s� � executado em caso de erro
			//e.printStackTrace();
		}
		
		
		System.out.println("Deve continuar");
		
	}
}
