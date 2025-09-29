package hw3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(10); // 產生 0~9 的亂數
        int guess;

        System.out.println("開始猜數字！");

        while (true) {
            System.out.print("請輸入數字：");
            guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("猜對了");
                break; 
            } else {
                System.out.println("猜錯了");
            }
        }

        System.out.println("答對了，答案是：" + answer);
	}
}
