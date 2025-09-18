package hw1;

public class HomeWork1 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算12,6這兩個數值的和與積
		System.out.println("12 + 6 = " + (12+6) + "\n12 * 6 = " + (12 * 6) );
//		請設計一隻Java程式,計算200顆蛋共是幾打幾顆?
		System.out.println("200顆雞蛋一共是" + 200 / 12 + "打，" + 200 % 12 + "顆");
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day , hr, min, sec;
		day = 256550 / 86400 ;
		hr = 256550 % 86400 / 3600;
		min = 256550 % 3600 / 60;
		sec = 256550 % 60;
		System.out.println("256559秒為" + day + "天" + hr + "小時" + min + "分" + sec + "秒");
//		請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final float pi = 3.1415f;
		System.out.println("半徑為5的圓面積: " + pi * 5 * 5 + "，周長: " + pi * 2 * 5);
//		某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		double fv;
		fv = 1500000 * Math.pow(1 + 0.02, 10);
		System.out.println("10年後本金加利息一共" + (int)fv);
//		請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//			5 + 5
//			5 + ‘5’
//			5 + “5”
//			並請用註解各別說明答案的產生原因
		System.out.println(5 + 5);
//		此段為做直接的加減法，因此5+5 = 10
		System.out.println(5 + '5');
//		此段為的'5'為字元，列印時會自動轉換成對應的Unicode數字，因此為58
		System.out.println(5 + "5");
//		此段為的"5"為字串，所以不會對原本前面的5作變更而是直接加上一個字串5，所以結果是55
	}
}
