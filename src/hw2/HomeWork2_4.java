package hw2;

public class HomeWork2_4 {
	public static void main(String[] args) {
		char n = 'A';
		 for (int i = 0; i < 6; i++) {    
		        for (int j = 0; j <= i; j++) {  
		            System.out.print(n);
		        }
		        n += 1;
		        System.out.print("\n");
		    }
	}
}
