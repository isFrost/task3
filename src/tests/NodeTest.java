package tests;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;
import tree.Node;

/**
 * Created by isend_000 on 6/30/2015.
 */
public class NodeTest extends TestCase {

    @Test
    public void testAddChild() throws Exception {
        Node parent = new Node();
        parent.setValue(3);

        Node child = new Node();
        child.setValue(5);

        parent.addChild(child);

        ArrayList<Node> list = parent.getChildren();
        Assert.assertEquals(list.get(0).getValue(), 5);
    }

    @Test
    public void testRemoveChild() throws Exception {
        Node parent = new Node();
        parent.setValue(3);

        Node child = new Node();
        child.setValue(5);

        parent.addChild(child);
        parent.removeChild(child);
        ArrayList<Node> list = parent.getChildren();
        assertEquals(list.size(), 0);
    }
}