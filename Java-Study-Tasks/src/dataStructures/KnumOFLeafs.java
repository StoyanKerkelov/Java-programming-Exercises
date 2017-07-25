package dataStructures;

public class KnumOFLeafs {
	/*Task 2: Write a program that displays the roots of those branches in
	 a given tree, which have exactly k many nodes 
	 */
	public static void main(String[] args) {

		//fill tree
				BasicTree<Integer> Xtree = new BasicTree<Integer>(14,
						new BasicTree<Integer>(26,
							new BasicTree<Integer>(14),
							new BasicTree<Integer>(12,
								new BasicTree<Integer>(9),
								new BasicTree<Integer>(1)),
							new BasicTree<Integer>(81)),
						new BasicTree<Integer>(14,
							new BasicTree<Integer>(9,
								new BasicTree<Integer>(29),
								new BasicTree<Integer>(7),
								new BasicTree<Integer>(39),
								new BasicTree<Integer>(95)),
							new BasicTree<Integer>(4,
								new BasicTree<Integer>(3,
									new BasicTree<Integer>(5),
									new BasicTree<Integer>(31),
									new BasicTree<Integer>(52))),
							new BasicTree<Integer>(14)),
						new BasicTree<Integer>(7,
							new BasicTree<Integer>(22),
							new BasicTree<Integer>(6),
							new BasicTree<Integer>(11)
						));
				//print tree
				Xtree.printDFS();
				System.out.println("The parent nodes with 3 children are:");
				Xtree.getRootsWithSetChildCount(3, Xtree.getRoot());
	}
}
