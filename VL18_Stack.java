public class VL18_Stack <T> {

        private class VL17_Node {
            private T data;
            private VL17_Node next;
        
        
            private VL17_Node(T data, VL17_Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private VL17_Node head;

        public void push(T value) {
            VL17_Node newElement = new VL17_Node(value, head);
            head = newElement;
        }

        public T pop() {
            if (head == null) {
                return null;
            }

            T firstElement = head.data;
            head = head.next;
            return firstElement;
        }
}
