import java.util.*;
public class LinkedListQues {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Omkar");
        names.add("Nikhil");
        names.add("Abhishek");
        names.add("Garvit");
        names.add("Om");

        System.out.println("Ater added names :"+names);
        System.out.println(" ");

        //print element using for each
        for (String string : names) {
            System.out.println("iterate element : "+string);
        }
        //start from specific position
        int ind = 2;
        for(int i = ind;i<names.size();i++){
            System.out.println(" " +names.get(i));
        }

        //reverse
        Collections.reverse(names);
        System.out.println("After reverse : "+ names);
        System.out.println(" ");

        //insert specific position
        System.out.println("insert at specific position : "+ names.set(2, "Johnny"));
        System.out.println("After inserted name at 2 index  : "+ names);
        System.out.println(" ");

        //last and first
        names.addFirst("Stark");
        names.addLast("Ranbir");
        System.out.println("After inserted at first and last : "+ names);
        System.out.println(" ");
        
        //first and last occurrence
        String s = "johnny";
        System.out.println("first occurrence of element"+names.indexOf(s));
        System.out.println("last occurrence of element"+names.lastIndexOf(s));
        System.out.println(" ");

        //remove first and last
        System.out.println(names.removeFirst());
        System.out.println(names.removeLast());
        System.out.println(" After remove first and last element : "+names);
        System.out.println(" ");

        // swap two elements
        int index1 = 1;
        int index2 =4;
        String temp = names.get(index1);
        names.set(index1, names.get(index2));
        names.set(index2,temp);
        System.out.println(" After swapping 1 & 4 element : "+ names);
        System.out.println(" ");

        //join two linked list
        LinkedList<String> newNames = new LinkedList<>();
        newNames.add("Aliya");
        newNames.add("Katrina");
        newNames.add("Sonia");

        names.addAll(newNames);
        System.out.println("After joining two linkes list : "+ names);
        System.out.println(" ");

        //particular element exists
        String st = "karina";
        boolean found = names.contains(st);
        System.out.println("is '"+st+"' in the list?"+found);
        System.out.println(" ");

        //convert linked list to array list
        ArrayList<String> list1 = new ArrayList<>(names);
        System.out.println("After converting linked list to array list : "+list1);

        //compare two linked list
        boolean bool = names.equals(newNames);
        System.out.println("Are both linked list equal? : "+bool);
        System.out.println(" ");

        //linked list is empty or not
        boolean b = names.isEmpty();
        System.out.println("is linked list empty? : " +b);

        //replace element
        names.set(2, "Anushka");
        System.out.println("After replacing element at index 2 : "+ names);

    }
    
}
