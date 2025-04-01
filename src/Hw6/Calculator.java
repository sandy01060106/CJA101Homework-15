package Hw6;

public class Calculator {
//	請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//	方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。CalTest.java執行後，使用者可
//	以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//	1. x與y同時為0，(產生自訂的CalException例外物件)
//	2. y為負值，而導致x的y次方結果不為整數
//	3. x與y皆正確情況下，會顯示運算後結果
	private int x;
	private int y;
	private int result;
	
	public Calculator() {

	}
	
	public Calculator(int x, int y) {
		result=(int) Math.pow(x, y);
		
	}
	
	public void setNumber(int x,int y){
		try{
			if(x==0 & y==0) {
				throw  new CalException("X跟Y不可以為0"); 
				}else if(y<0) {
					throw  new CalException("y不能小於0");
				}
		}catch(CalException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getResult() {
		return result;
	}
}
