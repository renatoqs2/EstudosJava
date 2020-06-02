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

		Account acc = new Account(1001, "Alex", 0.0);
		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.00);
		
/* 		UPCASTING
 * Atribuir objetos de uma subclasse a uma variável do tipo superclasse
 * 
 */
		Account acc1 = bacc;
		acc1.getBalance(); //acessa os metodos da superclasse, porém não acessa os da subclasse.
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
/*
 * 		DOWNCASTING
 * 		Atribuir objetos de uma superclasse a uma variável do tipo subclasse		
 */
		
		BusinessAccount acc4 = (BusinessAccount)acc2; // é possível forçar o casting acrescentando o casting (BusinesAccount) entre parênteses
		acc4.loan(100.00); //agora os métodos da subclasse estão acessíveis.
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; // Vai dar erro SOMENTE EM RUNTIME porque acc3 foi 
													  // instanciada com uma conta do tipo SavingsAccount.
		
		//TESTAR A INSTANCIA DE UMA VARIÁVEL
		if(acc3 instanceof BusinessAccount) { // vai pular o if porque acc3 não é BusinessAccount
			BusinessAccount acc5 = (BusinessAccount) acc3; 
			acc5.loan(500.00);
			System.out.println("loan");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
			
		}
		
		sc.close();
	}

}
