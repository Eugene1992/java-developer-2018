package ArrayListImpl;

public class ArrayIteratorTest {
    public static void main(String[] args) {
        ArrayL arrayList = new ArrayL(4);
        ArrayL arrayListOne = new ArrayL();
        for (int i = 0; i < 4; i++) {
            arrayList.add(i + 1);
        }
        arrayList.arrayListOut();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.iterator().hasNext()) {
                System.out.println(i + " - element exists");
            }
        }


        System.out.println("Next element: " + arrayList.iterator().next());
        System.out.println("Next element: " + arrayList.iterator().next());
    }
}



