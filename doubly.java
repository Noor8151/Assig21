package assig;

public class doubly {
	Dnode1 root;

	void create_list() {
		root = null;
	}

	void insert_left(int data) {
		Dnode1 n = new Dnode1(data);
		if (root == null) {
			root = n;
		} else {
			n.right = root;
			root.left = n;
			root = n;
		}
		System.out.println(data + " inserted");
	}

	void insert_right(int data) {
		Dnode1 n = new Dnode1(data);
		if (root == null) {
			root = n;
		} else {
			Dnode1 t = root;
			while (t.right != null) {
				t = t.right;
			}
			t.right = n;
			n.left = t;
		}
		System.out.println(data + " inserted");
	}

	void print_odd_values() {
		if (root == null) {
			System.out.println("List Empty");
			return;
		}
		Dnode1 current = root;
		System.out.print("Odd values: ");
		boolean found = false;
		while (current != null) {
			if (current.data % 2 != 0) {
				System.out.print(current.data + " ");
				found = true;
			}
			current = current.right;
		}
		if (!found) {
			System.out.println("No odd values found.");
		} else {
			System.out.println();
		}
	}
}
