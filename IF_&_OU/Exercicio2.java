public class Exercicio2 {

	public static void main(String[] args) {
		int numero;
		String dado;
		dado = JOptionPane.showInputDialog("Insira um numero de 1 at� 9 para mostrar escrito por extenso");		
		try {
			numero = Integer.parseInt(dado);			
			switch (numero){
			case 1:
				JOptionPane.showMessageDialog(null, "Um");
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Dois");
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Tr�s");
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Quatro");
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Cinco");
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Seis");
				break;
			case 7:
				JOptionPane.showMessageDialog(null, "Sete");
				break;
			case 8:
				JOptionPane.showMessageDialog(null, "Oito");
				break;
			case 9:
				JOptionPane.showMessageDialog(null, "Nove");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null,"ERRO entrada inv�lida:");
			e.printStackTrace();
		}		
		System.out.println("Finalizou");
	}
}

