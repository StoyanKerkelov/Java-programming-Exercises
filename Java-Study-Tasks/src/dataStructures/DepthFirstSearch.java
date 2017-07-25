package dataStructures;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Add SearchNode 1 to the stack If SearchNode 1 isn't the goal SearchNode then add SearchNode 2 to the
 * stack Check if SearchNode 2 is the goal SearchNode and if not add SearchNode 4 to the stack. If
 * SearchNode 4 isn't the goal SearchNode then add SearchNode 8 to the stack. If SearchNode 8 isn't the
 * goal SearchNode then go to the nearest ancestor with unexplored children. This
 * happens to be SearchNode 4, so we add SearchNode 9 to the stack and check that. If this
 * isn't the goal SearchNode then we travel to SearchNode 2 and explore it's unexplored
 * children, SearchNode 5. and so on...
 * */

	public class DepthFirstSearch  {

		SearchNode startSearchNode;
		SearchNode goalSearchNode;

		public DepthFirstSearch(SearchNode start, SearchNode goalSearchNode) {
			
			this.startSearchNode = start;
			this.goalSearchNode = goalSearchNode;
		}

		public boolean execute() {
			if (this.startSearchNode.equals(goalSearchNode)) {
				System.out.println("Goal SearchNode Found at 0 depth");
				System.out.println(startSearchNode);
			}
			Stack<SearchNode> SearchNodeStack = new Stack<>();
			ArrayList<SearchNode> visitedSearchNodes = new ArrayList<>();

			SearchNodeStack.add(startSearchNode);

			while (!SearchNodeStack.isEmpty()) {
				SearchNode current = SearchNodeStack.pop();
				if (current.equals(goalSearchNode)) {
					System.out.print(visitedSearchNodes);
					System.out.println("Goal SearchNode found");
					return true;
				} else {
					visitedSearchNodes.add(current);
					SearchNodeStack.addAll(current.getChildren());
				}
			}
			return false;
		}


	public static void main(String args[]) {
		SearchNode station1 = new SearchNode("Westminster", null, null);
		SearchNode station2 = new SearchNode("Waterloo", station1, null);
		SearchNode station3 = new SearchNode("Trafalgar Square", station1, station2);
		SearchNode station4 = new SearchNode("Canary Wharf", station2, station3);
		SearchNode station5 = new SearchNode("London Bridge", station4, station3);
		SearchNode station6 = new SearchNode("Tottenham Court Road", station5, station4);

		// We instantiate searchAlgo as type AbstractSearch but we set
		// it to equal
		// our newly created DepthFirstSearch concrete class
		// implementation
		DepthFirstSearch searchAlgo = new DepthFirstSearch(station6, station1);

		if (searchAlgo.execute())
			System.out.print("Path Found!");
	}
}
