package lists_pckg;

public class MyArLiTest {
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add("0");
        }
        arrayList.printList();
        System.out.println();

        arrayList.add(3, "1");
        arrayList.printList();
        System.out.println();

        arrayList.set(1, "test");
        arrayList.printList();
        System.out.println();

        arrayList.remove(1);
        arrayList.printList();
        System.out.println();

        MyList subList = arrayList.subList(1, 4);
        subList.printList();

    }
}
