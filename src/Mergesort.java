public class Mergesort {

	/**
	 * @param args
	 * @return 
	 */
	
	public static <T extends Comparable <T>> void mergesort(T[] arreglo){
		mergesort(arreglo, 0, arreglo.length-1);
	}
	
	private static <T extends Comparable <T>> void mergesort(T[] arreglo, int primero, int ultimo){
		if (primero<ultimo){
			int central = (primero + ultimo)/2;
			mergesort(arreglo,primero,central);
			mergesort(arreglo, central+1 , ultimo);
			Mezcla(arreglo, primero, ultimo);
		}
	}
	
	private static <T extends Comparable <T>> void Mezcla(T[] arreglo, int primero, int ultimo){
		@SuppressWarnings("unchecked")
		T [] temp = (T[]) new Comparable[arreglo.length];
		int central = (primero + ultimo) /2;
        int primeroT, numElementos, tmp_pos;
        primeroT = (central - 1);
        tmp_pos = primero;
        numElementos = (ultimo - primero + 1);
        while ((primero <= primeroT) && (central < ultimo))
        {
            if (arreglo[primero].compareTo(arreglo[central])<=0){
                temp[tmp_pos++] = arreglo[primero++];
            }
            else{
                temp[tmp_pos++] = arreglo[central++];
            }
        }
        while (primero <= primeroT){
            temp[tmp_pos++] = arreglo[primero++];
        }
        while (central <= ultimo){
            temp[tmp_pos++] = arreglo[central++];
        }
        for (int i = 0; i < numElementos; i++)
        {
            arreglo[ultimo] = temp[ultimo];
            ultimo--;
        }
	}
	
	
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Integer[] numeros = {5,3,1,7,8};
		mergesort(numeros);
		for (int i = 0; i<numeros.length; i++){
			System.out.print(numeros[i]);
		}
		
		System.out.println();
		System.out.println("Termino");
		

	}
	//Referencia http://www.softwareandfinance.com/Java/MergeSort_Recursive.html
}
