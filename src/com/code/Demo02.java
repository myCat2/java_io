package com.code;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

//字节操作 完成文件的复制
public class Demo02 {
	public static void copyFile(String src ,String dist) throws IOException{
		FileInputStream in = new FileInputStream(src);
		FileOutputStream out = new FileOutputStream(dist);
		
		byte[] buffer = new byte[20 * 1024];
		int cnt;
		int a = 1;
		// read() 最多读取 buffer.length 个字节
	    // 返回的是实际读取的个数
		while((cnt = in.read(buffer, 0, buffer.length)) != -1){  // 返回 -1 的时候表示读到 eof，即文件尾
			out.write(buffer, 0 , cnt);
			System.out.println(cnt);
		}
		in.close();
		out.close();
	}
	public static void main(String[] args) throws IOException {
		copyFile("D:/workspace/a.txt","D:/workspace/b.txt");
	}
}
