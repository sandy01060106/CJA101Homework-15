package Hw3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
		//1.請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形，如圖示結果：
		int[] x=new int[3];
		Scanner sc1=new Scanner(System.in);
		for (int i=0;i<=2;i++) {
			while(true) {
				System.out.println("請輸入第 " + (i + 1) + " 個整數：");
				if(sc1.hasNextInt()) { //系統判斷鍵盤輸入是否為int整數，結果為布林值
					x[i]=sc1.nextInt(); //sc.nextInt()就會取得輸入的數字，並指定給x[index]
					break;
				}else {
					System.out.println("輸入錯誤，請重新輸入");
					sc1.nextLine(); // 讀取整行輸入，避免無窮迴圈
				}
			}
		}
		//三角形排序順序要小心
		if(x[0]==0 || x[1]==0 || x[2]==0) {
			System.out.println("不是三角形");
		}else if(x[0]==x[1] && x[1]==x[2]) {
			System.out.println("此為正三角形");
		}else if(x[0]*x[0] + x[1]*x[1] == x[2]*x[2] || x[1]*x[1] + x[2]*x[2] == x[0]*x[0] || x[2]*x[2] + x[0]*x[0] == x[1]*x[1]) {
			System.out.println("此為直角三角形");
		}else if(x[0]==x[1] || x[1]==x[2] || x[2]==x[0]) {
			System.out.println("此為等腰三角形");
		}else if (x[0]+x[1]>x[2] && x[1]+x[2]>x[0] && x[2]+x[0]>x[1]){
			System.out.println("此為其他三角形");
		}else {
			System.out.println("不是三角形");
		}
				
	
		//2-1.請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息，如圖示結果：
		int a = (int)(Math.random()*10);
		int b = 11;
		System.out.println("請輸入數字0~9：");
		Scanner sc2 = new Scanner(System.in);
		while(b!=a) {
			if(sc2.hasNextInt()) {
				b =sc2.nextInt();
				if(b==a) {
					System.out.println("答對了，答案就是"+a);
					break;
				}else {
					System.out.println("猜錯囉");
				}
			}else {
				System.out.println("\"輸入錯誤，請重新輸入\"");
			}
		}
		//2-2.請設計一隻程式，會亂數產生一個0～100的數字，然後可以玩猜數字遊戲，每次猜就會提示你是大於還是小於正確答案，如圖示結果：
		int A = (int)(Math.random()*100);
		int C = 0;
		int D = 100;
		System.out.println("請輸入數字0~100：");
		Scanner sc3 = new Scanner(System.in);
		while(true) {
			if(sc3.hasNextInt()) {
				int B =sc3.nextInt();
				if(B==A) {
					System.out.println("答對了，答案就是"+A);
					break;
				}else if(B>A){
					D=B;
					System.out.println("猜錯囉，猜的大於正確答案，請輸入"+C+"~"+B);
				}else {
					C=B;
					System.out.println("猜錯囉，猜的小於正確答案，請輸入"+B+"~"+D);
				}
			}else {
				System.out.println("輸入錯誤，請重新輸入");
			}
		}
		/*3-1.阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
		的號碼與總數，如圖：*/
		int times=1;//算次數加index
		int unlike;
		System.out.println("請輸入1~9不想要的數字");
		Scanner sc4=new Scanner(System.in);
		while(true) {
			if(sc4.hasNextInt()) {
				unlike=sc4.nextInt();//sc.nextInt()就會取得輸入的數字
					if(unlike<1 || unlike>9) {
						System.out.println("輸入錯誤，請重新輸入");
						sc1.nextLine(); // 清除整行輸入，避免無窮迴圈
					}else {
						for(int i=1;i<=49;i++) {
							if(i%10==unlike) {
								continue;
							}else if(i/10==unlike){
								continue;
							}else {
								System.out.print(i+",");
							}
							times+=1;
					}
					System.out.println();
					System.out.println("總共次數："+times);
					}
				break;
			}
		}
		//3-2. 輸入不要的數字後，直接亂數印出6個號碼且不得重複
		// 建立可選號碼列表
        List<Integer> availableNumbers = new ArrayList<>(); //動態增加陣列長度
        for (int i = 1; i <= 49; i++) {
            if (i % 10 == unlike || i / 10 == unlike) {
                continue; // 排除包含這個數字的號碼
            }
            availableNumbers.add(i); //加入元素
        }
        // 亂數選取 6 個不重複的號碼
        Collections.shuffle(availableNumbers);
        List<Integer> selectedNumbers = availableNumbers.subList(0, 6);//洗牌後抓取前六個數字
        System.out.println("隨機選出的 6 個號碼：" + selectedNumbers);
	}
}
