package uri1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double valor2 = sc.nextDouble();
		
		double valorFinal = (quant1*valor1) + (quant2*valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorFinal);
		
		sc.close();
	}

}