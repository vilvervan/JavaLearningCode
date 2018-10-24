package com.wan.learning.inherit;

class InheritDemo{
	public static void main(String[] args){
		Student stu = new Student("Alice",true,"201807001",2018);
		stu.eat();
		stu.sex = false;
	}
}