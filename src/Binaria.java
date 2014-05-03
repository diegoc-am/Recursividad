import javax.swing.JOptionPane;


public class Binaria {

	/**
	 * @param args
	 * @return 
	 * @return 
	 */

	
	
	public static <E extends Number> Number busquedaBinaria(Number num, Number[] arreglo){
		Integer min = 0;
		Integer max = arreglo.length - 1;
		Integer pos;
		while (min <= max) {
		     pos = (min + max) / 2;
		     System.out.print(pos + ", ");
		     if ( arreglo[pos].doubleValue() == num.doubleValue() ){
		    	 System.out.println();
		    	 return pos;
		    	 }
		     else if ( arreglo[pos].doubleValue() < num.doubleValue() ) {
		    	 min = pos+1;
		     } 
		     else {
		    	 max = pos-1;
		     }
		 }
		System.out.println(); 
		return  ((Integer)(-1));
	}
	
	public static <E extends Number> Number busquedaBinariaRecursiva(Number num, Number[] arreglo){
		return busquedaBinariaRecursiva2(arreglo, 0, arreglo.length, num);
	}
	
	private static <E extends Number> Number busquedaBinariaRecursiva2(Number[] arreglo, Number min, Number max, Number num) {
	    if (min.doubleValue() < max.doubleValue()) {
	        int pos = min.intValue() + (max.intValue() - min.intValue()) / 2;  
	        if (num.doubleValue() < arreglo[pos].doubleValue()) {
	            return busquedaBinariaRecursiva2( arreglo,  min,  pos,  num);
	        } 
	        else if (num.doubleValue() > arreglo[pos].doubleValue()) {
	            return busquedaBinariaRecursiva2(arreglo, pos+1, max , num);
	            
	        } 
	        else {
	            return pos;   
	        }
	    }
	    return -1;
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arreglo[] = {1,2,6,7,8,9};		
		Integer pos = (Integer) busquedaBinaria(Double.parseDouble(JOptionPane.showInputDialog("Dime un numero pa' buscar")), arreglo);
		System.out.println("El valor está en la posición " + (pos));
		Integer pos2 = (Integer) busquedaBinariaRecursiva(Double.parseDouble(JOptionPane.showInputDialog("Dime un numero pa' buscar")), arreglo);
		System.out.println("El valor está en la posición " + (pos2));
	}

}
