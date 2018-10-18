package com.av;

import java.util.ArrayList;

public class EmailInbox {

	public static void main(String[] args) {
		Email em1 = new Email();
		em1.date="12-12-2019";
		em1.from="av";
		em1.to="dfdc@giy.com";
		em1.subject="official";
		Email em2 = new Email();
		em2.date="12-12-2019";
		em2.from="av";
		em2.to="dfdc@giy.com";
		em2.subject="Personal";
		ArrayList al= new ArrayList();
		al.add(em1);
		al.add(em2);
		for(int i=0;i<al.size();i++) {
			Object object=al.get(i);
			Email email = (Email) object;
			System.out.println(email);
			System.out.println(email.date);
			System.out.println(email.from);
			System.out.println(email.subject);
			System.out.println(email.to);
		}
	
	}

}
