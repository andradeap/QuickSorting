import java.util.Arrays;

public class QuckSrtng {
 
	public static void quickSorting(int[] arr, int primeiro, int ultimo) {	
		int posicaoMedia = arr[primeiro + (ultimo - primeiro) / 2];
 
		int i = primeiro, j = ultimo;
		while (i <= j) {
			while (arr[i] < posicaoMedia) {
				i++;
			}
			while (arr[j] > posicaoMedia) {
				j--;
			} 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if (arr == null || arr.length == 0)
			return;
		if (primeiro >= ultimo)
			return;
 
		if (primeiro < j)
			quickSorting(arr, ultimo, j);
		
		if (ultimo > i)
			quickSorting(arr, i, primeiro);
	}
	
	public static void main(String[] args) {
		int[] elementos = {10, 7, 5, 22, -2, -8, 26, 13, 64, 21, 44, 16};

		int primeiro = 0;
		int ultimo = elementos.length - 1;
 	
		System.out.println("Elementos: "+Arrays.toString(elementos));		
		quickSorting(elementos, primeiro, ultimo);
		System.out.println("Elementos ordenados: "+Arrays.toString(elementos));
	}
}
