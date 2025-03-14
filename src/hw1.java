
public class hw1 {
	public static void main(String[] args) {
//		1.請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a=12;
		int b=6;
		int sum=a+b;
		int product=a*b;
		System.out.println("和為："+sum);
		System.out.println("積為："+product);
		System.out.println("------------");
//		2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg=200;
		int dozen=egg/12;
		int remainder=egg%12;
		System.out.println("雞蛋有"+dozen+"打，餘"+remainder+"顆");
		System.out.println("------------");
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec=256559;
		int min=sec/60;
		int hour=min/60;
		int day=hour/24;
		System.out.println("256559秒為"+day+"天、"+hour+"小時、"+min+"分與"+sec+"秒");
		System.out.println("------------");
//		4.請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi=3.1415;
		int r=5;
		double area=r*r*pi;
		double circumference=r*2*pi;
		System.out.println("圓面積："+area+"、圓周長："+circumference);
		System.out.println("------------");
/*		5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式
		計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)*/
		int money=1500000;
		double rate=0.02;
		for(int time=1;time<=10;time++) {
			int interest=(int)(money*rate);
			money=money+interest;
		}
		System.out.println("本金加利息共$"+money);
		System.out.println("------------");
/*		6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		5 + 5
		5 + ‘5’
		5 + “5”
		並請用註解各別說明答案的產生原因*/
		int A=5;
		char B='5';
		String C="5";
		System.out.println(A+A);//為數字相加
		System.out.println(A+B);//B為ASCII的編碼值(53)，5+53
		System.out.println(A+C);//數字與字串相加，所以是串接
	}
}
