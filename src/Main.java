import java.util.ArrayList;
import java.util.List;

class StackImplementaion {
    // Override the toString() method to provide a string representation of the stack
    @Override
    public String toString() {
        return "Stack [elements=" + elements + "]";
    }

    // Declare a private List to store the elements of the stack
    private List<String> elements = new ArrayList<>();

    // Return the top element of the stack without removing it
    public String peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(elements.size() - 1);
    }

    // Remove and return the top element of the stack
    public String pop() {
        if (elements.isEmpty()) {
            return null;
        }
        String top = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return top;
    }

    // Add an element to the top of the stack
    public void push(String element) {
        elements.add(element);
    }

    // Return the size of the stack
    public int size() {
        return elements.size();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {
        // Create an instance of StackImplementation
        StackImplementaion stack = new StackImplementaion();

        // Check if the stack is empty
        System.out.println("Is Stack Empty: " + stack.isEmpty());

        // Push elements onto the stack
        stack.push("Element1");
        stack.push("Element2");
        stack.push("Element3");
        stack.push("Element4");

        // Check if the stack is empty after pushing elements
        System.out.println("Is Stack Empty: " + stack.isEmpty());

        // Print the string representation of the stack
        System.out.println(stack);

        // Get the size of the stack
        System.out.println("Stack Size: " + stack.size());

        // Peek the top element of the stack without removing it
        System.out.println("Peek Top Element: " + stack.peek());

        // Print the stack after peeking
        System.out.println("After peek: " + stack);

        // Pop the top element of the stack
        System.out.println("Pop Top Element: " + stack.pop());

        // Print the stack after popping
        System.out.println("After pop: " + stack);

        // Get the size of the stack after popping
        System.out.println("Stack Size now: " + stack.size());
    }
}