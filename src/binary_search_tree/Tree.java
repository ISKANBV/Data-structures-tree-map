package binary_search_tree;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    public Node root;
    public int count;

    public void add(Long data){

        if(root == null){
            root = new Node(data);
            count = 1;
            return;
        }

        root.add(data);
        count++;
    }

    public List<Long> order(){

        if (root == null)
        {
            return new ArrayList<>();
        }

        return order(root);
    }

    private List<Long> order(Node node){

        var list = new ArrayList<Long>();

        if(node != null){
            if(node.left != null){
                list.addAll(order(node.left));
            }

            list.add(node.data);

            if(node.right != null){
                list.addAll(order(node.right));
            }
        }
        return list;
    }
}
