package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account acc1 = new Account(1001, "Ze", 1000.00);
		acc1.withdraw(200.00);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Anna", 1000.00, 0.01); // --> aqui foi feito Upcasting 
		acc2.withdraw(200.00);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Marcelo", 1000.00, 1000.00);
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
		
		
	sc.close();
	}

}
