import java.util.*;

public class CompareBrakets {
	/*A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. 
	 * if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

	Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 
	Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

		Given a string, determine if it is balanced or not.
		Sample Input
		
		{}()
		({()})
		{}(
		[]
		Sample Output
		
		true
		true
		false
		true
		*/
	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		/*  ArrayDeque is  "likely to be faster than Stack when used as a stack" - Java documentation */
		/* Create HashMap to match opening brackets with closing brackets */
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		/* Test each expression for validity */
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			String expression = scan.next();
			System.out.println(isBalanced(expression, map) ? "true"
					: "false");
		}
		scan.close();
	}

	private static boolean isBalanced(String expression,
			HashMap<Character, Character> map) {
		if ((expression.length() % 2) != 0) {//must be even
			return false; // odd length Strings are not balanced
		}
		
		// use deque  as a  stack
		ArrayDeque<Character> deque = new ArrayDeque<>(); 
									
		for (int i = 0; i < expression.length(); i++) {
			Character ch = expression.charAt(i);
			if (map.containsKey(ch)) {
				deque.push(ch);
			} else if (deque.isEmpty()
					|| ch != map.get(deque.pop())) {
				return false;
			}
		}
		return deque.isEmpty();
	}
}
