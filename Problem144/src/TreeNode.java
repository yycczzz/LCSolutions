// Definition of Binary Tree Node

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    //构造函数
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
