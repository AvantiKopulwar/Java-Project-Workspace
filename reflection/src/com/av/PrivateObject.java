package com.av;

import java.lang.reflect.Method;

public class PrivateObject {
	private String privateString = null;
	public PrivateObject(String privateString) {
		this.privateString=privateString;
	}
	private String getPrivateString() {
	    return this.privateString;
	}
	public static void main(String[] args) throws Exception{
		PrivateObject privateObject = new PrivateObject("The Private Value");
		Method privateMethod = PrivateObject.class.getDeclaredMethod("getPrivateString", null);
		privateMethod.setAccessible(true);
		String returnValue= (String) privateMethod.invoke(privateObject, null);
		System.out.println("real value"+returnValue);
	}
}
