package collectionex;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(10,6);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		vector.add(34);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		
		Enumeration<Integer> e=vector.elements();
		while(e.hasMoreElements()){
			int pp=e.nextElement();
			System.out.println(pp);
		}
		
		
		
		
		
		Vector<Integer> vector1 = new Vector<>(4);
		vector1.add(56);
		vector1.add(56);
		vector1.add(56);
		vector1.add(56);
		vector1.add(56);
		System.out.println(vector1.size());
		System.out.println(vector1.capacity());
	}
}






