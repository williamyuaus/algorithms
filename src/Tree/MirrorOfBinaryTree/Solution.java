package Tree.MirrorOfBinaryTree;

import utils.BinaryTreeNode;

public class Solution {
    public void mirrorBinaryTreeNode(BinaryTreeNode pNode) {
        if (pNode == null) {
            return;
        }

        if (pNode.left == null && pNode.right == null) {
            return;
        }

        BinaryTreeNode temp = pNode.left;
        pNode.left = pNode.right;
        pNode.right = temp;

        if (pNode.left != null) {
            mirrorBinaryTreeNode(pNode.left);
            
        }

        if (pNode.right != null) {
            mirrorBinaryTreeNode(pNode.right);
        }
    }
}
