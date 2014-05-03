
public class Quicksort {

	/**
	 * @param args
	 */
	
	public static<T extends Comparable <T>> void quickSort(T[] arreglo){
		quickSort(arreglo, 0, arreglo.length-1);
	}
	
	private static<T extends Comparable <T>> void quickSort(T[] arreglo, int primero, int ultimo){
		int pivot=0;
		if (primero<ultimo){
			pivot = seleccionarPivote(arreglo,primero,ultimo);
		}
		if (pivot > 1){
			quickSort(arreglo,primero, pivot-1);
		}
		if (pivot+1 <ultimo){
			quickSort(arreglo,pivot+1, ultimo);
		}
	}
	
	private static <T extends Comparable <T>> int seleccionarPivote(T[] arreglo, int primero, int ultimo){
		T pivot = arreglo[(int) (Math.random()*arreglo.length)];
		while(true){
			while (arreglo[primero].compareTo(pivot)<0){
				primero++;
			}
			while (arreglo[ultimo].compareTo(pivot)>0){
				ultimo--;
			}
			if (primero < ultimo){
				T temp = arreglo[ultimo];
				arreglo[ultimo] = arreglo[primero];
				arreglo [primero] = temp;
			}
			else{
				return ultimo;
			}
		}
	}

      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  Integer[] numbers = {3,5,6,1,2,9};
          double ini = System.nanoTime();
    	  quickSort(numbers);
    	  double fin = System.nanoTime();
              for (int i = 0; i < numbers.length; i++){
                    System.out.print(numbers[i]+" ");
              }
              fin = fin-ini/1000000000;
              System.out.println();
              System.out.println("Tiempo: " +fin);
              System.out.println("Termino");

	}

}
