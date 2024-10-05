package basicPrograms;

import java.util.Scanner;

public class DiamondPatternUsingStar {

	static void diamondPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the diamond(half): ");
		int size = sc.nextInt();
		for (int i = 1; i <= size; i++) {
			for (int j = size; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			for (int j = size ; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i * 2 - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		diamondPattern();
	}

}
