import javax.swing.JOptionPane;


public class valorFibo {

	
	public static long fibonacci(int n){
		long[] valores = new long[n+1];
		valores[0] = valores[1] = 1; 
		fibonacci2(n,valores);
		return valores[n];
	}
	
	private static long fibonacci2(int n, long[] valores){
		if(valores[n]>0){
			return valores [n];
		}
		else {
			return valores[n]=fibonacci2(n-1,valores)+fibonacci2(n-2,valores);
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = Long.parseLong(JOptionPane.showInputDialog("Dime el numero del cual \n quieres fibonacci"));
		long inicio = System.nanoTime();
		System.out.println(fibonacci((int)n));
		long fin = System.nanoTime();
		double segundos = (fin-inicio)/1000000000.0;
		System.out.println("Tardó " +segundos + " s");
	}
	
	//fibonacci 55
	//225851433717
	//Tardó 1231.921294879s
	
	//0 1 2 3 4 5 6 
	//0 1 1 2 3 5 8 

}
