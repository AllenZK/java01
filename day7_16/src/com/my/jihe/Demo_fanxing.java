package com.my.jihe;

import java.util.ArrayList;

public class Demo_fanxing {
	public static void main(String[] args) {
		//定义集合b,包含3个元素
		ArrayList<String> listB = new ArrayList<String>();
		listB.add("Jack");
		listB.add("Rose");
		listB.add("Trump");
		
		//使用集合b创建集合a//使用集合b创建集合a
		ArrayList<Object> listA = new ArrayList<Object>(listB); //有参构造
		listA.add("Obama");
		
		//观察集合a
		System.out.println(listA);  //[Jack, Rose, Trump, Obama]
	}
}
