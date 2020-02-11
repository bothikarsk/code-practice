package datastructures;

public class StackImplementation {

    private int[] stackArray;
    private int top;
    private int stackSize;

    //Constructor to initialise array size
    public StackImplementation(int size) {
        this.stackSize = size;
        this.stackArray = new int[stackSize];
        this.top = -1;
    }

    //To add entry to stack
    public void push(int entry) throws Exception {
        if (isStackOverFlow()) {
            throw new RuntimeException("Stack is already full.Can not add element");
        }
        System.out.println("Push: " + entry);
        this.stackArray[++top] = entry;
        printStack();
    }

    //To remove entry from stackl
    public int pop() throws Exception {
        if (isStackEmpty()) {
            throw new RuntimeException("Stack is empty.Can not delete element");
        }
        int entry = this.stackArray[top--];
        System.out.println("Pop : " + entry);
        printStack();
        return entry;
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isStackOverFlow() {
        return (top == stackArray.length - 1);
    }

    public boolean isStackEmpty() {
        return (top == -1);
    }

    public void printStack() {
        System.out.print("Stack after operation: [ ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
