package lists_pckg;

public class MyLiLiTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        for (int i = 0; i < 5; i++) {
            linkedList.add("0");
        }

        linkedList.printList();
    }

}
