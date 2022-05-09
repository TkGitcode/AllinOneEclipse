package collections;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Comparable {

	public static void main(String[] args) {
		
		
		//HashMap<Integer, String>
		List<CompareOne> l = new ArrayList<>();
		CompareOne co = new CompareOne("Kumar", 9);
		l.add(co);
		l.add(new CompareOne("Santhosh", 452));
		l.add(new CompareOne("Srini", 85));

		System.out.println("Before Sorting");
		for (CompareOne c : l)

			System.out.println(c.getId());

		Collections.sort(l, new CompareById());
		System.out.println("After Sorting");

		for (CompareOne c : l)

			System.out.println(c.getId());

		Collator myCollator = Collator.getInstance();

		System.out.println(myCollator.compare("ABC", "abc"));
	}

}
