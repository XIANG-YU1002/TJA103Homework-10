package hw2;

public class HomeWork2_3 {
	public static void main(String[] args) {
		int count = 0;
        System.out.println("阿文可以選擇的數字：");       
        for (int i = 1; i <= 49; i++) {
            if (i % 10 != 4 && i / 10 != 4) {
                System.out.print(i + " ");
                count++;
            }
        }       
        System.out.println("\n總共有 " + count + " 個數字");
        
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

