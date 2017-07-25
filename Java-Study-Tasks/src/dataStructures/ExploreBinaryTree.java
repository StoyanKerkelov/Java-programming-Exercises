package dataStructures;


public class ExploreBinaryTree {

	public static void main(String[] args) {
		BinaryTree BiTree = new BinaryTree();
		
		BiTree.addNode(50, "Boss");
		BiTree.addNode(25, "Vice Pres");
		BiTree.addNode(15, "Office Manager");
		BiTree.addNode(30, "Secretary");
		BiTree.addNode(75, "Sales Manager");
		BiTree.addNode(70, "Salesman 2");
		BiTree.addNode(85, "Salesman 21");
		BiTree.inOrderTraverseTree(BiTree.root);
		System.out.println();
		BiTree.preOrderTraverseTree(BiTree.root);
		System.out.println();
		BiTree.postOrderTraverseTree(BiTree.root);
		System.out.println("\nSearch for 30:");
		System.out.print(BiTree.findNode(30));
		System.out.println();
		System.err.println("\nRemove key 25");
		BiTree.remove(25);
		BiTree.preOrderTraverseTree(BiTree.root);
		
		
	}
}
