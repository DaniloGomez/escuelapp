package trees.binary;

public class TreeInt {
	
	NodeInt root;
	
	
	void buildStaticTree() {
		root = new NodeInt();
		root.value = 15;
		
		root.left = new NodeInt();
		root.left.value = 10;
		
		root.left.left = new NodeInt();
		root.left.left.value = 8;
		
		root.left.right = new NodeInt();
		root.left.right.value = 3;
		
		root.left.right.left = new NodeInt();
		root.left.right.left.value = 61;
		
		root.right = new NodeInt();
		root.right.value = 7;
		
		root.right.right = new NodeInt();
		root.right.right.value = 47;
		
		root.right.right.left = new NodeInt();
		root.right.right.left.value = 91;
		
		root.right.right.right = new NodeInt();
		root.right.right.right.value = 14;						
	}
	
	void print() {
		print(root);
	}
	
	void print(NodeInt node) {
		if(node != null) {
			System.out.println(node.value);
			print(node.left);
			print(node.right);
		}
	}
}
