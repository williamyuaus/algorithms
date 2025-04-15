
package Tree.isSymmetrical;

import utils.BinaryTreeNode;

public class Solution {
    public boolean isSymmetrical(BinaryTreeNode pRoot) {
        return isSymmetrical(pRoot, pRoot);
    }

    public boolean isSymmetrical(BinaryTreeNode pRoot1, BinaryTreeNode pRoot2) {
        if (pRoot1 == null && pRoot2 == null) {
            return true;
        }  
        if (pRoot1 == null || pRoot2 == null){
            return false;
        }
        if (pRoot1.value != pRoot2.value) {
            return false;
        } 
        
        return isSymmetrical(pRoot1.left, pRoot2.right) && isSymmetrical(pRoot1.right, pRoot2.left);

    }
    
}
