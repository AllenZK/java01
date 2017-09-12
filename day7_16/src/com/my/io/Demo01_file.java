package com.my.io;

import java.io.File;


//File:文件和目录路径名的抽象表现形式
public class Demo01_file {
	public static void main(String[] args) {
		//File(String pathname) 

		String pathName = "c:\\day16\\txt\\1.txt";
		File f1 = new File(pathName);
		System.out.println(f1);
		
		//File(String parent, String child)
		String parent = "c:\\day16\\txt";
		String child = "1.txt";
		File f2 = new File(parent,child);
		System.out.println(f2);
		
		File f3 = new File("c:\\day16\\txt");
		String c = "1.txt";
		File f4 = new File(f3,c);
		System.out.println(f4);
		
	}
}
