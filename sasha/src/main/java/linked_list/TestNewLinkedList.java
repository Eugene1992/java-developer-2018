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

        System.out.println();
        list1.add("10",5);
        list1.set("test",4);
        list1.remove(6);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ", ");
        }
        System.out.println();

        System.out.println(list1.contains("test"));
        System.out.println(list1.indexOf("test"));
        System.out.println(list1.lastIndexOf("test",3));
    }
}
