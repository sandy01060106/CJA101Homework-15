package Hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Hw7_1 {
	public static void main (String[] args) throws IOException {
//	1.請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//	Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
//	System.out.println("目前工作目錄：" + System.getProperty("user.dir"));//顯示 Java 在執行時預設從哪裡找檔案。
	File sample=new File("src/Hw7/Sample.txt");
	InputStream is = new FileInputStream(sample); //不能new InputStream因為是抽象類別，要用子類別FileInputStream，因為子類別有實作方法
	int byteRead = 0;
	while(is.read() != -1) {
		byteRead++;
	}
	is.close(); //因為已經讀到檔案最後了，所以要再重開一次檔案輸入流
	InputStreamReader isr = new InputStreamReader(new FileInputStream(sample));
	int charRead = 0;
	while(isr.read() != -1) {
		charRead++;
	}
	isr.close();
	
	BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(sample)));
	int lineRead = 0;
	while(br.readLine() != null) {
		lineRead++;
	}
	br.close(); 
	System.out.println("Sample.txt檔案共有"+byteRead+"個位元組，"+charRead+"個字元，"+lineRead+"列資料");
	}
}
