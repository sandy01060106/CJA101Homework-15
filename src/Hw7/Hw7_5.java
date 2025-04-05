package Hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Hw7_5 {
//	5.承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果
//	如何(請利用多型簡化本題的程式設計)
	public static void main(String[] args) {
		try {
			File obj = new File("src/Hw7/data/Object.ser");
			FileInputStream fis = new FileInputStream(obj);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println(obj.getName()+"讀取檔案內容：");
			while(true){
	            try{
	                Object A = ois.readObject();
	                if(A instanceof Animal){
	                    ((Animal)A).speak(); // 多型呼叫 speak()
	                }
	            }catch(EOFException e){
	                System.out.println("已讀完檔案");
	                break; // 跳出 while
	            }
	        }
			ois.close();
			fis.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
