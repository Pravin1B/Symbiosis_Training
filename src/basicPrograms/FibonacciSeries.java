package basicPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	static void fibonacciSeries() {
		int a = 0, b = 1, c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter end of the series: ");
		int size = sc.nextInt();
		System.out.print(a + " " + b);
		for (int i = 0; i < size; i++) {

			c = a + b;
			if (c < size) {
				System.out.print(" " + c);
				a = b;
				b = c;
			} else
				break;

		}

	}

	public static void main(String[] args) {
		fibonacciSeries();
	}

}
