package classWork02;

public class StackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("test1");
        myStack.printStack();
        myStack.push("test2");
        myStack.printStack();
        myStack.push("test3");
        myStack.printStack();
        myStack.pop();
        myStack.printStack();
    }
}
