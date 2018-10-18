package com.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationTest {
public static void main(String[] args) {
	Class aclass= Emp.class;
	Field fields[]= aclass.getDeclaredFields();
	for(Field field:fields) {
		System.out.println(field.getName());
	
		Annotation annotations[] = field.getDeclaredAnnotations();
		for(Annotation annotation:annotations) {
			PutData annotref= (PutData) annotation;
		    System.out.println(annotref.value());	
		}
		}
	}
}
