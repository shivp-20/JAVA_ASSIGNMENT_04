import java.util.*;

public class MovieArrayList{
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList <>();

        movies.add("Money heist");
        movies.add("Captain america");
        movies.add("Spider man");
        movies.add("Salaar");
        System.out.println("List of array : "+movies);
        System.out.println(" ");

        //insert 
        movies.add(1, "KGF");
        System.out.println("after insert: " +movies);
        System.out.println(" ");

        //retrieve
        String m = movies.get(3);
        System.out.println("retrieve element from specific index 3: "+ m);
        System.out.println(" ");

        //update
        String mv = movies.set(2,"OMG");
        System.out.println("update at specific index 2 : "+mv);
        System.out.println("after updatin : "+movies);
        System.out.println(" ");

        //remove third element
        System.out.println("remove : "+movies.remove(4));
        System.out.println("after remove : " +movies);
        System.out.println(" ");

        //search for an element 
         String search = "vivah";
         boolean found = movies.contains(search);
         System.out.println("is '"+search+"' in the list?"+found);
         System.out.println(" ");

         //sort()
         Collections.sort(movies);
         System.out.println("after sorted : "+movies);
         System.out.println(" ");

         //reverse
         Collections.reverse(movies);
         System.out.println("after reversed : "+movies);
         System.out.println(" ");

         //empty
         movies.clear();
         System.out.println("after clear "+movies);
         System.out.println(" ");
    }
}