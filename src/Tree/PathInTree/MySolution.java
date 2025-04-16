package Tree.PathInTree;

import java.util.ArrayList;
import java.util.List;

import utils.BinaryTreeNode;

public class MySolution {
    ArrayList<ArrayList<Integer>> findPath(BinaryTreeNode root, int expectedSum) {
    	int currentSum = 0;
    	ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();

    	if (root == null || expectedSum <= 0) {
    		return null;
    	}

    	return findPath(root, expectedSum, path, currentSum);

	}

	private ArrayList<Integer> findPath(BinaryTreeNode root, int expectedSum, ArrayList<Integer> path, int currentSum) {
    	currentSum += root.value;
    	
    	if (expectedSum == sum) {
    		return path;
    		path.add(root.value);
    	}

    	if (expectedSum < expectedSum) {
    		break;
    	} else {
    		BinaryTreeNode rightNode = root.right;
    		ArrayList<Integer> rightPath = path.add(node.value);

    		BinaryTreeNode leftNode = root.left;
    		ArrayList<Integer> leftPath = path.add(node.value);
    		findPath(node, currentSum, leftPath);
    		findPath(node, currentSum, rightPath);
    	}
    }
}
