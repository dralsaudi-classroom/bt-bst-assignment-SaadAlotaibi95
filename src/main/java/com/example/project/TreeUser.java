package main.java.com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
		// Write the method countLeafs that should return the number of leaf nodes in the tree. A leaf node is a node that has no children.
        // assume the following method exists in the ADT: isLeaf (boolean flag): requires: Binary tree is not empty.
        // input: None. results: if the current node of the binary tree is a leaf then flag is set to true otherwise it is set to false. output: flag.
        // you can't call countLeaves from BT.java
    	if(bt.empty())
        	return 0; 
    	int count = 0;
		LinkedStack<BTNode<T>> temp = new LinkedStack<>();
		temp.push(bt.root);
		while(!temp.empty()) {
			BTNode<T> tempNode = temp.pop();
			if(tempNode.right == null && tempNode.left == null)
				count++;
			else {
				if(tempNode.left != null)
					temp.push(tempNode.left);
				if(tempNode.right != null)
					temp.push(tempNode.right);
				}
		}
		return count;
    }
}