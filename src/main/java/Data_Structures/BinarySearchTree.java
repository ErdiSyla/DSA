package Data_Structures;

import com.sun.source.tree.BinaryTree;

public class BinarySearchTree {

    TreeNode root;

    public static void main(String[] args) {
        BinarySearchTree binaryTree = new BinarySearchTree();

        binaryTree.insert(8);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(12);
        binaryTree.insert(15);
        binaryTree.insert(5);

        binaryTree.inOrder();
        binaryTree.preOrder();
        binaryTree.postOrder();
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data){

        if(root == null){
            root = new TreeNode(data);
        }else if(data < root.data){
            root.left = insertRec(root.left, data);
        }else if(data > root.data){
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inOrder(){
        inOrderRec(root);
    }

    private void  inOrderRec(TreeNode root){

        if(root != null){
            inOrderRec(root.left);
            System.out.println(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){
        preOrderRec(root);
    }

    private void  preOrderRec(TreeNode root){

        if(root != null){
            System.out.println(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    public void postOrder(){
        postOrderRec(root);
    }

    private void  postOrderRec(TreeNode root){

        if(root != null){
            postOrderRec(root.right);
            System.out.println(root.data + " ");
            postOrderRec(root.left);
        }
    }
}

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
    }

}
