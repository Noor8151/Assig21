package assig;

import java.util.Scanner;

public class CitySearch {

	static boolean linearSearch(String[] cities, String cityToFind) {
		for (String city : cities) {
			if (city.equalsIgnoreCase(cityToFind)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of cities: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		String[] cities = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Enter city name " + (i + 1) + ": ");
			cities[i] = scanner.nextLine();
		}

		System.out.print("Enter the city name to search for: ");
		String cityToFind = scanner.nextLine();

		boolean found = linearSearch(cities, cityToFind);

		if (found) {
			System.out.println(cityToFind + " is present in the list.");
		} else {
			System.out.println(cityToFind + " is not present in the list.");
		}

		scanner.close();
	}
}
