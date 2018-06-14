package ArrayListImpl;

import java.util.Iterator;

public class ArrayIteratorTest {
    public static void main(String[] args) {
        ArrayL arrayList = new ArrayL(4);
        Iterator iterator = arrayList.iterator();
        for (int i = 0; i < 4; i++) {
            arrayList.add(i + 1);
        }
        arrayList.arrayListOut();

        for (int i = 0; i < arrayList.size() + 1; i++) {
            if (iterator.hasNext()) {
                System.out.println("element " + iterator.next());
            }
        }

    }
}



