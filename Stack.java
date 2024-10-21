package assig;

class Stack {
	private char[] stack;
	private int top;
	private int maxSize;

	public Stack(int size) {
		this.maxSize = size;
		stack = new char[maxSize];
		top = -1;
	}

	public void push(char value) {
		if (top == maxSize - 1) {
			System.out.println("Stack is full");
			return;
		}
		stack[++top] = value;
	}

	public char pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return '\0';
		}
		return stack[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}
}
