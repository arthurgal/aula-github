package entidades;
import java.util.Scanner;

public class Conta {
	
	private String titular;
	private int numeroConta;
	private double saldo = 0.0;
	
	private Scanner sc;
	public Conta(Scanner sc) {
        this.sc = sc;
    }
	
	
	public Conta(String titular, int numeroConta, Scanner sc) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
		this.sc = sc;
	}

	public String getTitular() {
		return titular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void deposito (double valor) {
		this.saldo += valor;
	}
	
	public void saque (double valor) {
		this.saldo -= valor;
	}
	
	
	public boolean acao (int acao) {
		if (acao == 1) {
			System.out.println("Diga quanto quer depositar: ");
			
			double valor = sc.nextDouble();
			this.saldo += valor;
			return true;
			
		}
		if (acao == 2) {
			System.out.println("Diga quanto quer Sacar: ");
			double valor = sc.nextDouble();
			if (valor > this.saldo) {
				System.out.println("Você não tem esse valor");
			}else {
				this.saldo -= valor;
			}
		return true;
		}
		
		if (acao == 3) {
			System.out.printf("Seu saldo é: %.2f%n", this.saldo);
			return true;
		}
		
		return false;
	}
}
