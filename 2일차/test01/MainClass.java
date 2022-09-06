package com.care.di_test;

import org.springframework.context.support.GenericXmlApplicationContext;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		String path="classpath:application_test.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		// application_test에서 실행한 모든 결과를 ctx에서 가지고 있다!!!
		
		PrintBean psb = ctx.getBean("pb01", PrintBean.class );
		
		System.out.print("입력 : ");
		String name = scan.next();
		
		pb.setPrint(name);
		
		pb.printString();
		
	}

}
