package tree;

import java.util.ArrayList;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class Root extends Node{

    int value;
    public ArrayList<Node> children;

    public Root(int value) {
        children = new ArrayList<Node>();
        this.value = value;
    }

}
