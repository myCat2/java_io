package com.file;

import java.io.File;

public class Demo01 {
	//输出所有文件名字   
	public static void listAllFiles(File dir) {
	    if (dir == null || !dir.exists()) {
	        return;
	    }
	    if (dir.isFile()) {
	        System.out.println(dir.getName());
	        return;
	    }
	    for (File file : dir.listFiles()) {
	        listAllFiles(file);
	    }
	}
	public static void main(String[] args) {
		File file = new File("D:/workspace/java_io");
		listAllFiles(file);
	}
	//从 Java7 开始，可以使用 Paths 和 Files 代替 File。
}
