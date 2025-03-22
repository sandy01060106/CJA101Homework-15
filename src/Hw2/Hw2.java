package Hw2;
public class Hw2 {
	public static void main(String[] args) {
//		1.使用for迴圈+ while迴圈
		for(int y=1;y<=9;y++) {
			int x=1;
			while(x<=9) {
				System.out.print(y+"*"+x+"="+y*x+"\t");
				x++;
			}
		}
		System.out.println();
//		2.使用for迴圈+ do while迴圈
		for(int y=1;y<=9;y++) {
			int x=1;
			do {
				System.out.print(y+"*"+x+"="+y*x+"\t");
				x++;
			}while(x<=9);
		}
		System.out.println();
//		3.使用while迴圈+ do while迴圈
		int x,y=1;
		while(y<=9) {
			x=1;// 每次y變動時，x都應該歸零
			do {
				System.out.print(y+"*"+x+"="+y*x+"\t");
				x++;
			}while(x<=9);
			y++;
		}
		System.out.println();
//		4.請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum=0;
		for(int n=1;n<=1000;n++) {
			if(n%2==0) {
				sum+=n;
			}
		}
		System.out.println("偶數和:"+sum);
//		5.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int product1=1;
		for (int n=1;n<=10;n++) {
			product1*=n;
		}
		System.out.println("連乘積："+product1);
//		6.請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int product2=1;
		int n=1;
		while(n<=10) {
			product2*=n;
			n++;
		}
		System.out.println("連乘積："+product2);
/*		7.請設計一隻Java程式,輸出結果為以下:
		  1 4 9 16 25 36 49 64 81 100  */
		for(int N=1;N<=10;N++) {
			int square=N*N;
			System.out.print(square+" ");
		}
		System.out.println();
/*		8.阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?*/
		int times=1;
		for(int A=1;A<=49;A++) {
			if(A%10==4) {
				continue;
			}else if(A/10==4){
				continue;
			}else {
				System.out.print(A+",");
			}
			times+=1;
		}
		System.out.println();
		System.out.println("總共次數："+times);
/*		9.請設計一隻Java程式,輸出結果為以下:
		1 2 3 4 5 6 7 8 9 10
		1 2 3 4 5 6 7 8 9
		1 2 3 4 5 6 7 8
		1 2 3 4 5 6 7
		1 2 3 4 5 6
		1 2 3 4 5
		1 2 3 4
		1 2 3
		1 2
		1  */
		for(int num1=10;num1>0;num1--) {
			for(int num2=1;num2<=num1;num2++) {
				System.out.print(num2);
			}
			System.out.println("");
		}
/*		10.請設計一隻Java程式,輸出結果為以下:
		65	A
		66	BB
		67	CCC
		68	DDDD
		69	EEEEE
		70	FFFFFF  */
		int count=1;
		for(int number=65;number<=70;number++) {
			for(int time=1;time<=count;time++) {
				System.out.print((char)number);
			}
			count++;
			System.out.println();
		}
	}
}
