package uri1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int NF = sc.nextInt();
		int HT = sc.nextInt();
		double VH = sc.nextDouble();
		
		double salario = HT * VH;
		
		System.out.println("NUMBER = " + NF);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
