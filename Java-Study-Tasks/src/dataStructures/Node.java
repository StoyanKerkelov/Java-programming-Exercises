package dataStructures;
import java.util.ArrayList;

import dataStructures.Tree.TreeNode;


public class Node<T> {
	public T data;
	private boolean hasParent;
	private boolean isRoot;
	public ArrayList<Node<T>> children;

	public Node(T data) {
		if (data == null) {
			throw new IllegalArgumentException("Cannot insert null value!");
		}
		this.isRoot = false;
		this.data = data;
		this.children = new ArrayList<Node<T>>();
	}
	
	public void setRoot() {
		this.isRoot = true;
	}
	
	public boolean checkRoot() {
		if(this.isRoot == true){
			return false;
		} else {
			return true;
		}
	}
	
	public void setValue(T data) {
		this.data = data;
	}
	
	public T getValue(){
		return this.data;
	}
	
	/**
	 * Adds child to the node.
	 * @param child - the child to be added.
	 */
	public void addChild(Node<T> child) {
		if (child == null) {throw new IllegalArgumentException("Cannot insert null value!");
		}
		if (child.hasParent) {throw new IllegalArgumentException("The node alreadey has a parent!");
		}
		child.hasParent = true;
		this.children.add(child);
	}
	/**
	 * Gets the child of the node at given index.
	 * 
	 * @param index -  the index of the desired child.
	 * @return the child on the given position.
	 */
	public Node<T> getChild(int index) {
		return this.children.get(index);
	}
	/**@return the number of node's children*/
	public int getChildrenCount() {
		return this.children.size();
	}
	
	
}