/*
 
import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> temp = new HashSet<Integer>();

		int n = in.nextInt();
		int m = in.nextInt();
		int val = 0;

		for (int i = 0; i < n; i++) {
			int input = in.nextInt();

			deque.add(input);
			temp.add(input);

			if (deque.size() == m) {
				if (temp.size() > val)
					val = temp.size();
				int first = deque.remove();
				if (!deque.contains(first))
					temp.remove(first);
			}
		}

		System.out.println(val);
	}
}

*/

import java.util.*;

/*abstract data type that generalizes a queue, for which elements can be added to or 
 * removed from either the front (head) or back (tail).

 Deque interfaces can be implemented using various types of collections such as LinkedList
 or ArrayDeque classes. For example, deque can be declared as:
 
Deque deque = new LinkedList<>();
or
Deque deque = new ArrayDeque<>();

//////
 * In this problem, you are given integers. You need to find the maximum number of unique integers
among all the possible contiguous subarrays of size .
The first line of input contains two integers N and M: representing the total number of integers and
 the size of the subarray, respectively.
The next line contains  space separated integers.

 Sample Input

 6 3
 5 3 5 2 3 2
 Sample Output

 3*/
public class JavaDequeue {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<Integer> deq = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[10000001];//max 10 000 000 elements
		long max = 0;
		long current = 0;

		for (int i = 0; i < n; i++) {
			if (i >= m) {
				// pop off last one
				int f = deq.removeLast();
				if (a[f] >= 1) {
					a[f]--;
					if (a[f] == 0)
						current--;
				}
			}

			int x = in.nextInt();
			if (a[x] == 0) {
				// new unique
				current++;
				max = Math.max(current, max);
			}
			a[x]++;
			deq.addFirst(x);
		}
		System.out.println(max);
	}
}