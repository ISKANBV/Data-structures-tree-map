package binary_search_tree;

public class Node implements Comparable<Node> {

    public Long data;
    public Node left;
    public Node right;

    public Node(Long data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(Long data) {
        this.data = data;
    }

    public void add(Long data){

        var node = new Node(data);

        if(node.data.compareTo(this.data) == -1){

            if(left == null){
                left = node;
            }
            else {
                left.add(data);
            }
        }
        else {
            if (right == null){
                right = node;
            }
            else {
                right.add(data);
            }
        }
    }

    public Long getData() {
        return data;
    }

    private void setData(Long data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    private void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    private void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node o) {
        return Long.compare(getData(),o.getData());
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
