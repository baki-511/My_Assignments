package com.Assignment17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeFile {
	//method to count vowels & Numbers
	public void countVowelsAndNums(String str) {
		int countVowels=0,countNums=0;
		for(int i=0;i<str.length();i++) {
//			str.toLowerCase(); // make all string to LowerCase
			char ch= str.charAt(i);
			if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') || (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')) {
				countVowels++;
			}else if(ch>='0' && ch<='9') {
				countNums++;
			}
		}
		System.out.println("Vowels = "+countVowels+"  Numbers = "+countNums);
	}
	
	//Driver Method
	public static void main(String[] args) {
		DeserializeFile df = new DeserializeFile();
		try {
			FileInputStream fis = new FileInputStream("E:\\fold\\StringFile\\stringFile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			StringFile s = (StringFile) o;
			System.out.println(s.contents);
			System.out.println();
			df.countVowelsAndNums(s.contents);
			ois.close();
		}catch(IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
