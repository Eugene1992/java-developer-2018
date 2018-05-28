package lists_pckg;

public class MyArLiTest {
    public static void main(String[] args) {
        MyArrayList arrayList = new MyArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add("test");
        }
        arrayList.printList();

        arrayList.add(3, "1");
        arrayList.printList();

        arrayList.set(1, "0");
        arrayList.printList();

        arrayList.remove(1);
        arrayList.printList();
    }
}
