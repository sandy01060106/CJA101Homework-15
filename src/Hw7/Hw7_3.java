package Hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Hw7_3{
//	3.請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，
//	第一個參數所代表的檔案會複製到第二個參數代表的檔案
	public static void main(String[] args) {
		Hw7_3 file = new Hw7_3();
			file.copyFile(new File("src/Hw7/Data.txt"), new File("src/Hw7/copyFile.txt"));
	}
	
	public static void copyFile(File f1, File f2) {
	    try {
	        FileReader fr = new FileReader(f1);
	        FileWriter fw = new FileWriter(f2);
	        int c;
	        while ((c = fr.read()) != -1) {
	            fw.write(c);
	        }
	        fr.close();
	        fw.close();
	        System.out.println("檔案複製完成！");
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
//	File f1 = new File("src/Hw7/Data.txt");
//	File f2 = new File("src/Hw7/copyFile.txt");
//	FileReader fr = new FileReader(f1);
//	FileWriter fw = new FileWriter(f2);
//	int c; //存讀出來的位元
//	while((c= fr.read()) != -1) {
//		fw.write(c);
//		System.out.print((char)c);
//		System.out.flush();
}
