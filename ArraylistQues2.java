package sudypurpose;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistQues2 {
	public static ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) {
		if (Q == 1) {
			int p = Query.get(0);
			int r = Query.get(1);
			A.add(p, r);
			return A;
		} else if (Q == 2) {
			int p = Query.get(0);
			int lastIndex = A.lastIndexOf(p);
			ArrayList<Integer> result = new ArrayList<>();
			result.add(lastIndex);
			return result;
		}
		return new ArrayList<>();
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 4, 5, 9, 3));

		ArrayList<Integer> Query1 = new ArrayList<>(Arrays.asList(2, 6));
		ArrayList<Integer> result1 = solve(5, A, 1, Query1);
		System.out.println(result1);

		ArrayList<Integer> Query2 = new ArrayList<>(Arrays.asList(4));
		ArrayList<Integer> result2 = solve(6, result1, 2, Query2);
		System.out.println(result2);

	}

}
