package jissen_practice;

import java.io.FileNotFoundException;

class FileRead {
	String test;

	void setmethodA(String test) throws FileNotFoundException {
		if (test == null) {
			throw new FileNotFoundException("ファイルが見つかりませんでした");
		}
		this.test = test;
	}
}

public class practiceP55 {
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		try {
			fr.setmethodA(null);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}