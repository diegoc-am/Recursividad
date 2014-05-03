import javax.swing.JOptionPane;


public class valorFactorial {

	/**
	 * @param args
	 */
	public static long factorial (long number){
		if (number>1){
			return number*factorial(number -1);
		}
		else{
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = Long.parseLong(JOptionPane.showInputDialog("Dime el numero del cual \n quieres saber el factorial"));
		System.out.println(factorial(n));
	}
}
