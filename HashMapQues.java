//package sudypurpose;
import java.util.*;

public class HashMapQues {

	public static void main(String[] args) {
		
		HashMap <Integer,String> namesHashMap = new HashMap<>(); 
		namesHashMap.put(1,"Shivam");
		namesHashMap.put(2, "Omkar");
		namesHashMap.put(3,"Abhishek");
		namesHashMap.put(4, "Nikhil");
		namesHashMap.put(5,"Om");
		
		System.out.println("Original hash map : "+ namesHashMap);
		System.out.println(" ");
		
		//count 
		System.out.println("Size : "+ namesHashMap.size());
		System.out.println(" ");
	
		//find key 
		int i   = 2;
		boolean bool = namesHashMap.containsKey(i);
		if(bool) {
			System.out.println("key  exists ");
		}else {
			System.out.println("key not exists ");
		}
		System.out.println(" ");
		
		//find value
		String s = "Om";
		boolean b = namesHashMap.containsValue(s);
		if(b) {
			System.out.println("value exists");
		}
		else {
			System.out.println("value not exists");
		}
		System.out.println(" ");
		
		//mappings from the specified map to another map.
		namesHashMap.clear();
		System.out.println(namesHashMap);
		System.out.println(" ");
	}
	
}
