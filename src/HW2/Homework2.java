package HW2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Homework2 {

	public static void main(String[] args) {
		
		// Write a Java program to copy one array list into another
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Supra");
		cars.add("M3");
		cars.add("Gtr");
		cars.add("Evo");
		cars.add("Wrx");
		cars.add("240sx");
		
		ArrayList<String> tunerCars = new ArrayList<String>();
		tunerCars.addAll(cars);
		System.out.print("#1: ");
		System.out.println(tunerCars);
		
		// Write a Java program to extract a portion of an array list
		String favorite = tunerCars.get(2);
		System.out.print("#2: ");
		System.out.println(favorite);
		
		// Write a Java program of swap two elements in an array list
		Collections.swap(tunerCars, 2, 0);	
		System.out.print("#3: ");
		System.out.println(tunerCars);

		// Write a Java program to test an array list is empty or not
		System.out.print("#4: ");
		System.out.println(tunerCars.isEmpty());

		// Write a Java program to replace the second element of an ArrayList with the specified element.
		String upgrade = "M5";
		tunerCars.set(1, upgrade);
		System.out.print("#5: ");
		System.out.println(tunerCars);

		// Write a Java program to trim the capacity of an array list the current list size.
		tunerCars.trimToSize();
		System.out.print("#6: ");
		System.out.println(tunerCars);
		
		
		
		
		
		// ========== HUNGRY FOR MORE ========== //
		

		// Write a Java program to test a hash set is empty or not.
		HashSet<String> hash1 = new HashSet<String>();
		hash1.add("random");
		hash1.add("blahhh");
		hash1.add("more randomness");
		hash1.add("blah blahhh");
		System.out.print("#7: ");
		System.out.println(hash1.isEmpty());

		// Write a Java program to get the number of elements in a hash set.
		System.out.print("#8: ");
		System.out.println(hash1.size());

		// Write a Java program to iterate through all elements in a hash list.
		Iterator<String> i = hash1.iterator();
		System.out.print("#9: ");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// Write a Java program to convert a hash set (key-value pair) to an array.
		System.out.println("#10: ");
		
		// Write a Java program to compare two sets and retain elements that are the same on both sets.
		HashSet<String> hash2 = new HashSet<String>();
		hash2.add("dfjklasd");
		hash2.add("slkdjflas");
		hash2.add("blahhh");
		hash2.add("can't think of anything");
		hash2.add("blah blahhh");
		hash1.retainAll(hash2);
		System.out.print("#11: ");
		System.out.println(hash1);
		
	}

}
