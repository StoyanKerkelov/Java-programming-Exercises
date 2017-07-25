package dataStructures;

class BNode {
	int key;
	String name;

	BNode leftChild;
	BNode rightChild;

	BNode(int key, String name) {
		this.key = key;
		this.name = name;
	}

	public String toString() {
		return name + " has a key " + key;
	}
}

public class BinaryTree {

	/**
	 * This binary tree model is taken from Derek Banas youtube tutorials
	 */

	BNode root;

	public void addNode(int key, String name) {

		BNode newNode = new BNode(key, name);
		if (root == null) {
			root = newNode;
		} else {
			BNode focusNode = root;
			BNode parent;
			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.leftChild;
					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public BNode findNode (int key) {

		BNode focusNode = root;

		while (focusNode.key != key) {

			if (key < focusNode.key) {

				focusNode = focusNode.leftChild;
			} else {
				focusNode = focusNode.rightChild;
			}
			if (focusNode == null) {
				return null;
			}
		}
		return focusNode;
	}

	public boolean remove (int key){
		BNode focusNode = root;
		BNode parent = root;
		
		//search for node
		boolean isItALeftChild = true;
		while (focusNode.key != key){
			parent = focusNode;
			
			if(key < focusNode.key){
				isItALeftChild = true;
				focusNode = focusNode.leftChild;
			}else{
				isItALeftChild = false;
				focusNode = focusNode.rightChild;
			}
			if(focusNode == null){
				return false;
			}
		}
		
		//if node has no children
		if(focusNode.leftChild == null && focusNode.rightChild == null){
			if(focusNode == root){
				root = null;
			} else if(isItALeftChild){
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}
		//if  there is no rightChild
		else if(focusNode.rightChild == null){
			
			if(focusNode == root){
				root = focusNode.leftChild;
			} else if (isItALeftChild){
				parent.leftChild = focusNode.leftChild;
			} else {
				parent.rightChild = focusNode.leftChild;
			}
		}
		//if there is no leftChild
		else if(focusNode .leftChild == null){
			if(focusNode == root){
				root = focusNode.rightChild;
			} else if(isItALeftChild){
				parent.leftChild = focusNode.rightChild;
			} else {
				parent.rightChild = focusNode.leftChild;
			}
		}
		//if there are two children
		
		else{
			BNode replacement = getReplacementNode(focusNode);
			
			if(focusNode == root){
				root = replacement;
			} else if (isItALeftChild){
				parent.leftChild = replacement;
			}else {
				parent.rightChild = replacement;
			}
			replacement.leftChild = focusNode.leftChild;
		}
		return true;
		
	}
	
	public BNode getReplacementNode(BNode replacedNode){
		BNode replacementParent = replacedNode;
		BNode replacement = replacedNode;
		
		BNode focusNode = replacedNode.rightChild;
		/*move right child up because is bigger than the left child 
		(move it as the parent its left brother)*/
		while (focusNode != null){
			replacementParent = replacement;
			replacement = focusNode;
			focusNode = focusNode.leftChild;
		}
		  
		if (replacement != replacedNode.rightChild){
			replacementParent.leftChild = replacement.rightChild;
			replacement.rightChild = replacedNode.rightChild;
		}
		return replacement;
	}
	
	//					print 
	
	public void inOrderTraverseTree(BNode focusNode) {
		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild);

		}
	}

	public void preOrderTraverseTree(BNode focusNode) {
		if (focusNode != null) {
			System.out.println(focusNode);
			preOrderTraverseTree(focusNode.leftChild);
			preOrderTraverseTree(focusNode.rightChild);
		}
	}

	public void postOrderTraverseTree(BNode focusNode) {
		if (focusNode != null) {
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
}

