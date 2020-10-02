package trees.binary;

public class ProgramTree {
	public static void main(String[] args) {
		TreeInt tree = new TreeInt();
		tree.buildStaticTree();
		tree.print();
		System.out.println("------------------------------");
		tree.print(tree.root.right.right);
	}
}
