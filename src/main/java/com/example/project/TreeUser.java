package main.java.com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
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