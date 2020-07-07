package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dolarValue = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dolarQuantity = sc.nextDouble();
		
		double converter = CurrencyConverter.converterDolar(dolarValue, dolarQuantity);
		System.out.printf("Amount to be paid in reais = %.2f", converter);
		
		System.out.println("GitHub!");
		System.out.println("Continue with GitHub!");
		System.out.println("Stil in the GitHub");
		
		sc.close();

	}

}
