package tests;

import junit.framework.Assert;
import org.junit.Test;
import tree.Node;
import tree.Root;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class RootTest {

    @Test
    public void testAddChild() throws Exception {
        Root root = new Root(3);

        Node child = new Node();
        child.setValue(5);

        root.addChild(child);

        ArrayList<Node> list = root.getChildren();
        Assert.assertEquals( 5, list.get(0).getValue());
    }

    @Test
    public void testRemoveChild() throws Exception {
        Root root = new Root(3);

        Node child = new Node();
        child.setValue(5);

        root.addChild(child);
        root.removeChild(child);
        ArrayList<Node> list = root.getChildren();
        assertEquals(0, list.size());
    }
}