package qAbstractDataTypes;

public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.value = val;
        left = null;
        right = null;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

}
