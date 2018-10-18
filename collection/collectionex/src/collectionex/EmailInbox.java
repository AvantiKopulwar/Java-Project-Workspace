 package collectionex;

import java.util.ArrayList;

public class EmailInbox {
	public static void main(String[] args) {
		Email em1 = new Email();
		em1.date = "12-12-2018";
		em1.from = "jbk";
		em1.to = "students@jbk.com";
		System.out.println(em1);
		Email em2 = new Email();
		em2.date = "12-12-20181";
		em2.from = "jbk1";
		em2.to = "students@jbk.com1";
		System.out.println(em2);
		// Email em3 = new Email();
		// Email em4 = new Email();
		ArrayList al = new ArrayList();
		al.add(em1);
		al.add(em2);
		for (int i = 0; i < al.size(); i++) {
			Object object = al.get(i);
			Email email = (Email) object;
			System.out.println(email);
			System.out.println(email.from);
			System.out.println(email.to);
			System.out.println(email.date);
		}

	/*	Object object = al.get(2);
		Email email = (Email) object;
		*/
		
		
		
		
	}
}








