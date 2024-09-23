package arrayPractice;

public class ArrayInAscendingOrder {

	void arrayInAscendingOrder() {
		TakeInputArray inputarr=new TakeInputArray();
		int[] array=inputarr.inputArray();
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Reverserd Array is: ");
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	public static void main(String[] args) {
		ArrayInAscendingOrder revarr=new ArrayInAscendingOrder();
		revarr.arrayInAscendingOrder();
	}

}
