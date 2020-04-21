package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double initialBalance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();	
		
		try {
		Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);
		
		
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		System.out.print("New balance: " + String.format("%.2f", account.getBalance()));
		
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
