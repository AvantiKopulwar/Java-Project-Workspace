package collectionex;

import java.util.ArrayList;

//1.5 generics
public class A_1_5 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		// al.add("rtyrt");
		// al.add(new Integer(555));
		al.add(56);
		for (int i = 0; i < al.size(); i++) {
			int gg = al.get(i);
			System.out.println(gg);
		}

	}
}
