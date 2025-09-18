package hw2;


public class HomeWork2_2 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int sum = 0;
		for (int i = 0; i <= 1000; i += 2) {
			if(i % 2 == 0) sum += i;	
		}
		System.out.println(sum);
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int product1 = 1;
		for (int i = 1; i <= 10; i++) {
			product1 *= i;	
		}
		System.out.println(product1);
//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int product2 = 1;
		int count = 1;
		while (count <= 10) {
			product2 *= count;
			count++;
		}
		System.out.println(product2);
//		請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int n = 0;
		for (int i = 1; i <= 20; i++) {
			if(i % 2 != 0) {
				n += i ;
				System.out.print(n + " ");
			}			
		}
	}
}
