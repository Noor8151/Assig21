package assig;

import java.util.Scanner;

public class Doubly_Main {
	public static void main(String[] args) {
		doubly obj = new doubly();
		Scanner in = new Scanner(System.in);
		int ch, e;

		obj.create_list(); 
		do {
			System.out.println("\n1. Insert Left\n2. Insert Right\n3. Display Odd Values\n0. Exit");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_left(e);
				break;
			case 2:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_right(e);
				break;
			case 3:
				obj.print_odd_values();
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
		} while (ch != 0);

		in.close();
	}
}
