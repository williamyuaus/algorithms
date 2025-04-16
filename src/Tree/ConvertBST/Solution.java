package Tree.ConvertBST;

import utils.BinaryTreeNode;

public class Solution {

    BinaryTreeNode pLastNodeInList = null;

    public BinaryTreeNode convert(BinaryTreeNode pRootOfTree) {
        
        convertNode(pRootOfTree, pLastNodeInList);

        BinaryTreeNode headNode = pLastNodeInList;
        while (headNode.left != null && headNode != null) {
            headNode = headNode.left;        
        }

        return headNode;
    }

    private void convertNode(BinaryTreeNode pNode, BinaryTreeNode pLastNodeInList) {
        if (pNode == null) {
            return;
        }

        BinaryTreeNode currentNode = pNode;
        if (currentNode.left != null) {
            convertNode(pNode, pLastNodeInList);
        }

        currentNode.left = pLastNodeInList;
        if (pLastNodeInList != null) {
            pLastNodeInList.right = currentNode;
        }
        pLastNodeInList = currentNode;

        if (currentNode.right != null) {
            convertNode(currentNode.right, pLastNodeInList);
        }


    }
}
