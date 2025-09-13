package sudypurpose;

import java.util.Stack;

class Solution {
	public static void deleteMiddle(Stack<Integer> st, int current, int mid) {

		if (current == mid) {
			st.pop();
			return;
		}

		int temp = st.pop();
		deleteMiddle(st, current + 1, mid);

		st.push(temp);
	}

	public static Stack<Integer> deleteMid(int n, Stack<Integer> st) {
		int mid = n / 2;
		deleteMiddle(st, 0, mid);
		return st;
	}
}

public class ArraylistQues4 {
	public static void name(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);

		Stack<Integer> result = Solution.deleteMid(st.size(), st);

	}
}
