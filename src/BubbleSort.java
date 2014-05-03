
public class BubbleSort {

	/**
	 * @param args
	 */
	public static <E extends Number> void bubbleSort(E[] valores){
		boolean flag = true;
		for (int j = 0; j<valores.length-1 && flag ; j++){
			flag = false;
			for (int i = 0; i<valores.length-1-j ; i++){
				E temp;
				if (valores[i].doubleValue() > valores[i+1].doubleValue()){
					temp = valores[i];
					valores[i] = valores[i+1];
					valores[i+1] = temp;
					System.out.print((i+1)+", ");
					flag = true;
				}
			}
			System.out.print((j+1)+", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		Number[] arreglo = {6,1,2,3,5};
		Number[] arreglo2 = {1.5,0.5,2.5,3.5,0.1};
		double ti = System.nanoTime();
		bubbleSort(arreglo);
		double tf = System.nanoTime();
		double t = (tf-ti)/1000000000;
		for (int i = 0; i< arreglo.length; i++){
			System.out.print(arreglo[i] +" ");
		}
		System.out.println("\nTiempo: " +t);
		
		ti = System.nanoTime();
		bubbleSort(arreglo2);
		tf = System.nanoTime();
		t = (tf-ti)/1000000000;
		for (int i = 0; i< arreglo2.length; i++){
			System.out.print(arreglo2[i] +" ");
		}
		System.out.println("\nTiempo: " +t);
	}

}
