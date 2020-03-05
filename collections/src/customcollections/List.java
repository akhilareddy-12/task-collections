package customcollections;
import java.util.*;
public class List {

	
	   public static void main(String args[]) {
	      /* Creating ArrayList of type "String" which means
	       * we can only add "String" elements
	       */
	      ArrayList<String> al = new ArrayList<String>();

	      /*This is how we add elements to an ArrayList*/
	      al .add("Hyderabad");
	      al.add("Mumbai");
	      al.add("Bangalore");
	      al.add("Delhi");
	      al.add("Chennai");
	      al.add("Kolkata");
	      al.add("Jaipur");
	      al.add("Srinagar");
	      al.add("Ahmedabad");
	      al.add("Ranchi");
	      
	      System.out.println(al);
	     //  Displaying elements
	      System.out.println("Original ArrayList:");
	      for(String str:al)
	         System.out.println(str);

	      /* Add element at the given index
	       * obj.add(0, "Patna") - Adding element "patna" at first position
	       * obj.add(1, "Lucknow") - Adding element "Lucknow" at second position
	       */
	     al.add(0, "Patna");
	      al.add(1, "Lucknow");

	      // Displaying elements
	      System.out.println("ArrayList after add operation:");
	      for(String str:al)
	         System.out.println(str);

	      //Remove elements from ArrayList like this
	      al.remove("Chennai"); //Removes "Chennai" from ArrayList
	      al.remove("Kolkata"); //Removes "Kolkata" from ArrayList

	      // Displaying elements
	      System.out.println("ArrayList after remove operation:");
	      for(String str:al)
	         System.out.println(str);
	      
	       //Remove element from the specified index
	     al.remove(1); //Removes Second element from the List

	      // Displaying elements
	     System.out.println("Final ArrayList:");
	      for(String str:al)
	         System.out.println(str);
	   }
	
}
