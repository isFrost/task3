package tests;

import org.junit.Test;
import tree.Node;
import tree.Root;
import tree.Tree;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class TreeTest {

    @Test
    public void testAddNode() throws Exception {
        Root root = new Root(3);
        Tree tree = new Tree(root);

        Node node = new Node();
        node.setValue(2);

        tree.addNode(root, node);

        ArrayList<Node> list = tree.getNodes();

        assertEquals(2, list.get(1).getValue());
    }

    @Test
    public void testRemoveNode() throws Exception {
        Root root = new Root(3);
        Tree tree = new Tree(root);

        Node node = new Node();
        node.setValue(2);

        tree.addNode(root, node);
        tree.removeNode(root, node);

        ArrayList<Node> list = tree.getNodes();

        assertEquals(1, list.size());
    }

    @Test
    public void testGetTreeHeight() throws Exception {
        Root root = new Root(3);
        Tree tree = new Tree(root);

        Node node = new Node();
        node.setValue(2);

        tree.addNode(root, node);
        assertEquals(2, tree.getTreeHeight());
    }
}