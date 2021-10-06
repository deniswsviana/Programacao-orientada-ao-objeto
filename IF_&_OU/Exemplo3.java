import javax.swing.*;

public class Exemplo3{
	public static void main(String[] args) {
		double ladoQ1,ladoQ2, area;
		String dado;
		dado = JOptionPane.showInputDialog("L Quadrado 1: ");
		ladoQ1 = Double.parseDouble(dado);
		dado = JOptionPane.showInputDialog("L Quadrado 2: ");
		ladoQ2 = Double.parseDouble(dado);

		if(ladoQ1 >= ladoQ2) {
			area = ladoQ1*ladoQ1;
		}else {
			area = ladoQ2*ladoQ2;
		}
		System.out.println("A �rea do maior quadrado � :"+area);
	}
}
