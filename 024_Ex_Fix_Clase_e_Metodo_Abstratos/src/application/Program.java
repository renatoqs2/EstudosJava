package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.println("Tax payer #" + i + "data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();

			if (ch == 'i') {
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));

			} else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anualIncome, employees));
			}

		}

		System.out.println();
		System.out.println("TAXES PAID");

		double totalTaxes = 0.0;
		for (TaxPayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.totalTax()));
			totalTaxes += taxpayer.totalTax();
		}
		System.out.println();
		System.out.print("TOTAL TAXES: " + String.format("%.2f", totalTaxes));

		sc.close();

	}

}
