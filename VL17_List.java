public class VL17_List {

    private class VL17_Node {
        private int data;
        private VL17_Node next;
    
    
        private VL17_Node(int data, VL17_Node next) {
            this.data = data;
            this.next = next;
        }
    }


    
    private VL17_Node head;

    public void delete(int value) {
        VL17_Node current = head;

        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        while (current.next != null && current.next.data != value) {
            current = current.next;
        }
        // Zu loeschendes Element gefunden?
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void insert(int value) {
        VL17_Node newElement = new VL17_Node(value, head);
        head = newElement;
    }

    public String toString() {
        String output = "";
        VL17_Node current = head;

        while (current != null) {
            output += current.data + " --> ";
            current = current.next;
        }
        return output;
    }

    public int at(int index) {
        VL17_Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (index == currentIndex) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }
        return -1;
    }
}
