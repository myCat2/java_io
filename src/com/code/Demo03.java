package com.code;

import java.io.UnsupportedEncodingException;

public class Demo03 {
	//字符操作   编码与解码
	/*  编码就是把字符转换为字节，而解码是把字节重新组合成字符

		GBK 编码中，中文字符占 2 个字节，英文字符占 1 个字节；
		UTF-8 编码中，中文字符占 3 个字节，英文字符占 1 个字节；*/
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str1 = "中文";
		byte[] b = str1.getBytes("UTF-8");
		String str2 = new String(b, "UTF-8");
		System.out.println(str2);
	}
}
