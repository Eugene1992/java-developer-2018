package lists_pckg;

public class MyLiLiTest {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.add(i + "");
        }
        linkedList.printList();

        linkedList.add("end");
        linkedList.add(2, "test");
        linkedList.printList();

        linkedList.set(0, "zero");
        linkedList.printList();

        System.out.println("~~ " + linkedList.get(0) + " ==> " + linkedList.get(2) + " ==> " + linkedList.get(6) + " ~~");

        linkedList.remove(3);
        linkedList.printList();

    }

}
