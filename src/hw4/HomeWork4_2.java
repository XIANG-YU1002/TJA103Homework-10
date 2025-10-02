package hw4;

import java.util.Scanner;

public class HomeWork4_2 {
	public static void main(String[] args) {
		int[] id = {25, 32, 8, 19, 27};
		int[] cash = {2500, 800, 500, 1000, 1200};
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入欲借金額: ");
		int amount = sc.nextInt();
		System.out.print("有錢可借的員工編號:");
		for (int i = 0; i < cash.length; i++) {
		    if (cash[i] >= amount) {
		        System.out.print(id[i] + " ");
		        count++;
		    }
		}
		System.out.print("共" + count + "人");
	}
}
