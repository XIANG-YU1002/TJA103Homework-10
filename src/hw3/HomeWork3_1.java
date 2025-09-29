package hw3;

import java.util.Scanner;

public class HomeWork3_1 {
	public static void main(String[] args) {
		int triangle[] = new int[3];
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個整數:");
		for (int i = 0; i < 3; i++) {
            triangle[i] = scanner.nextInt();
        }
		int a = triangle[0], b = triangle[1], c = triangle[2];
		if(a + b <= c || a + c <= b || c + b <= a )
		  {
		   System.out.println("無法構成三角形");
		  }
		  else if(a == b && b == c && c == a)
		  {
		   System.out.println("正三角形");
		  }
		  else if(a == b || b == c || c == a)
		  {
		   System.out.println("等腰三角形");
		  }
		  else
		  {
		   System.out.println("其他三角形");
		  }
	}
}
