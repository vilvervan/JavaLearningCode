package com.wan.learning.inherit;

class Student extends Person{
	// 域
	String id;//学号
	int admissionTime;//入学时间（年）	

	// 构造器
	public Student(String name, boolean sex, String sid,int admissionYear){
		super(name,sex);
		id = sid;
		admissionTime = admissionYear;
	}			
	
	// 重写父类的方法
	public void eat(){
		System.out.println("我正在食堂里吃晚餐...");
	}
	
	// 增加父类没有的方法
	public void exam(){
		System.out.println("我正在考试...");
	}
}