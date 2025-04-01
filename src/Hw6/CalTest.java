package Hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		if(sc1.hasNextInt() & sc2.hasNextInt()) {
			int x =sc1.nextInt();
			int y =sc2.nextInt();
			Calculator cal=new Calculator(x,y);
//			cal.setNumber(x,y);
			System.out.println(cal.getResult());
		}
		
	}
}
