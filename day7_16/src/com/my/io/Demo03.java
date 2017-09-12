package com.my.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo03 {
	public static void main(String[] args) throws IOException {
		
		File f = new File("c:\\a\\b\\1.txt");
		//boolean b1 = f.mkdirs();  //这样的话直接把1.txt创建成了文件夹
		File file = f.getAbsoluteFile();
		System.out.println(file);
		
		String path = f.getAbsolutePath();
		System.out.println(path);
		
		
		String name = f.getName();
		System.out.println(name);
		
		String[] split = path.split(name);
		//String ss = Arrays.toString(split);
		System.out.println(split.toString());
		
		//boolean b1 = new File(ss).mkdirs();
		
		//boolean b1 = f.mkdir();
		boolean b2 = f.createNewFile();
		//System.out.println(b1);
		System.out.println(b2);
		
	}
}
