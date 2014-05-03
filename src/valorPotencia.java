import javax.swing.JOptionPane;


public class valorPotencia {

	/**
	 * @param args
	 */
	
	//fibonacci 55
	//Resultado: 225851433717
	//Tardó 1231.921294879s
	
	public static double potencia (double b, int p){
		if ((b==0 && p==0) || (p<0)){
			return 0;
		}
		else if (p!=0){
			return b*potencia(b,p-1);
		}
		else{
			return 1;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String res = null;
		do{
			double b = Double.parseDouble(JOptionPane.showInputDialog("Dame la base"));
			double p = Double.parseDouble(JOptionPane.showInputDialog("Dame la potencia"));
			if ((b==0 && p==0) || (p<0) || (p%1!=0)){
				JOptionPane.showMessageDialog(null, "Números Inválidos");
			}
			else{
				JOptionPane.showMessageDialog(null, "El resultado es: " +potencia(b,(int)p));	
			}
			res = JOptionPane.showInputDialog("¿Quieres evaluar otros numeros? (Y/N)");
		}
		while(res.equalsIgnoreCase("y"));
		System.out.println("Termino");
	}

}
