package Tree.VerifySquenceOfBST;

public class MySolution {
    boolean verifySquenceOfBST(int[] sequence) {
    	if (sequence.length <= 0) {
    		return true;
    	}

    	int root = sequence[-1];
    	int index = 0;
    	int[] leftNodes = null;
    	int[] rightNodes = null;
    	boolean flag = false;
    	for (int i = 0; i < sequence.length - 1; ++i ) {
    		if (!flag && sequence[i] < root) {
    			leftNodes.add(sequence[i]);
    		} else	if (sequence[i] > root)  {
    			rightNodes.add(sequence[i]);
    			flag = true;
    		} else {
    			return false;
    		}
    	}

    	return verifySquenceOfBST(leftNodes) && verifySquenceOfBST(rightNodes);

    }
}
