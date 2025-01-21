public class BinarySearchTree<T extends Comparable<T>> { // Comparable<T> funktioniert ähnlich wie unser Sortable

    private class BinaryNode {
        BinaryNode left;
        BinaryNode right;
        T element;
        
        public BinaryNode(T element) {
            this.element = element;
        }
    }
    
    private BinaryNode root;
    
    public void insert(T newObject) {
        if (root == null) {
            root = new BinaryNode(newObject);
            return;
        }
        
        BinaryNode current = root;
        while(true) {
            if(newObject.compareTo(current.element) > 0) {
                if (current.right == null) {
                    current.right = new BinaryNode(newObject);
                    return;
                }
                current = current.right;
            } else if(newObject.compareTo(current.element) < 0) {
                if (current.left == null) {
                    current.left = new BinaryNode(newObject);
                    return;
                }
                current = current.left;
            } else {
                return;
            }
        }
    
    }
    
    @Override
    public String toString() {
//         if (root == null) {
//             return "";
//         }
//         root.left ausgeben + root.element + root.right ausgeben
        return toString(root);
    }
    
    private String toString(BinaryNode current) {
        if (current == null) {
            return "";
        }
        return toString(current.left) + current.element + ", " + toString(current.right);
    }
    
    public T minimum() {
        if(root == null) {
            throw new java.util.NoSuchElementException("tree is empty");
        }
    
        BinaryNode current = root;
        while(current.left != null) {
            current = current.left;
        }
        return current.element;
    }
    
    public T minimumRecursive() {
        if(root == null) {
            throw new java.util.NoSuchElementException("tree is empty");
        }
        
        return minimum(root);
    }
    
    private T minimum(BinaryNode root) {
        assert root != null;
        if (root.left == null) {
            return root.element;
        }
        return minimum(root.left);
    }
    
    public boolean contains(T needle) {
        BinaryNode current = root;
        while(true) {
            if(current == null) {
                return false;
            } else if(current.element.compareTo(needle) == 0) {
                return true;
            } else if(current.element.compareTo(needle) < 0) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
    }
    
    public int size() {
        return size(root);
    }
    
    private int size(BinaryNode root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + 1 + size(root.right);
    }

}
