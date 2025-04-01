package Hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw4 {
	public static void main(String[] args){
//	1.有個一維陣列如下：
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示：陣列，length屬性)
		int[] x = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for(int i = 0; i < x.length;i++) {
			sum += x[i];
		}
		int avg=sum / x.length;
		System.out.println("所有元素的平均值"+avg);
		for(int i = 0; i < x.length;i++) {
			if(x[i] > avg) {
				System.out.print(x[i]+" ");
			}
		}
		System.out.println("");
		System.out.println("============");
//	2.請建立一個字串，經過程式執行後，輸入結果是反過來的
//	例如String s = “Hello World”，執行結果即為dlroW olleH
//	(提示：String方法，陣列)
		//toCharArray() ，用來把整個字串轉成一個 char 陣列。
		String s = "Hello World";
		char[] c= s.toCharArray();
		//切記!!：陣列的索引是從 0 到 c.length - 1
		for(int i = c.length-1;i >= 0;i-- ) { 
			System.out.print(c[i]);
		}
		System.out.println("");
		System.out.println("============");
//	3.有個字串陣列如下(八大行星)：
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示：字元比對，String方法)
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count=0;
		for(int i = 0 ; i < planet.length ; i++) {
			String p = planet[i];
			char[] c1 = p.toCharArray();
			 for(int j = 0 ; j < c1.length ; j++) {
				 if(c1[j] == 'a' || c1[j] =='e' || c1[j] =='i' || c1[j] =='o' || c1[j] =='u') {
					 count++;
				 }
			 }
		}
		System.out.println("這陣列裡面共有"+count+"個母音");
		System.out.println("============");
//	4.請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//	有錢可借他;並且統計有錢可借的總人數:例如輸入1000 就顯示「有錢可借的
//	員工編號: 25 19 27 共3 人!」
//	(提示：Scanner，二維陣列)
		Scanner sc = new Scanner(System.in);
		System.out.println("要借多少錢");
		int money;
		while(true) {
			if(sc.hasNextInt()) {
				money=sc.nextInt();
				break;
			}else {
				System.out.println("輸入錯誤，請重新輸入");
				sc.nextLine(); // 清除整行輸入，避免無窮迴圈
			}
				
		}
		int[][] y = {
				{25,2500},
				{32,800},
				{8,500},
				{19,1000},
				{27,1200}
				
		};
		int person=0;
		List<Integer> hasMoney = new ArrayList<>(); 
		for(int i = 0 ; i < y.length ; i++) {
			if(y[i][1] >= money) {
				hasMoney.add(y[i][0]);
				person++;
			}
		}
		System.out.println("有錢可借的員工編號:"+hasMoney+"共"+person+"人!");
		System.out.println("============");
//	5.請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//	(提示1：Scanner，陣列)
//	(提示2：需將閏年條件加入)
//	(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)		
	
		
//	6.請算出每位同學考最高分的次數
//	(提示：二維陣列)
		int[][] score= {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,89,90,75,90,89,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		};
		int[] winCount = new int[8]; // 用來記錄8位同學的最高分次數
		
		for(int exam = 0 ; exam < score.length ; exam++) {
			int max =score[exam][0]; //假設第一個元素目前最大，之後去跟其他元素比大小
			
			for (int student = 0 ; student<score[exam].length ; student++) {
				if(score[exam][student] >max ) {
					max=score[exam][student]; //迴圈比大小，在元素裡找出最大值
				}
			}
			 // 找出是誰考出這個最高分 → ++
	        for (int student = 0; student < score[exam].length; student++) {
	            if (score[exam][student] == max) {
	                winCount[student]++;
	            }
	        }
	
		    // 輸出結果
		    for (int i = 0; i < winCount.length; i++) {
		        System.out.println((i + 1) + "號同學考到最高分的次數：" + winCount[i]);
		    }
		}
		
	}
}
