package uri1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		double y = sc.nextDouble();
		
		double kml = x/y;
		
		System.out.printf("%.3f km/l%n", kml);
		
		sc.close();
	}

}
