public class Node {
    protected String value;
    protected boolean question = false;
    protected Node left;
    protected Node right;

    public Node(String value) {
        this.value = value;
        left = null;
        right = null;
    }
}
