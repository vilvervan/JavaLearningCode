package com.wan.learning.inherit;

class Person{
	// 域
	String name;
	boolean sex;
	
	// 构造器
	public Person(String name,boolean sex){
		this.name = name;
		this.sex = sex;
	}
	
	//方法
	public void sleep(){
		System.out.println("我正在睡觉...");
	}
	
	public void eat(){
		System.out.println("我正在家里吃晚餐...");
	}
}