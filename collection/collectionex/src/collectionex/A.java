package collectionex;

import java.util.ArrayList;

//booleanValue/// charValue
public class A {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new Integer(34));// to convert int into a object
		Integer ii = new Integer(67);
		al.add(ii);
		al.add("abc");
		System.out.println(al);
		for (int i = 0; i < al.size(); i++) {
			Object object = al.get(i);
			if (object instanceof Integer) {
				Integer integer = (Integer) object;
				int x = integer.intValue();
				System.out.println(x);
			} else {
				System.out.println(object.toString());
			}

		}
	}
}
