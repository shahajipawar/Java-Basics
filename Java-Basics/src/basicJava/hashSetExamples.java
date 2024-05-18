package basicJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExamples {

	// HashSet, TreeSet, LinkedhashSet -> implements Set interface
	// Does not accept any duplicate values
	// there is no gurantee elements stored in sequential order..random order

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		System.out.println(hs);
		hs.add("INDIA");
		hs.add("He");
		hs.add("She");
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);

		// Iterator
		Iterator<String> it = hs.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
