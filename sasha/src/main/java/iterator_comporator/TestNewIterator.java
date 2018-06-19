package iterator_comporator;

import array_list.NewArrayList;

public class TestNewIterator {
    public static void main(String[] args) {
        NewArrayList<String> list1 = new NewArrayList();

        for (int i = 0; i < 10; i++) {
            list1.add(Integer.toString(i));
        }

        MyIterator<String> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + ", ");
        }
        System.out.println();

        itr1 = list1.iterator();
        while (itr1.hasNext()) {
            String elem = itr1.next();
            if (elem.equals("5")) {
                itr1.remove();
            }
        }

        itr1 = list1.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + ", ");
        }
    }
}
