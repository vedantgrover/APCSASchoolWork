public class BinaryTree {
    protected Node root = new Node("Does the animal have legs?");

    //private static Scanner sc = new Scanner(System.in);

    private Node addRecursive(Node current, String value, String answer) {
        if (current == null) return new Node(value);
        if (answer.equalsIgnoreCase("yes")) {
            current.right = addRecursive(current, value, answer);
        } else if (answer.equalsIgnoreCase("no")) {
            current.left = addRecursive(current, value, answer);
        } else {
            return current;
        }

        return current;
    }

    public void add(String value, String answer) {
        root = addRecursive(root, value, answer);
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            // traverseInOrder(node.left);
            // System.out.print(" " + node.value);
            // traverseInOrder(node.right);
            
        }
    }

    public void  traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}
