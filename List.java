public class List {

    private class Node {
        private int value;
        private Node next;

        private Node(int element, Node next) {
            this.value = element;
            this.next = next;
        }
    }

    private Node head;

    public List() {
        head = null;
    }

    public List(int[] values) {
        for (int value : values) {
            add(value);
        }
    }

    public void add(int value) {
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(value, null);
        }
    }

    public int get(int index) {
        if (head == null) {
            return -1;
        }
        Node current = head;
        int count = 0;
        Node last = null;

        while (current != null) {
            last = current;
            if (count == index) {
                return current.value;
            }
            current = current.next;
            count++;
        }
        return last != null ? last.value : -1;
    }

    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void addAll(int[] values) {
        for (int value : values) {
            add(value);
        }
    }

    public String toString() {
        if (head == null) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(",");
            }
            current = current.next;
        }
        return result.toString();
    }

    public int find(int value) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.value == value) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public int findLast(int value) {
        Node current = head;
        int index = 0;
        int lastIndex = -1;
        while (current != null) {
            if (current.value == value) {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }
        return lastIndex;
    }

    public void remove(int index) {
        if (head == null || index < 0) {
            return;
        }
        if (index == 0) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 1 && current.next != null; i++) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void removeFirstOccurrence(int value) {
        if (head == null) {
            return;
        }
        if (head.value == value) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.value == value) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void removeLastOccurrence(int value) {
        if (head == null) {
            return;
        }
        Node current = head;
        Node lastMatch = null;
        Node beforeLastMatch = null;
        Node previous = null;

        while (current != null) {
            if (current.value == value) {
                beforeLastMatch = previous;
                lastMatch = current;
            }
            previous = current;
            current = current.next;
        }

        if (lastMatch == null) {
            return; 
        }
        if (lastMatch == head) {
            head = head.next;
        } else if (beforeLastMatch != null) {
            beforeLastMatch.next = lastMatch.next;
        }
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;
            sorted = insertSorted(sorted, current);
            current = next;
        }
        head = sorted;
    }

    private Node insertSorted(Node sorted, Node newNode) {
        if (sorted == null || newNode.value <= sorted.value) {
            newNode.next = sorted;
            return newNode;
        }
        Node current = sorted;
        while (current.next != null && current.next.value < newNode.value) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        return sorted;
    }

    public static void main(String[] args) {
        List list = new List();
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(5);

        System.out.println("Liste: " + list);
        System.out.println("Länge: " + list.length());
        System.out.println("Index von 4: " + list.find(4));
        System.out.println("Letzter Index von 1: " + list.findLast(1));

        list.remove(2);
        System.out.println("Nach Entfernen von Index 2: " + list);

        list.sort();
        System.out.println("Nach dem Sortieren: " + list);

        list.removeFirstOccurrence(1);
        System.out.println("Nach Entfernen des ersten Vorkommens von 1: " + list);

        list.removeLastOccurrence(5);
        System.out.println("Nach Entfernen des letzten Vorkommens von 5: " + list);
    }
}

