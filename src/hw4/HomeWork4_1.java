package hw4;

public class HomeWork4_1 {
	public static void main(String[] args) {
		int[] array1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0, average;
		for(int i = 0; i < array1.length; i ++) {
			sum += array1[i];
		}
		average = sum / array1.length;
		System.out.println("平均值: " + average);
		System.out.printf("大於平均值的數:");
		for(int i = 0; i < array1.length; i ++) {
			if(array1[i] > average) System.out.printf(array1[i] + " ");
		}
		System.out.println();
		String s = "Hello World";
		char arr[] = s.toCharArray();
		for(int i = arr.length - 1; i >=0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		for (int i = 0; i < planets.length; i++) {
		    char[] letters = planets[i].toCharArray();
		    for (int j = 0; j < letters.length; j++) {
		        char ch = letters[j];
		        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		            count++;
		        }
		    }
		}
		System.out.println("總共有" + count + "個母音");
	}
}
