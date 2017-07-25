package dataStructures;
import java.util.ArrayList;
import java.util.List;

import dataStructures.Tree;
import dataStructures.Tree.TreeNode;

// basic tree structure
public class BasicTree<T> {
	private Node<T> root;

	public BasicTree(T rootData) {
		if (rootData == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		root = new Node<T>(rootData);
		root.setRoot();
	}
	
	@SafeVarargs
	public BasicTree(T rootData, BasicTree<T> ...children) {
		this(rootData); //constructs the tree
		
		for(BasicTree<T> child : children){
			this.root.addChild(child.root);
		}
	}
	
	public int occuranceCounter = 0;
	public int allNodesCounter = 0;
	
	public int getAllNodesRoot() {
		return this.allNodesCounter;
	}
	
	public Node<T> getRoot() {
		return this.root;
	}
	
	public ArrayList<Node<T>> getChildNodes() {
		if (this.root != null) {
			return this.root.children;
		}
		return new ArrayList<Node<T>>();
	}
	
	/////
	public int findOccurrences(Node<T> root, int data){
		if(this.root.getValue() == (Integer) data){
			occuranceCounter++;
			System.out.print("Including root, ");
		}
		return findOccurrencesOfValue(root, data);
	}
	public int findOccurrencesOfValue(Node<T> root, int data){
		
		Integer value = data;
		if (this.root == null) {
			return -1;
		}
		Node<T> current = null;
		//get the child nodes of the tree
		
		for(int i = 0; i < root.getChildrenCount(); i++){
			current = root.getChild(i);
				if(current.getValue() == value){
					occuranceCounter++;
				}
			findOccurrencesOfValue(current, value);				//recursion!!!
		}
		
		return occuranceCounter;
	}
	
	/////
	public void getRootsWithSetChildCount(T rootData, Node<T> root) {
		Integer value = (Integer) rootData;
		if (this.root == null) {
			return;
		}
		Node<T> node = null;
		for(int i = 0; i < root.getChildrenCount(); i++){
			node = root.getChild(i);
			if(node.children.size() == value){
				System.out.println(node.getValue());
			}
			getRootsWithSetChildCount (rootData, node);
		}
	}
	/** Just count all nodes without the root of the tree
	 */
	public int getNumOfLeafsAndAncestors(Node<T> root) {
		if (this.root == null) {
			return -1;
		}
		Node<T> current = null;
		for (int i = 0; i < root.getChildrenCount(); i++) {
			current = root.getChild(i);
			allNodesCounter++;
			getNumOfLeafsAndAncestors(current);
		}
		return allNodesCounter;
	}
	
	//					Printer
	/**
	 * Traverses and prints tree in Depth First Search mannaer
	 * @param root - the root of the tree to be reserved
	 * @param spaces - the spaces used for representation of the parent -  child relation.
	 */
	private void printDFS(Node<T> root, String spaces) {
		if (this.root == null) {
			return;
		}
		System.out.println(spaces + root.getValue());
		Node<T> child = null;
		for (int i = 0; i < root.getChildrenCount(); i++) {
			child = root.getChild(i);
			printDFS(child, spaces + "        ");
		}
	}
	
	/**
	 * Traveses and prints the tree in Deapth First Search DFS manner.
	 */
	public void printDFS() {
		this.printDFS(this.root, new String());
	}
	
	//					Driver
	
	public static void main(String[] args) {
		//fill tree
				BasicTree<Integer> tree = new BasicTree<Integer>(8,
						new BasicTree<Integer>(26,
							new BasicTree<Integer>(14),
							new BasicTree<Integer>(12,
								new BasicTree<Integer>(9),
								new BasicTree<Integer>(1)),
							new BasicTree<Integer>(81)),
						new BasicTree<Integer>(13,
							new BasicTree<Integer>(9),
							new BasicTree<Integer>(4),
							new BasicTree<Integer>(14)),
						new BasicTree<Integer>(14)	
						);
		//print tree
		tree.printDFS();
	}
}
