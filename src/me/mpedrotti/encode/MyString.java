package me.mpedrotti.encode;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class MyString {

	public static void main(java.lang.String[] args) throws UnsupportedEncodingException {
		
		String str = "C";
		//String str = "Ç";
		//String str = "ß";
		
		System.out.println(str.codePointAt(0));
		
		//Charset charset = Charset.defaultCharset();
		System.out.println(Charset.defaultCharset());
		
		//byte[] bytes = s.getBytes("windows-1252");
		//byte[] bytes = s.getBytes("UTF-16");
		byte[] bytes = str.getBytes();
		//bytes.length;

		System.out.format("char: %s, bytes: %s, length: %d, UTF-16: %s%n", 
			str,
			Arrays.toString(bytes),
			bytes.length,
			new String(bytes, "UTF-16")
		);
		
		
		str = new String("13º Órgão Oficial".getBytes(), "UTF-8");
		System.out.println(str);
	}
}
