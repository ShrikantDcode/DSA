package mimic;


public class MimicStrack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack with a given size
    public MimicStrack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize the stack as empty
    }

    // Push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Return an error value
        } else {
            return stackArray[top--];
        }
    }

    // Peek at the top element of the stack without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1; // Return an error value
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Get the current size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        MimicStrack stack = new MimicStrack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack is empty: " + stack.isEmpty());

        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);  // Attempt to push into a full stack

        System.out.println("Top element is: " + stack.peek());
    }
}

