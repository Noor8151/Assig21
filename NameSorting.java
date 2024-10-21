package assig;

import java.util.Scanner;

public class NameSorting {

	static void bubble_sort(String[] names) {
		int n = names.length;
		String temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (names[j].compareTo(names[j + 1]) > 0) {

					temp = names[j];
					names[j] = names[j + 1];
					names[j + 1] = temp;
				}
			}
		}
	}

	static void display_names(String[] names) {
		System.out.println("Sorted Names:");
		for (String name : names) {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of names: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		String[] names = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter name " + (i + 1) + ": ");
			names[i] = scanner.nextLine();
		}

		bubble_sort(names);
		display_names(names);

		scanner.close();
	}
}
