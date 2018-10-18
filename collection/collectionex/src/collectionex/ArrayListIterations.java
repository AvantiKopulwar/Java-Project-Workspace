package collectionex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class ArrayListIterations {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("aaaa");
		al.add("aaaa");
		al.add("bbbb");
		al.add("cccc");
		al.add("dddd");
		// for loop
		for (int i = 0; i < al.size(); i++) {
			String xx = al.get(i);
			System.out.println(xx);
		}
		// iterator
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String ss = itr.next();
			System.out.println(ss);
		}
		// list iterator
		ListIterator<String> ltr = al.listIterator();
		while (ltr.hasNext()) {
			String ss = ltr.next();
			System.out.println(ss);
		}
		//for each loop or // enhance for loop
		//1.5
		//top to bottom
		//generics must
		for(String pp:al){
			System.out.println(pp);
		}
		
		 // working // college //
		// no excuse -- unemployed + pass out  (//1.8 stream api iteration HOME WORK)
		ArrayList<HashMap<Integer, String>> al1=new ArrayList<>();

		for(HashMap<Integer, String> hm:al1){
			Set<Integer> set=hm.keySet();
			for(int dd:set){
				System.out.println(dd);
				String jj=hm.get(dd);
				System.out.println(jj);
			}
			
		}
		
		
		
		
	}
}













