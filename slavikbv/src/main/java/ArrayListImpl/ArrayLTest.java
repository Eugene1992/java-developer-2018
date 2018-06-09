package ArrayListImpl;

public class ArrayLTest {
    public static void main(String[] args) {
        ArrayL arrayList = new ArrayL(4);
        ArrayL arrayList1 = new ArrayL(2);
        // ArrayL arrayListTwo = new ArrayL(-54);

        for (int i = 0; i < 3; i++) {
            arrayList.add(i + 1);
        }
        arrayList.arrayListOut();


        System.out.println("adding element");
        arrayList.add(22);
        arrayList.arrayListOut();
        System.out.println();

        System.out.println("removing element");
        arrayList.remove(2);
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
        arrayList1 = arrayList.subList(0, 1);
        arrayList1.arrayListOut();

        System.out.println("indexOf");
        arrayList.arrayListOut();
        System.out.println(arrayList.indexOf(5));


    }


}


