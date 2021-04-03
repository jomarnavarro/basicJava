package qAbstractDataTypes;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BinarySearchTree(int[] initialElements) {
        this();
        insertNodes(initialElements);
    }

    public TreeNode getRoot() {
        return this.root;
    }

    public void insert(int val) {
        root = addRecursive(root, val);

    }

    public void insertNodes(int[] nodes) {
        for (int i = 0; i < nodes.length; i++) {
            insert(nodes[i]);
        }
    }

    public TreeNode addRecursive(TreeNode current, int val) {
        if(current == null) {
            return new TreeNode(val);
        }
        if(val < current.getValue()) {
            current.left = addRecursive(current.left, val);
        } else if(val > current.getValue()) {
            current.right = addRecursive(current.right, val);
        } else {
            return current;
        }
        return current;
    }

    public void delete(int val) {
        if(containsNode(val)) {
            root = deleteRecursive(root, val);
        }
    }

    public TreeNode deleteRecursive(TreeNode current, int val) {
        if(current == null) {
            return null;
        }
        if(val == current.getValue()) {
            //Node to delete found
            //case current node is a leaf
            if(current.left == null && current.right == null) {
                return null;
            }
            if(current.right == null) {
                return current.left;
            }
            if(current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }
        if(val < current.getValue()) {
            current.left = deleteRecursive(current.left, val);
        }
        current.right = deleteRecursive(current.right, val);
        return current;
    }

    private int findSmallestValue(TreeNode root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public boolean containsNode(int val) {
        return containsNodeRecursive(root, val);
    }

    private boolean containsNodeRecursive(TreeNode current, int val) {
        if(current == null)
            return false;
        if(val == current.getValue())
            return true;
        return val < current.getValue() ?
                containsNodeRecursive(current.getLeft(), val) :
                containsNodeRecursive(current.getRight(), val);
    }

    public int length() {
        return treeLength(root, 0);
    }

    public int treeLength(TreeNode current, int currentLength) {
        if(current == null)
            return currentLength;
        currentLength++;
        return currentLength
                + treeLength(current.getLeft(), 0)
                + treeLength(current.getRight(), 0);
    }

    public boolean equals(BinarySearchTree t) {
        ADTList elementList = new ADTList();
        return containsNode(root, t);
    }

    public boolean containsNode(TreeNode current, BinarySearchTree t) {
        if(current == null)
            return true;
        return containsNodeRecursive(t.getRoot(), current.getValue()) &&
                containsNode(current.left, t) &&
                containsNode(current.right, t);
    }

    public void traverseInOrder(TreeNode node) {
        if(node != null) {
            traverseInOrder(node.left);
            System.out.println(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public ADTList sortedTree() {
        ADTList ll = new ADTList();
        traverseInOrder(ll, root);
        return ll;
    }

    public void traverseInOrder(ADTList ll, TreeNode node) {
        if(node != null) {
            traverseInOrder(ll, node.left);
            ll.insertElement(node.value);
            traverseInOrder(ll, node.right);
        }
    }
}
