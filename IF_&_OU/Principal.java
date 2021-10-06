
public class Principal {
	public static void main(String[] args) {
		boolean interruptorA, interruptorB;
					
		//operador e
		interruptorA = true;
		interruptorB = true;

	
		if(interruptorA && interruptorB) {
			System.out.println("Lampada Ligada");
			
		}else {
			System.out.println("Lampada desligada");
		}
	
		
		//operador ou
		
		if(interruptorA || interruptorB) {
			System.out.println("Lampada Ligada");
			
		}else {
			System.out.println("Lampada desligada");
		}

		
		// negação
			
		if(!interruptorA) {
			System.out.println("Lampada Ligada");
		}else {
			System.out.println("Lampada desligada");
		}
	
		
		
		
	}
}
