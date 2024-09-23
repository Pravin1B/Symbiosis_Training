package arrayPractice;

import java.util.Scanner;

public class TakeInputArray {
	int[] inputArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("array[" + i + "]= ");
			array[i] = sc.nextInt();
		}
		return array;
	}

//	public static void main(String[] args) {
//		TakeInputArray obj = new TakeInputArray();
//		obj.inputArray();
//	}
}
