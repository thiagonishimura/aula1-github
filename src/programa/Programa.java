package programa;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		}

		else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Update account data:");
		System.out.println(conta);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		conta.sacar(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(conta);
		
		sc.close();

	}

}
