package task4;

public class Main {
    public static void main(String[] args) {
        LeftRedBlackTree<Integer> tree = new LeftRedBlackTree<>();
        tree.add(20);
        tree.printTree();
        tree.add(6);
        tree.printTree();
        tree.add(1);
        tree.printTree();
        tree.add(11);
        tree.printTree();
        tree.add(4);
        tree.printTree();
        tree.add(9);
        tree.printTree();

    }
}