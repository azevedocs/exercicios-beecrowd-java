package uri1004;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int PROD = x*y;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}

}
