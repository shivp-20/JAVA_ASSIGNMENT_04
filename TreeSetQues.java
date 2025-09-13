package sudypurpose;

import java.util.*;

public class TreeSetQues {
	public static void main(String[]args) {
		Set<String> fruitsTreeSet = new TreeSet<>();
		fruitsTreeSet.add("Apple");
		fruitsTreeSet.add("Banana");
		fruitsTreeSet.add("Orange");
		fruitsTreeSet.add("Grape");
		fruitsTreeSet.add("Cherry");
		
		System.out.println("Original tree set : "+fruitsTreeSet);
		
		//iterate the elements 
		for(String fruit : fruitsTreeSet) {
			System.out.println("elements iteration : "+fruit);
		}
		
		//add all elemnts to another treeset
		Set<String> fruitsTreeSet1 = new TreeSet<>();
		fruitsTreeSet1.add("Strawberry");
		fruitsTreeSet1.add("Pineapple");
		fruitsTreeSet1.add("Papaya");
		fruitsTreeSet.add("Kiwi");
		
		System.out.println(" ");
		fruitsTreeSet.addAll(fruitsTreeSet1);
		System.out.println("After adding second tree set : "+fruitsTreeSet);
		
		System.out.println(" ");
		//reverse
		Set <String> reverseFruits = ((TreeSet<String>) fruitsTreeSet).descendingSet();
		System.out.println("After reversing tree set "+ reverseFruits);
		
		System.out.println(" ");
		//less than 7 elements
//		for(int i=0;i<6;i++) {
//			System.out.println("less 7 indexes : "+fruitsTreeSet);
//		}
		
	}

}
