package sudypurpose;
import java.util.*;

public class HashSetQues {
      public static void main(String [] args ) {
    	  HashSet <String> employeeSet = new HashSet<>();
    	  
    	  employeeSet.add("101 - john");
    	  employeeSet.add("102 - Bob");
    	  System.out.println("Original : " +employeeSet);
    	  System.out.println(" ");
    	  
    	  //append new employee
    	  employeeSet.add("103 - Shivam");
    	  System.out.println("New Employee set : " +employeeSet);
    	  System.out.println(" ");
    	  
    	  //get numbers of elements 
    	  int num = employeeSet.size();
    	  System.out.println("No of employee in set : "+num);
    	  System.out.println(" ");
    	  
    	  //convert hashset to array 
    	  String [] employeeArray = employeeSet.toArray (new String[0]);
    	  
    	  System.out.println("hashset convert to array : ");
    	  for(String emp :employeeArray) {
    		  System.out.println(emp);
    	  }
    	  System.out.println(" ");
    	  
    	  //convert hashset to tree set
    	  Set <String> employeeTree = new TreeSet<>(employeeSet);
    	  System.out.println("hashset convert to tree set : ");
    	  System.out.println("Tree set :");
    	  for(String emp1:employeeTree) {
    		  System.out.println(emp1);
    	  }
    	  System.out.println(" ");
    	  
    	  //convert hashset to arraylist
    	  ArrayList<String> employeeList = new ArrayList<>(employeeSet);
    	  System.out.println("hashset convert to array list : ");
    	  System.out.println("Array List :"+employeeList);
    	  System.out.println(" ");
    	  
    	  //remove all elements
    	   employeeSet.clear();
    	   
    	  
      }
}
