package com.care.di01;

public class MainClass {
	public static void main(String[] args) {
		STBean stb = new STBean();
		stb.setName("홍길동");
		stb.setAge(20);
		stb.setSt(new Student());
		
		stb.namePrint();
		stb.agePrint();
	}
}
