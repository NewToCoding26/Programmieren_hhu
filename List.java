public class List<T> {

    private class Node {
        private T element = null;
        private Node next = null;

        private Node(T element, Node next) {
            this.element = element;
            this.next = next;
        }

        private Node(T element) {
            this.element = element;
        }
    }
    
    private Node head = null;
    
    public void add(T object) {
        if(head == null) {
            head = new Node(object);
            return;
        }
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = new Node(object);
    }
    
    public T get(int index) {
        Node current = head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.element;
    }
    
    public int size() {
        Node current = head;
        int size = 0;
        for(; current != null; size++) {
            current = current.next;
        }
        return size;
    }
}
