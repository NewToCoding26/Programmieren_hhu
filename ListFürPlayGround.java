public class ListFürPlayGround<T> {

    private class Node {
        private T element;
        private Node next;

        private Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }

        private Node(T element) {
            this(element, null);
        }
    }

    private Node head = null;

    public void append(T object) {
        if (head == null) {
            head = new Node(object);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(object);
    }

    public void prepend(T object) {
        head = new Node(object, head);
    }

    public T first() {
        if (head == null) {
            throw new IllegalStateException("Die Liste ist leer.");
        }
        return head.element;
    }

    public T get(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Index " + index + " liegt außerhalb der Liste.");
            }
            current = current.next;
        }
        if (current == null) {
            throw new IndexOutOfBoundsException("Index " + index + " liegt außerhalb der Liste.");
        }
        return current.element;
    }

    public int size() {
        Node current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current.element).append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }
}
