package LinkedList;

public class LinkedLTest {
    public static void main(String[] args) {
        LinkedL<String> list = new LinkedL<>();
        list.add("Element_One");
        list.add("Element_Two");
        list.add("Element_Three");
        list.add("Element_Four");
        list.add("Element_Five");
        list.ListOut();
        System.out.println();

        System.out.println(list.getNode(4));
        System.out.println();

        list.remove(1);
        list.ListOut();

    }
}
