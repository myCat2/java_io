package com.object;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Demo05 对象操作
public class ObjectOpr {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

	   
		A a1 = new A(1234, "abcd");
		String objectFile = "file/a1";
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(objectFile));//指定输出文件
		objectOutputStream.writeObject(a1);
	    objectOutputStream.close();
	    
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(objectFile));
		
		A a2 = (A) objectInputStream.readObject();
		objectInputStream.close();
		System.out.println(a2);
		
	}
	private static class A implements Serializable { //将对象实现序列化

	    private transient int x;  //transient 可以使字段不被序列化
	    private String y;

	    A(int x, String y) {
	        this.x = x;
	        this.y = y;
	    }

	    @Override
	    public String toString() {
	        return "x = " + x + "  " + "y = " + y;
	    }
	}
}
