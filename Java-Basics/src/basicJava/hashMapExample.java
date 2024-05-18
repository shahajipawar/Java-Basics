package basicJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "hello");
		hm.put(1, "GudBye");
		hm.put(2, "Morning");
		hm.put(3, "Evening");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		// HashTable ->pass table set collections
		while (it.hasNext()) {
			System.out.println(it.next());
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	}
}
