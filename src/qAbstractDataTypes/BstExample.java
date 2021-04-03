package qAbstractDataTypes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BstExample {

    @Test(dataProvider = "insertNodes")
    public void insertNodesTest(int[] initialNodes, int[] newNodes, int[] finalValues ) {
        BinarySearchTree bst = new BinarySearchTree(initialNodes);
        bst.insertNodes(newNodes);
        BinarySearchTree finalTree = new BinarySearchTree(finalValues);
        System.out.println(bst.length());
        assertTrue(bst.length() == finalTree.length());
        assertTrue(bst.equals(finalTree));
    }

    @DataProvider(name = "insertNodes")
    public Object[][] insertNodesDP() {
        return new Object[][] {
                {new int[] {1, 2, 3}, new int[]{4, 5}, new int[]{1, 2, 3, 4, 5}},
                {new int[] {1, 2, 3}, new int[]{4, 5}, new int[]{4, 5, 3, 2, 1}},
                {new int[] {1, 2, 3}, new int[]{}, new int[]{3, 2, 1}},
                {new int[] {}, new int[]{2, 3, 1}, new int[]{3, 2, 1}}
        };
    }

    @Test(dataProvider = "deleteNodes")
    public void deleteNodesTest(int[] initialNodes, int deleteNode, int[] finalValues ) {
        BinarySearchTree bst = new BinarySearchTree(initialNodes);
        bst.delete(deleteNode);
        BinarySearchTree finalTree = new BinarySearchTree(finalValues);
        System.out.println(bst.length());
        assertTrue(bst.length() == finalTree.length());
        assertTrue(bst.equals(finalTree));
    }

    @DataProvider(name = "deleteNodes")
    public Object[][] deleteNodesDP() {
        return new Object[][] {
                {new int[] {10, 3, 15, 7, 5, 9, 8, 0, 2, 1}, 3, new int[]{10, 15, 7, 5, 9, 8, 0, 2, 1}}
//                {new int[] {1, 2, 3}, new int[]{4, 5}, new int[]{4, 5, 3, 2, 1}},
//                {new int[] {1, 2, 3}, new int[]{}, new int[]{3, 2, 1}},
//                {new int[] {}, new int[]{2, 3, 1}, new int[]{3, 2, 1}}
        };
    }

    @Test
    public void traverseInOrder() {
        BinarySearchTree bst = new BinarySearchTree(new int[] {10, 3, 15, 7, 5, 9, 8, 0, 2, 1});
        bst.traverseInOrder(bst.getRoot());
        ADTList ll = bst.sortedTree();
    }


}
