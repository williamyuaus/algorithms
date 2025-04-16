package Tree.SerializeBinaryTrees;

import utils.BinaryTreeNode;

public class Solution {
    
    String serialize(BinaryTreeNode root) {
        if (root == null) {
            return "$, ";
        }

        return root.value + ", " + serialize(root.left) + serialize(root.right);
    }

    BinaryTreeNode deserialize(String str) {
        int index = -1;
        if (str == null || str.length() == 0) {
            return null;
        }

        String[] strNode = str.split(",");
        return deserialize(strNode, index);
    }

    BinaryTreeNode deserialize(String[] strNode, int index) {
        ++index;
        BinaryTreeNode treeNode = null;
        if (!strNode[index].equals("$")) {
            treeNode = new BinaryTreeNode(Integer.valueOf(strNode[index]));
            treeNode.left = deserialize(strNode, index);
            treeNode.right = deserialize(strNode, index);
        }

        return treeNode;
    }
}
