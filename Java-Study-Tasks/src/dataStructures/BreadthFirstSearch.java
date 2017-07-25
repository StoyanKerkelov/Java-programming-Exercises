package dataStructures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	/**
	 * Implements Breadth First Search BFS first expand root node, then alll
	 * the successors of the root node, then their successors and so on
	 * until the best possible path has been found.
	 * 
	 * Breadth First Search Utilizes the queue data structure as opposed to
	 * the stack that Depth First Search uses.
	
	 *Set Node 1 as the start Node
	 *Add this Node to the Queue
	 *Add this Node to the visited set
	 *If this node is our goal node then return true, else add Node 2 and Node 3 to our Queue
	 *Check Node 2 and if it isn’t add both Node 4 and Node 5 to our Queue. 
	 *Take the next node from our Queue which should be Node 3 and check that.
	 *If Node 3 isn’t our goal node add Node 6 and Node 7 to our Queue.
	 *Repeat until goal Node is found.
	 */

	SearchNode startNode;
	SearchNode goalNode;

	public BreadthFirstSearch(SearchNode start, SearchNode goalNode) {
		this.startNode = start;
		this.goalNode = goalNode;
	}

	public boolean compute() {
		// end node congrats:
		if (this.startNode.equals(goalNode)) {
			System.out.println("Goal node found!");
			System.out.println(startNode);
		}

		Queue<SearchNode> queue = new LinkedList<>();
		ArrayList<SearchNode> explored = new ArrayList<>();
		queue.add(this.startNode); // add to queue
		explored.add(startNode); // add arraylist

		while (!queue.isEmpty()) {//if queue is empty end there is no found goalNode return false
			SearchNode current = queue.remove();
			if (current.equals(this.goalNode)) {
				System.out.println(explored);
				return true;
			} else {
				//continue to the point when the current node is without children then stop looping
				if (current.getChildren().isEmpty())
					return false;
				else
					queue.addAll(current.getChildren());// add all pending children ot queue
			}
			explored.add(current);
		}
		return false;
	}

	// Driver
	public static void main(String args[]) {
		SearchNode station1 = new SearchNode("Westminster", null, null);
		SearchNode station2 = new SearchNode("Waterloo", station1, null);
		SearchNode station3 = new SearchNode("Trafalgar Square", station1, station2);
		SearchNode station4 = new SearchNode("Canary Wharf", station2, station3);
		SearchNode station5 = new SearchNode("London Bridge", station4, station3);
		SearchNode station6 = new SearchNode("Tottenham Court Road", station5, station4);
														//start from 6 find 1
		BreadthFirstSearch bfs = new BreadthFirstSearch(station6, station1);

		if (bfs.compute()){
			System.out.print("Path Found!");
		}
	}
}
