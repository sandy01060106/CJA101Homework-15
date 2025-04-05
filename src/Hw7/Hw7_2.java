package Hw7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class Hw7_2 {
//	2.請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案
//	裡(請使用append功能讓每次執行結果都能被保存起來)	
	public static void main(String[] args) {
		try {
			Set set = new HashSet();
			while(set.size() != 10) {
				int a =(int)(Math.random()*1000)+1;
				set.add(a);
			}
			File data = new File("src/Hw7/Data.txt");
			FileWriter fos = new FileWriter(data,true); //FileWriter、FileOutputStream有append功能
			BufferedWriter bw = new BufferedWriter(fos);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(set);
			pw.close();
			bw.close();
			fos.close();
			System.out.println("檔案成功寫入");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
