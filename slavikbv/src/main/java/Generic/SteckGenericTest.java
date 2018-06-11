package Generic;

public class SteckGenericTest {
    public static void main(String[] args) {
        SteckGeneric<String> listOne = new SteckGeneric<String>();
        listOne.push("One");
        listOne.push("Two");
        listOne.printList();
        System.out.println();

        SteckGeneric<Integer> listTwo = new SteckGeneric<Integer>();
        listTwo.push(1);
        listTwo.push(2);
        listTwo.push(3);
        listTwo.push(4);
        listTwo.push(5);
        listTwo.push(6);
        listTwo.push(7);
        listTwo.push(8);
        listTwo.push(9);
        listTwo.push(10);
        listTwo.push(11);
        listTwo.printList();
        System.out.println();


        System.out.println(listTwo.pop());
        System.out.println(listTwo.pop());
        System.out.println();

        System.out.println();
        listTwo.push(10);
        listTwo.push(11);
        listTwo.printList();
    }
}
