package testes;

import java.util.Scanner;

public class TestaContexto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final float ADICIONAL = 1500;
		final float BONUS = 50;
		final float VL_PROGRAMADOR_CERTIFICA = 2000;
		final float VL_PROGRAMADOR_BASICO = 1000;
		
		String nome;
		int idade;
		float salario;
		boolean certificado;
		float rendaMensal;
		
		System.out.printf("Informe o seu nome: ");		
		nome = ler.nextLine();		
		
		System.out.printf("Informe a sua idade: ");		
		idade = ler.nextInt();		
		
		System.out.printf("Informe o seu sal�rio: ");		
		salario = ler.nextInt();		
		
		System.out.printf("Informe se tem certifica��o java: ");		
		certificado = ler.nextBoolean();
		
		System.out.println("Relat�rio");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sal�rio: " + salario);
		System.out.println("Certifica��o Java? " + (certificado ? "Sim" : "N�o"));

		float valorSalarial = salario + ADICIONAL;
		float valorIdade = idade * BONUS;
		float valorCertificacao = certificado ? VL_PROGRAMADOR_CERTIFICA : VL_PROGRAMADOR_BASICO;
		
		rendaMensal = valorSalarial + 
					  valorIdade +
					  valorCertificacao;
		
		System.out.printf("Resultado\n");
		System.out.printf("Renda Mensal: R$%.2f\n", rendaMensal);
		
		System.out.printf("F�rmula de C�lculo = (%.2f + %.2f) + (%d * %.2f) + %.2f\n",
				salario,
				ADICIONAL,
				idade,
				BONUS,
				valorCertificacao
				);
	}
}
