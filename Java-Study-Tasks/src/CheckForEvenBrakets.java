import java.util.Stack;

public class CheckForEvenBrakets {
	//write a code that checks expression for correctly close brakets 
	public static void main(String[] args) {
		
		String expression = "1 + (3 + 2 - (2+3) * 4 - ((3+1)*(4-2)))";
		//check if open brakets count is the same as the count of closed ones
		Stack<Integer> stack = new Stack<Integer>();
		boolean correctBrackets = true;
		for (int index = 0; index < expression.length(); index++) {
			char ch = expression.charAt(index);
			if (ch == '(') {
				stack.push(index);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					correctBrackets = false;
					break;
				}
				stack.pop();
			}
		}
		if (!stack.isEmpty())
			correctBrackets = false;
		System.out.println("Are the brackets correct? "
				+ correctBrackets);
	}
}
