package classWork02;

public class StackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<String>();
        myStack.push("test1");
        myStack.push("test2");
        myStack.push("test3");
        myStack.printStack();
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        myStack.printStack();
        System.out.println(myStack.size());
    }
}
