package BinaryTrees;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add(10);
        tree.add(6);
        tree.add(4);
        tree.add(3);
        tree.add(7);
        tree.add(8);
        tree.add(2);
        tree.add(5);
        tree.add(6);
        tree.add(13);
        tree.add(18);
        tree.add(20);
        tree.add(1);

        tree.traverseInOrder(tree.root);
    }
}
