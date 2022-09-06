package com.care.di_test02;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String path = "classpath:application_test02.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		
		SavaClass sc = ctx.getBean("sc01", SavaClass.class);
		
		sc.setNum1(10); sc.setOp("*"); sc.setNum2(30);
		
		sc.operationClass();
		sc.printClass();

	}

}
