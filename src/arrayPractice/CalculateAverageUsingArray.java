package arrayPractice;

public class CalculateAverageUsingArray {

   void calculateAverageUsingArray() {
		TakeInputArray inputarray = new TakeInputArray();
		int[] array = inputarray.inputArray();
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Average is " + (float) sum / array.length);
	}

	public static void main(String[] args) {
		CalculateAverageUsingArray calavg = new CalculateAverageUsingArray();
		calavg.calculateAverageUsingArray();
	}
}