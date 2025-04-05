package Hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HW7_4 {
//	4.請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	public static void main (String[] args) {
		File dir = new File("src/Hw7/data");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("資料夾已新增");
		}
		try {
			File object = new File("src/Hw7/data/Object.ser");
			/*FileWriter 是拿來「寫文字（char）」的，但 ObjectOutputStream 
			 *需要「位元組（byte）」的串流 → 應該使用 FileOutputStream。
			 */
			FileOutputStream fos = new FileOutputStream(object); 
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Cat cat1 = new Cat("喵喵");
			Cat cat2 = new Cat("喵喵喵");
			Dog dog1 = new Dog("旺旺");
			Dog dog2 = new Dog("旺旺旺");
			oos.writeObject(cat1);
			oos.writeObject(cat2);
			oos.writeObject(dog1);
			oos.writeObject(dog2);
			System.out.println("物件寫入成功");
			oos.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
