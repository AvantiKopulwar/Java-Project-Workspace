package collectionex;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();
		System.out.println(hm.put(34, "aaaa"));// Object
		System.out.println(hm.put(44, "bbbb"));
		System.out.println(hm.put(55, "cccc"));
		System.out.println(hm.put(34, "dddd"));
		System.out.println(hm.put(44, "eeee"));
		System.out.println(hm.put(66, "ffff"));
		System.out.println(hm.put(34, "gggg"));
		System.out.println(hm.size());
		System.out.println(hm);
		//
		/*
		 * Set<Integer> keys = hm.keySet(); System.out.println(keys); for (int
		 * key : keys) { System.out.println(key); String val = hm.get(key);
		 * System.out.println(val); }
		 */

	}
}
