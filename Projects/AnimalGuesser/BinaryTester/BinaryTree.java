package BinaryTester;

public class BinaryTree {

    protected Node root; // Root node

    /**
     * Based upon "left", it will added a node to the first empty spot it fi
     * @param current
     * @param value
     * @param left
     * @return
     */
    private Node addRecursive(Node current, String value, boolean left) {
        if (current == null)
            return new Node(value);
        if (left) {
            current.left = addRecursive(current.left, value, left);
        } else {
            current.right = addRecursive(current.right, value, left);
        }

        return current;
    }

    public void add(String value, boolean left) {
        root = addRecursive(root, value, left);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traverseInOrder(node.right);
        }
    }

}
