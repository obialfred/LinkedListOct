/**
 * LinkedList
 */
public class LinkedList<E> {
    Node head = null;
    int size = 0;


    public class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E value) {
            data = value;
            next = null;

        }
    }

    public LinkedList() {
        // Make an instance of the linked list, take in variable of type <E>

        // private Node node = head;
        // Node<E> node = new Node<E>();
        
        LinkedList<E> list1 = new LinkedList<E>();
        
    }


    int size(){
        return size;
    }

    // Add
    public void add(E item) {
        if (head == null) {
            head = new Node(item);
            ++size;
        }
        Node prev = head;
        for (int i = 0; i < size; i++) {
            prev = prev.next;
        }
        Node node = new Node(item);
        prev.next = node;
        ++size;

    }

    public void add(E item, int position) {
        if (position == 0) {
            Node node = new Node(item);
            node.next = head;
            head = node;
            ++size;
        } else {
            Node prev = head;
            for (int i = 0; i < position - 1; i++) {
                prev = prev.next;
            }
            Node node = new Node(item);
            node.next = prev.next;
            prev.next = node;
            ++size;
        }
    }

    // Get
    public E get(int position) {
        Node<E> curr = head;
        for (int i = 0; i < position; i++) {
            curr = curr.next;
        }
        return curr.data;
    }

    // Remove
    public E remove(int position) {
        if (position == 0) {
            Node node = head;
            head = head.next;
            --size;
            return node.data;
        } else {
            Node prev = head;
            for (int i = 0; i < position - 1; i++)
                prev = prev.next;
            Node node = prev.next;
            prev.next = node.next;
            --size;
            return node.data;
        }
    }

    // Reverse
    public E reverse(E head) {
        Node curr;
        Node prev;
        Node next;

        prev = null;
        next = null;
        curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

        return head;
    }
}