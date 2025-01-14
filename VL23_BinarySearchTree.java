public class VL23_BinarySearchTree {

    private class BinaryNode {
        private BinaryNode left;
        private BinaryNode right;
        private int element;

        public BinaryNode(int element) {
            this.element = element;
        }
    }

    private BinaryNode root;

    public void insert(int newNumber){
        if (root == null) {
            root = new BinaryNode(newNumber);
            return;
        }

        BinaryNode current = root;

        while (true) {
            
        if (newNumber > current.element) {
            if(current.right == null) {
                current.right = new BinaryNode(newNumber);
                return;
            }
            current = current.right;
        }else if (newNumber < current.element) {
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

    public int minimum() {
        if (root == null) {
            throw new java.util.NoSuchElementException("Baum ist leer");
        }

        BinaryNode current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.element;
    }

    public int minimumRecursiv() {
        if (root == null) {
            throw new java.util.NoSuchElementException("Baum ist leer");
        }
        return minimumRecursiv(root);
    }

    private int minimumRecursiv(BinaryNode subTreeRoot) {
        if (subTreeRoot.left == null) {
            return subTreeRoot.element;
        }
        return minimumRecursiv(subTreeRoot.left);
    }

    public boolean contains(int needle) {
        BinaryNode current = root;
        while (current != null) {
            
        if (current.element  == needle) {
            return true;
        }else if (current.element < needle) {
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


    public void delete(int number) {
        root = delete(root, number);
    }

    private BinaryNode delete(BinaryNode current, int number) {
        // Abruchbedingung fuer die Rekursion bzw. Baum leer
        if (current == null) {
            return null;
        }

        // Ist die gesuchte Zahl im linken Teilbaum?
        if (number < current.element) {
            current.left = delete(current.left, number);
        }
        // Ist die gesuchte Zahl im linken Teilbaum?
        else if(number > current.element) {
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
            int minimumRight = minimumRecursiv(current.right);

            // Entferne das minimum im rechten Teilbaum und aktualisiere "current.right"
            current.right = deleteMinimum(current.right);

            // Ersetze die geloeschte Zahl durch das zuvor gesicherte Minimum
            current.element = minimumRight;
        }
        return current;

    }

    public static void main(String[] args) {
        VL23_BinarySearchTree t = new VL23_BinarySearchTree();
        t.insert(9);
        t.insert(12);
        t.insert(3);
        t.insert(1);
        t.insert(6);
        t.insert(4);
        t.insert(7);
        t.insert(5);
        System.out.println(t);

        t.delete(3);
        System.out.println(t.toString());
      
    }
}
