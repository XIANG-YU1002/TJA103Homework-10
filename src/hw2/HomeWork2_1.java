package hw2;

public class HomeWork2_1 {
	public static void main(String[] args) {
		//使用 for 迴圈 + while 迴圈
        for (int i = 1; i <= 9; i++) {
            int j = 1;
            while (j <= 9) {
                System.out.printf("%d * %d = %2d  ", i, j, i * j);
                j++;
            }
            System.out.println();
        }
        System.out.println();

        //使用 for 迴圈 + do-while 迴圈
        for (int i = 1; i <= 9; i++) {
            int j = 1;
            do {
                System.out.printf("%d * %d = %2d  ", i, j, i * j);
                j++;
            } while (j <= 9);
            System.out.println();
        }
        System.out.println();

        //使用 while 迴圈 + do-while 迴圈
        int i = 1;
        while (i <= 9) {
            int j = 1;
            do {
                System.out.printf("%d * %d = %2d  ", i, j, i * j);
                j++;
            } while (j <= 9);
            System.out.println();
            i++;
        }
	}
}
