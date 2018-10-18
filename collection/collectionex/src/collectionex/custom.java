package collectionex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class custom {
	public static void main(String[] args) {
		HashMap<Integer, ArrayList<String>> hm = new HashMap<>();
		ArrayList<String> al1=new ArrayList<>();
		al1.add("qqqq");
		al1.add("aaaa");
		al1.add("rrrr");
		al1.add("yyyy");
		hm.put(45, al1);
		ArrayList<String> al2=new ArrayList<>();
		al2.add("qqqq");
		al2.add("aaaa");
		al2.add("rrrr");
		al2.add("yyyy");
		hm.put(44, al2);
		System.out.println(hm);

		Set<Integer> keys=hm.keySet();
		for(int key:keys){
			System.out.println(key);
			ArrayList<String> al=hm.get(key);
			for(String str:al){
				System.out.println(str);
			}
			System.out.println(al);
		}
		
		
		
		
	}
}









