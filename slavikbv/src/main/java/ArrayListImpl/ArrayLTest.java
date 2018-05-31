package ArrayListImpl;

public class ArrayLTest {
    public static void main(String[] args) {
        ArrayL arrayList = new ArrayL(3);
        ArrayL arrayList1 = new ArrayL(3);

        for (int i = 0; i < arrayList.capacity; i++) {
            arrayList.add(i + 1);
        }
        arrayList.arrayListOut();


        System.out.println("adding element");
        arrayList.add(22);
        arrayList.arrayListOut();
        System.out.println();

        System.out.println("removing element");
        arrayList.remove(3);
        arrayList.arrayListOut();
        System.out.println();

        System.out.println("isEmpty");
        System.out.println(arrayList.isEmpty());
        System.out.println();

        System.out.println("size");
        System.out.println(arrayList.size());
        System.out.println();

        System.out.println("contains 0");
        System.out.println(arrayList.contains(0));
        System.out.println();

        System.out.println("subList");
        arrayList.arrayListOut();
        System.out.println(arrayList.subList(0, 3)[0]);


    }

}
