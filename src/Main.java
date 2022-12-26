import binary_search_tree.Tree;

public class Main {
    public static void main(String[] args) {

        var tree = new Tree();
        tree.add(6L);
        tree.add(3L);
        tree.add(7L);
        tree.add(5L);
        tree.add(10L);
        tree.add(2L);
        tree.add(12L);
        tree.add(9L);
        tree.add(4L);

        System.out.println(tree.order());

    }
}