package assig;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SinglyLinkedList {
	private Node head;

	public void createList() {
		head = null;
	}

	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		System.out.println(data + " inserted");
	}

	public void displayList() {
		if (head == null) {
			System.out.println("List Empty");
		} else {
			Node current = head;
			while (current != null) {
				System.out.print("[" + current.data + "] -> ");
				current = current.next;
			}
			System.out.println("null");
		}
	}

	public void searchNode(int key) {
		Node current = head;
		while (current != null) {
			if (current.data == key) {
				System.out.println(key + " found in the list");
				return;
			}
			current = current.next;
		}
		System.out.println(key + " not found in the list");
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		Scanner scanner = new Scanner(System.in);
		int choice, element;

		list.createList();

		do {
			System.out.println("\n1. Insert at Last\n2. Display List\n3. Search Node\n0. Exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter element to insert: ");
				element = scanner.nextInt();
				list.insertAtLast(element);
				break;
			case 2:
				list.displayList();
				break;
			case 3:
				System.out.print("Enter element to search: ");
				element = scanner.nextInt();
				list.searchNode(element);
				break;
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid option. Please try again.");
				break;
			}
		} while (choice != 0);

		scanner.close();
	}
}
