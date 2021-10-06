/*
 * import java.util.Scanner;

public class MenuPagamento {

	public static void main(String[] args) {
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Selecione a forma de pagamento digite:\n1\tpara dinheiro\n");
		System.out.println("2\tpara Débito\n3\tpara Crédito\n4\tpara PIX\nOPÇÃO: ");
		opcao = entrada.nextInt();
		
		System.out.println("-------------------------------------");
	
		/*
		if(opcao == 1) System.out.println("Você escolheu pagar em Dinheiro");
		else if(opcao == 2) System.out.println("Você escolheu pagar em Débito");
		else if(opcao == 3) System.out.println("Você escolheu pagar em Crédito");
		else if(opcao == 4) System.out.println("Você escolheu pagar em PIX");
		else System.out.println("Opção Inválida");
		*/
		
		switch (opcao){
			case 1:
				System.out.println("Você escolheu pagar em Dinheiro");
				break;
			case 2:
				System.out.println("Você escolheu pagar em Débito");
				break;
			case 3:
				System.out.println("Você escolheu pagar em Crédito");
				break;
			case 4:
				System.out.println("Você escolheu pagar em PIX");
				break;
			default:
				System.out.println("Opção Inválida");
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
		System.out.println("2\tpara Débito\n3\tpara Crédito\n4\tpara PIX\nOPÇÃO: ");
		
		
		//tratamento de erros
		// a estrutura try, catch,finally
		// o bloco try tenta executar o código
		//		caso não der nenhum erro exucuta o código normalmente
		// 		caso se der erro ele executa o código do catch || só executa em caso de erro
		try {
			opcao = entrada.nextInt();
		}catch(Exception e) {
			System.out.println("ERRO entrada inválida:");		// só é executado em caso de erro
			//e.printStackTrace();
		}
		
		
		System.out.println("Deve continuar");
		
	}
}
