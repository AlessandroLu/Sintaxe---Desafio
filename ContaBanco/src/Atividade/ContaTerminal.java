package Atividade;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int numero;
		String nomeCliente,primeiroNome, segundoNome, agencia;
		double saldo = 0;
		
		System.out.println("Por favor, digite o número da conta !");
		numero = scan.nextInt();
		
		System.out.println("Por favor, digite o número da Agência !");
		agencia = scan.next();
		
		System.out.println("Por favor, digite seu nome!");
		primeiroNome = scan.next();
		
		System.out.println("Por favor, digite seu sobrenome!");
		segundoNome = scan.next();
		
		nomeCliente = primeiroNome.concat(" " + segundoNome);
		
		System.out.println("Por favor, digite o valor do deposito!");
		saldo = scan.nextDouble();
		
		System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero +" e seu saldo " + saldo +" já está disponível para saque");
		

	}

}
