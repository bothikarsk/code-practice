package datastructures;

public class StackTest {
    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation(4);
        try {
            stackImplementation.push(10);
            stackImplementation.push(14);
            stackImplementation.push(18);
            stackImplementation.push(19);
            stackImplementation.pop();
            System.out.println("Peek :"+stackImplementation.peek());
            stackImplementation.push(20);
            stackImplementation.push(25);
            stackImplementation.push(29);
            System.out.println("Peek :"+stackImplementation.peek());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            stackImplementation.pop();
            stackImplementation.pop();
            stackImplementation.pop();
            System.out.println("Peek :"+stackImplementation.peek());
            stackImplementation.pop();
            stackImplementation.pop();
            stackImplementation.pop();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
