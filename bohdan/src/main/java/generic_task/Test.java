package generic_task;

public class Test {
    public static void main(String[] args) {
        MyItem<String> item1 = new MyItem<>("qwe");
        MyItem<String> item2 = new MyItem<>("asd");
        MyItem<String> item3 = new MyItem<>("zxc");

        MyGenericStack<MyItem> stack = new MyGenericStack<>();

        fillStack(stack, item1, item2, item3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        stack.push(new MyItem<String>("test"));

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        for (int i = 0; i < 15; i++) {
            stack.push(new MyItem<String>("SOS#" + i));
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void fillStack(MyGenericStack stack, MyItem... items) {
        for (int i = 0; i < items.length; i++) {
            stack.push(items[i]);
        }
    }
}
