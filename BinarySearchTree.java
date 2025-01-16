import java.util.NoSuchElementException;

public class BinarySearchTree {

    private class BinaryNode {
        private int element;
        private BinaryNode left;
        private BinaryNode right;

        private BinaryNode(int element) {
            this.element = element;
        }
    }

    private BinaryNode root;

    public void insert(int newNumber) {
        if (root == null) {
            root = new BinaryNode(newNumber);
            return;
        }

        BinaryNode parent = null;
        BinaryNode child = root;
        while (child != null) {
            parent = child;
            if (newNumber == child.element) {
                return;
            } else if (newNumber < child.element) {
                child = child.left;
            } else {
                child = child.right;
            }
        }

        if (newNumber < parent.element) {
            parent.left = new BinaryNode(newNumber);
        } else {
            parent.right = new BinaryNode(newNumber);
        }
    }

    public int maximumRecursive() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        return maximumRecursive(root);
    }

    private int maximumRecursive(BinaryNode node) {
        if (node.right == null) {
            return node.element;
        }
        return maximumRecursive(node.right);
    }

    public int maximumIterative() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        BinaryNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.element;
    }

    public int height() {
        return height(root);
    }

    private int height(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public int sum() {
        return sum(root);
    }

    private int sum(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return node.element + sum(node.left) + sum(node.right);
    }

    public String reverseOrder() {
        StringBuilder sb = new StringBuilder();
        reverseOrderHelper(root, sb);
        return sb.toString().trim();
    }

    private void reverseOrderHelper(BinaryNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }
        reverseOrderHelper(node.right, sb);
        sb.append(node.element).append(", ");
        reverseOrderHelper(node.left, sb);
    }

    public String toDescendingString() {
        StringBuilder result = new StringBuilder();
        toDescendingString(root, result);
        return result.toString().substring(0, result.length() - 2);
    }

    private void toDescendingString(BinaryNode node, StringBuilder result) {
        if (node == null) {
            return;
        }
        toDescendingString(node.right, result);
        result.append(node.element).append(", ");
        toDescendingString(node.left, result);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        System.out.println("Maximum (recursive): " + tree.maximumRecursive());
        System.out.println("Maximum (iterative): " + tree.maximumIterative());
        System.out.println("Height: " + tree.height());
        System.out.println("Sum: " + tree.sum());
        System.out.println("Descending String: " + tree.toDescendingString());
        System.out.println("Reverse Order: " + tree.reverseOrder());
    }
}
