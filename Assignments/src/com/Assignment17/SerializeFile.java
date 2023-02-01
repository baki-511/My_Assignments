package com.Assignment17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeFile {
	public static void main(String[] args) {
		StringFile s = new StringFile();
		try {
			FileOutputStream fos = new FileOutputStream("E:\\fold\\StringFile\\stringFile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			oos.close();
			System.out.println("Serialization is Done......");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
