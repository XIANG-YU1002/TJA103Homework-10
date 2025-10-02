package hw3;

import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] args) {
		int count = 0;
        System.out.println("阿文你討厭哪個數字：");
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        for (int i = 1; i <= 49; i++) {
            if (i % 10 != n && i / 10 != n) {
            	System.out.print(i + " ");
                count++;
                if(count % 6 == 0) {
                	System.out.println();
                }
            }
        }
        System.out.printf("一共有"+ count + "個數字可以選");
	}
}
