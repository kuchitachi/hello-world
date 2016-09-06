
public class sortsearch {
	public static void main(String[] args){
		int[] array = {5, 3, -13, 1, 8, -3, -9};
		
		System.out.print("Unsorted : ");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		int a;
		for(int i=0; i<array.length-1; i++){
			for(int j=0; j<array.length-1; j++){
				if(array[j]>array[j+1]){
					a = array[j];
					array[j] = array[j+1];
					array[j+1] = a;
				}
				else
					continue;
			}
		}
		System.out.print("Sorted : ");
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		//
		
		int key = 1;
		
		int low = 0;
		int high = array.length -1;
		
		while(low <= high){
			int mid = low + (high - low) / 2;
			if (key < array[mid])
				high = mid - 1;
			else if(key > array[mid])
				low = mid + 1;
			else if(key == array[mid]){
				System.out.println("Found");
				return;
			}
		}
	}
}
