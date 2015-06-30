package tree;

import java.util.ArrayList;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class Tree {
    public  Root root;
    public static ArrayList<Node> nodes;

    public void addNode(Node parent, Node child){
        parent.addChild(child);
        nodes.add(child);
    }

    public void removeNode(Node parent, Node child){
        parent.removeChild(child);
        for (int i = 0; i < nodes.size(); i++){
            if (nodes.get(i) == child)
                nodes.remove(i);
        }
    }

    public static int getTreeHeight(){
        int height = 0;
        for (Node node : nodes){
            if (node.getChildren() != null)
                height++;
        }
        return  height;
    }

    public Tree(Root root) {
        nodes = new ArrayList<>();
        this.root = root;
        nodes.add(root);
    }

    public Root getRoot() {
        return root;
    }

    public void setRoot(Root root) {
        this.root = root;
    }

    public static ArrayList<Node> getNodes() {
        return nodes;
    }

    public static void setNodes(ArrayList<Node> nodes) {
        Tree.nodes = nodes;
    }
}
