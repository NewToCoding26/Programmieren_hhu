public class List<T> {

    private class Node {
        private T data;
        private Node next;
        
        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
        
    }

    private Node head;
    
    public void insert(T value) {
        Node newElement = new Node(value, head);
        head = newElement;
    }
    
    public String toString() {
        String output = "";
        Node current = head;
        while(current != null) {
            output += current.data + " -> ";
            current = current.next;
        }
        return output;
    }
    
    public T first() {
        return head.data;
    }
    
    public boolean contains(T value) {
        return indexOf(value) != -1;
    }
    
    public int indexOf(T value) {
        Node current = head;
        int index = 0;
        while(current != null) {
            if(current.data.equals(value)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }
    
    public void delete(T value) {
        Node current = head;
        
        if(head == null) {
            return;
        }
        
        if(head.data.equals(value)) {
            head = head.next;
            return;
        }
        
        // current.next != null -> falls value nicht vorhanden
        while(current.next != null && !current.next.data.equals(value)) {
            current = current.next;
        }
        if(current.next != null) {
            current.next = current.next.next;
        }
    }

}
