package LinkedList;

public class LinkedL<E> {

    private int size;
    private Node<E> first;
    private Node<E> last;


    LinkedL() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void add(E element) {
        Node<E> preLast = last;
        Node<E> newNode = new Node<>(preLast, element, null);
        last = newNode;
        if (preLast == null) {
            first = newNode;
        } else {
            preLast.next = newNode;
        }
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (index == size) {
            last = last.prev;
            last.next = null;
        } else if (index == 0) {
            first = first.next;
            first.prev = null;
        } else {
            getNode(index - 1).next = getNode(index + 1);
            getNode(index).prev = getNode(index - 1);
        }
        size--;
    }


    public void ListOut() {
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(getNode(i) + " ");
        }
        System.out.println(" ]");
    }

    public Node<E> getNode(int index) {
        if (index > size || index < 0) throw new IndexOutOfBoundsException("wrong index");
        Node<E> link = first;
        for (int i = 1; i <= index; i++) {
            link = link.next;
        }
        return link;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            this.element = element;
            this.next = next;
        }

        public String toString() {
            return element + "";
        }
    }
}
