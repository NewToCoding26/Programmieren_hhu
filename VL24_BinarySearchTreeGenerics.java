public class VL24_BinarySearchTreeGenerics<T extends VL15_Sortable> {

    private class BinaryNode {
        private BinaryNode left;
        private BinaryNode right;
        private T element;

        public BinaryNode(T element) {
            this.element = element;
        }
    }

    private BinaryNode root;

    public void insert(T newNumber){
        if (root == null) {
            root = new BinaryNode(newNumber);
            return;
        }

        BinaryNode current = root;

        while (true) {
            
        if (newNumber.getSortKey() > current.element.getSortKey()) {
            if(current.right == null) {
                current.right = new BinaryNode(newNumber);
                return;
            }
            current = current.right;
        }else if (newNumber.getSortKey() < current.element.getSortKey()) {
            if (current.left == null) {
                current.left = new BinaryNode(newNumber);
                return;
            }
            current = current.left;
        }else {
            //Gleichheit
            return;
        }
    }
}

    @Override
    public String toString() {
        return toString(root); 
    }

    private String toString(BinaryNode subTreeRoot) {
        if (subTreeRoot == null) {
            return "";
        }
        return toString(subTreeRoot.left) + subTreeRoot.element + ", " + toString(subTreeRoot.right); 
    }

    public T minimum() {
        if (root == null) {
            throw new java.util.NoSuchElementException("Baum ist leer");
        }

        BinaryNode current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.element;
    }

    public T minimumRecursiv() {
        if (root == null) {
            throw new java.util.NoSuchElementException("Baum ist leer");
        }
        return minimumRecursiv(root);
    }

    private T minimumRecursiv(BinaryNode subTreeRoot) {
        if (subTreeRoot.left == null) {
            return subTreeRoot.element;
        }
        return minimumRecursiv(subTreeRoot.left);
    }

    public boolean contains(T needle) {
        BinaryNode current = root;
        while (current != null) {
            
        if (current.element.getSortKey()  == needle.getSortKey()) {
            return true;
        }else if (current.element.getSortKey() < needle.getSortKey()) {
            current = current.right;
        }else {
            // current.element > needle
            current = current.left;
        }

    }
    return false;
}

    public int size() {
        return size(root);
    }

    private int size(BinaryNode subTreeRoot) {
        if (subTreeRoot == null) {
            return 0;
        }
        return size(subTreeRoot.left) + size(subTreeRoot.right) + 1;
    }

    public void deleteMinimum() {
        root = deleteMinimum(root);
    }

    private BinaryNode deleteMinimum(BinaryNode root) {
        // Baum leer?
        if (root == null) {
            throw new java.util.NoSuchElementException("tree is empty");
        }

        // Muss die Wurzel geloescht werden?
        if (root.left == null) {
            return root.right;
        }

        BinaryNode currrent = root;
        while (currrent.left.left != null) {
            currrent = currrent.left;
        }

        currrent.left = currrent.left.right;
        return root;
    }


    public void delete(T number) {
        root = delete(root, number);
    }

    private BinaryNode delete(BinaryNode current, T number) {
        // Abruchbedingung fuer die Rekursion bzw. Baum leer
        if (current == null) {
            return null;
        }

        // Ist die gesuchte Zahl im linken Teilbaum?
        if (number.getSortKey() < current.element.getSortKey()) {
            current.left = delete(current.left, number);
        }
        // Ist die gesuchte Zahl im linken Teilbaum?
        else if(number.getSortKey() > current.element.getSortKey()) {
            current.right = delete(current.right, number);
        }
        // Zu loeschendes Element gefunden; "current" zeigt auf das zu loeschende Element
        else{
            // Einfacher Fall: nur ein Kind Links vorhanden
            if (current.right == null) {
                return current.left;
            }

            // Einfacher Fall: nur ein Kind rechts vorhanden
            if (current.left == null) {
                return current.right;
            }

            // Komplizierter Fall: zwei kinder vrohanden

            // Suche das Minimum im rechten Teilbaum
            T minimumRight = minimumRecursiv(current.right);

            // Entferne das minimum im rechten Teilbaum und aktualisiere "current.right"
            current.right = deleteMinimum(current.right);

            // Ersetze die geloeschte Zahl durch das zuvor gesicherte Minimum
            current.element = minimumRight;
        }
        return current;

    }

    public static void main(String[] args) {
        VL24_BinarySearchTreeGenerics<VL15_Studi> t = new VL24_BinarySearchTreeGenerics<VL15_Studi>();
        t.insert(new VL15_Studi("sashs", 4782));
        t.insert(new VL15_Studi("kasre", 9387));
        t.insert(new VL15_Studi("laid", 6463));
        System.out.println(t);

        t.deleteMinimum();
        System.out.println(t);
    }
}
