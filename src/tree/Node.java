package tree;

import java.util.ArrayList;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class Node {

    public static Node parent;
    public static int value;
    public static ArrayList<Node> children;

    public  void addChild(Node child){
        child.setParent(this);
        children.add(child);
    }

    public void removeChild(Node childToRemove){
        if (children != null) {
            for (int i = 0; i < children.size(); i++) {
                if (children.get(i) == childToRemove)
                    children.remove(i);
            }
        }
    }

    public Node() {
        children = new ArrayList<Node>();
    }

    public Node getParent() {
        return parent;
    }

    public static int getValue() {
        return value;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public static void setValue(int value) {
        Node.value = value;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

}
