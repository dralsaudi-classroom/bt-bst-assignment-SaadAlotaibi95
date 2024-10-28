package main.java.com.example.project;

public class TreeUser {
	public static <T> int countLeaves(BT<T> bt) {
		if (bt.empty())
            return 0;

        bt.find(Relative.Root);

        if (bt.isLeaf())
            return 1;

        int count = 0;
        LinkedStack<Character> directions = new LinkedStack<>();

        while (true) {

            if (bt.find(Relative.LeftChild)) {

                directions.push('l');

            } else {

                if (bt.find(Relative.RightChild))
                    directions.push('r');
            }

            if (bt.isLeaf()) {

                count++;

                while (true) {

                    bt.find(Relative.Parent);

                    char dir = directions.pop();

                    if (dir == 'l') {

                        if (bt.find(Relative.RightChild)) {

                            directions.push('r');
                            break;

                        }

                    }
                        if (directions.empty())
                            return count;
                    }
                }

            }	
	}

}
