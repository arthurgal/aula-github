package aplicacao;

import entidades.Conta;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		
		System.out.println("Vamos Criar uma Conta no Banco 999Bets");
		
		System.out.print("Nome do Titular: ");
		String titular = sc.nextLine();
		
		
		int numero = random.nextInt(999999999);
		
		System.out.println();
		
		Conta usuario01 = new Conta (titular, numero, sc);
		
		System.out.println("Sua conta foi criada:");
		System.out.println("Numero da conta: " + usuario01.getNumeroConta());
		System.out.println("Nome do Titular: " + usuario01.getTitular());
		System.out.println("Seu saldo: R$ " + usuario01.getSaldo());
		System.out.println();
		
		while (true){
			System.out.println("Escolha uma função 1- Depositar  2- Sacar  3- Ver Saldo");
			if (!usuario01.acao(sc.nextInt())) {
                System.out.println("Digite um valor valido");
            }
		}
	}

}
