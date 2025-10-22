/*[EN-US]:
 * Write a code in which we have a bank account that can do the following operations:
	    Check balance.
	    Check overdraft.
	    Deposit money.
	    Withdraw money.
	    Pay a bill.
	    Verify if the account is using overdraft.
	Follow the following rules to implement the code:
	    The bank account must have an overdraft limit summed to the account's balance.
	    The overdraft value is defined in the moment of the creation of the account, according to the deposited value in the account upon it's creation.
	    If the deposited value in the account creation is of R$500,00 or less, the overdraft should be of R$50,00.
	    To values over R$500,00, the overdraft must be of 50% of the deposited value.
	    In the case the overdraft limit is used, the account must charge a 20% fee based on the overdraft's used value as soon as possible.
    
    [PT-BR]:
    Escreva um código onde temos uma conta bancaria que possa realizar as seguintes operações:
		Consultar saldo
		consultar cheque especial
		Depositar dinheiro;
		Sacar dinheiro;
		Pagar um boleto.
		Verificar se a conta está usando cheque especial.
	Siga as seguintes regras para implementar

		A conta bancária deve ter um limite de cheque especial somado ao saldo da conta;
		O o valor do cheque especial é definido no momento da criação da conta, de acordo com o valor depositado na conta em sua criação;
		Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial deve ser de R$50,00
		Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado;
		Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma taxa de 20% do valor usado do cheque especial. 
		
    */
package topic03_Java_And_The_Art_Of_Abstraction_With_Classes_And_Encapsulation;

import java.util.Scanner;

public class Exercise_1 {
	
	private final static Scanner scanner = new Scanner(System.in);
	private static BankAccount bankAccount = null;
	
	public static void main(String Args[]) {
			int option = -1;			
		
			while (option !=0) {
				//If you are wondering what does this text mean, please, just google translate it, it will just take you a few seconds. Adding the translations to these lines would feel a little strange. It would be better to just have a language option but since I am not making a real system it would be really pointless.
				System.out.println("Bem-vindo ao sistema bancário. \n");
				if (bankAccount == null) {
					System.out.println("Você ainda não possui nenhuma conta. \nPara criar uma conta, digite 1. Para sair, 0.");
					option = scanner.nextInt();
					scanner.nextLine();
					if (option == 1) {
						createAccount();
						continue;
					}
				} else {
					System.out.println("Conta disponível. Por favor, escolha uma operação:");
					System.out.println("1 - Criar uma nova conta (Isso substituirá a atual)");
					System.out.println("2 - Consultar saldo");
					System.out.println("3 - Consultar cheque especial");
					System.out.println("4 - Realizar um depósito");
					System.out.println("5 - Realizar Saque");
					System.out.println("6 - Pagar Boleto");
					System.out.println("0 - Sair");
					option = scanner.nextInt();
					scanner.nextLine();
					
		     		switch (option) {
						case 0 -> System.exit(0);
						case 1 -> createAccount();
						case 2 -> checkBalance();
						case 3 -> checkOverdraft();
						case 4 -> depositMoney();
						case 5 -> withdrawlMoney();
						case 6 -> pay();
					}
				}

			}

	}
	public static void createAccount(){
		System.out.println("Para criar uma conta, é necessário realizar um depósito.");
		System.out.println("Digite um valor para realizar um depósito:");
		double depositAmount = scanner.nextDouble();
		bankAccount = new BankAccount(depositAmount);
		System.out.println("Conta criada com sucesso.");
	}
	public static void checkBalance(){
		System.out.println("Você possui: R$:"+ bankAccount.getBalance());		
	}
	public static void checkOverdraft(){
		System.out.println("Limite do cheque especial: R$:"+ bankAccount.getOverdraft());
	}
	public static void depositMoney(){
		System.out.println("Quanto dinheiro será depositado? \n R$:");
		double depositAmount = scanner.nextDouble();
		scanner.nextLine();
		bankAccount.depositMoney(depositAmount);
	}
	public static void withdrawlMoney(){
		System.out.println("Digite o valor de saque:");
		double withdrawalAmount = scanner.nextDouble();
		scanner.nextLine();
		bankAccount.withdrawMoney(withdrawalAmount);
	}
	public static void pay(){
		System.out.println("Digite o valor para pagar:");
		double withdrawalAmount = scanner.nextDouble();
		scanner.nextLine();
		bankAccount.withdrawMoney(withdrawalAmount);
	}

}