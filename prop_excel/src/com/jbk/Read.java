package com.jbk;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Read {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("abc.txt");
		int a = 0;
		while ((a = fis.read()) != -1) {
			char cc = (char) a;
			System.out.println(cc);
		}
	}

}
