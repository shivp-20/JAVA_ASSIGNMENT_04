package sudypurpose;
import java.util.*;

public class ArraylistQues1 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test cases(T) : ");
		//int T = sc.nextInt();
		int T = Integer.parseInt(sc.nextLine().trim());

		sc.nextLine(); //new line 
		
		while(T --> 0) {
			System.out.println("Enter queries : ");
			int Q = sc.nextInt();
			sc.nextLine();//newline
			String queries[] = sc.nextLine().split(" ");
			
			ArrayList <Integer> A = new ArrayList<>();
			for(int i =0; i<queries.length; i++) {
				String query = queries[i];
				
				if(query.equals("a")) {
					int x = Integer.parseInt(queries[++i]);
					A.add(x);
				}
				else if (query.equals("b"))
				{
					Collections.sort(A);
				}
				else if(query.equals("c")) 
				{
				    Collections.reverse(A);	
				}
				else if (query.equals("d"))
				{
					System.out.println(A.size());
				}
				else if(query.equals("e"))
				{
					for(int num : A) {
						System.out.print(num + " ");
					}
					System.out.println(" ");
				}
				else if(query.equals("f"))
				{
					A.sort(Collections.reverseOrder());
				}
			}
			
			
		}
	
	}

}
