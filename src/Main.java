public class Main {
	public static void main(String[] args) {
		
		int[] array = {6, 4, 2, 7, 3, 6};
		
		quickSort(array, 0, array.length - 1);
		
		for (int i : array){
			
			System.out.println(i);
		}
	}
	
	private static void quickSort(int[] array, int low, int high) {
		
		if(low <= high) {
			
			int pivot = partition(array, low, high);
			quickSort(array, low, pivot - 1);
			quickSort(array, pivot + 1, high);
		}
		
	}
	
	private static int partition(int[] array, int low, int high) {
		
		int pivot = array[high];
		int i = low - 1;
		
		for (int j = low; j <= high -1; j++){
			
			if (array[j] < pivot){
				
				++i;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		
		++i;
		int temp = array[i];
		array[i] = array[high];
		array[high] = temp;
		return i;
	}
}