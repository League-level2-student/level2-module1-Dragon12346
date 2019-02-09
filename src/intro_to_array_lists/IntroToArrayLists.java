package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> name = new ArrayList<String>();
		//2. Add five Strings to your list 
		
		for (int i = 0; i < 5; i++) {
			name.add(i+"ughhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		}
		//3. Print all the Strings using a standard for-
		
		
		/*for (int i = 0; i < name.size(); i++) {
			if (i%2==0) {
				System.out.println(name.get(i));
			}
		}
		*/
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		for (int i = name.size()-1; i > 0; i--) {
			System.out.println(name.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
