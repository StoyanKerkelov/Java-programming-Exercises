package dataStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * The BFS_Node class represents a station in this tutorial and will as such have a
 * string representing the station's name. As well as an ArrayList of BFS_Nodes that
 * will store any instantiated BFS_Nodes children.
 */
public class SearchNode {

	// A Unique Identifier for our BFS_Node
	public String stationName;
	// An arraylist containing a list of BFS_Nodes that
	// This BFS_Node is directly connected to - It's child BFS_Nodes.
	SearchNode leftChild;
	SearchNode rightChild;

	public SearchNode(String stationName, SearchNode firstChild, SearchNode secondChild) {
		this.stationName = stationName;
		this.leftChild = firstChild;
		this.rightChild = secondChild;
	}

	public ArrayList<SearchNode> getChildren() {
		ArrayList<SearchNode> childBFS_Nodes = new ArrayList<>();
		if (this.leftChild != null) {
			childBFS_Nodes.add(leftChild);
		}
		if (this.rightChild != null) {
			childBFS_Nodes.add(rightChild);
		}
		return childBFS_Nodes;
	}

	// An auxiliary function which allows
	// us to remove any child BFS_Nodes from
	// our list of child BFS_Nodes.
	public boolean removeChild(SearchNode n) {
		return false;
	}

}
