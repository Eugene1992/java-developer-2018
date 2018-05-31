package homeWork05;

public class TestNewList {
    public static void main(String[] args) {
        NewArrayList list1 = new NewArrayList();
        NewArrayList list2 = new NewArrayList(20);

        for (int i = 0; i < 10; i++) {
            list1.add(Integer.toString(i));
        }

        list1.add("100", 5);
        list1.set("test",4);

        System.out.println("list size=== " + list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ", ");
        }
        System.out.println();

        list1.remove(5);

        System.out.println("list size=== " + list1.size());
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + ", ");
        }
        System.out.println();

        System.out.println(list1.contains("test"));
        System.out.println(list1.indexOf("test"));

        System.out.println(list1.isEmpty());
        System.out.println(list2.isEmpty());

//        NewArrayList list3 = list1.subList(1,5);
//        System.out.println("list size=== " + list3.size());
//        for (int i = 0; i < list3.size(); i++) {
//            System.out.print(list3.get(i) + ", ");
//        }
//        System.out.println();


        System.out.println(list1.lastIndexOf("5", 10));
    }
}
