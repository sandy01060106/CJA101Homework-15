package Hw6;

import java.util.Scanner;
//計算x的y次方並回傳結果。使用者可以輸入x與y的值，請加入例外處理機制
public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		try {
			System.out.println("請輸入x的值");
			if(sc.hasNextInt()) {
				x =sc.nextInt();
			}else {
				throw new TextException("請輸入整數");
			}	
			System.out.println("請輸入y的值");
			if(sc.hasNextInt()) {
				y =sc.nextInt();
			}else {
				throw new TextException("請輸入整數");
			}	
			Calculator cal=new Calculator(x,y);
//			cal.setNumber(x,y);
			System.out.println(x+"的"+y+"次方是"+cal.getResult());
			
		}catch(CalException e) {	
			System.out.println(e.getMessage());
		}catch(TextException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
}
