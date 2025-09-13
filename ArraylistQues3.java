package sudypurpose;

import java.util.ArrayList;

public class ArraylistQues3 {
	public static ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) {
		ArrayList<Integer> result = new ArrayList<>();

		if (Q == 1) {

			int p = Query.get(0);
			int r = Query.get(1);
			A.add(p, r);
			return A;
		} else if (Q == 2) {

			int p = Query.get(0);
			int lastIndex = A.lastIndexOf(p);
			result.add(lastIndex);
			return result;
		}

		return result;
	}

}
