package dataStructures;

public class NumOfAncestors {

	/**Task3: Write a program that finds the number of leafs and the number
	 of ancestors of a tree.
	 leaf - node with no children
	 ancestors - node which has both a parent and a child.
	literally this means count all nodes without the root ot the tree.
	 */
	public static void main(String[] args) {
		//fill tree
		BasicTree<Integer> Ytree = new BasicTree<Integer>(14,
				new BasicTree<Integer>(26,
					new BasicTree<Integer>(14),
					new BasicTree<Integer>(12,
						new BasicTree<Integer>(9),
						new BasicTree<Integer>(1)),
					new BasicTree<Integer>(81)),
				new BasicTree<Integer>(14,
					new BasicTree<Integer>(9),
					new BasicTree<Integer>(4),
					new BasicTree<Integer>(14)),
				new BasicTree<Integer>(7)	
				);
		//print tree
		Ytree.printDFS();
		System.out.println("For that tree structure, the number of leafs and ancestors is:");
		//find number of leafs and ancestors
		System.out.println(Ytree.getNumOfLeafsAndAncestors(Ytree.getRoot()));
	}
}
