package linked_list;

public class TestNewLinkedList {
    public static void main(String[] args) {
        NewLinkedList<String> list1 = new NewLinkedList();

        for (int i = 0; i < 10; i++) {
            list1.add(Integer.toString(i));
        }

        System.out.println(list1.size());

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ", ");
        }
    }
}
