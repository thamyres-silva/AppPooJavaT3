package testes;

import java.util.Scanner;

import negocio.Professor;

public class TestaProfessor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Professor teacher = new Professor();
		
		System.out.printf("Informe o seu nome: ");		
		teacher.nome = ler.nextLine();		
		
		System.out.printf("Informe a sua matrícula: ");		
		teacher.matricula = ler.nextInt();		
		
		System.out.printf("Informe o seu salário: ");		
		teacher.salario = ler.nextFloat();		

		System.out.printf("Informe se é um professor temporário: ");		
		teacher.temporario = ler.nextBoolean();
		
		System.out.printf("Informe a qtde de meses como professor: ");		
		teacher.mesesExperiencia = ler.nextInt();

		System.out.printf("Informe o valor de bônus: ");		
		teacher.bonus = ler.nextFloat();		

		System.out.printf("Informe o valor de gratificação: ");		
		teacher.gratificacao = ler.nextFloat();
		
		System.out.printf("Informe o valor de desconto: ");		
		teacher.desconto = ler.nextFloat();		

		System.out.printf("Informe a qtde de disciplinas: ");		
		teacher.qtdeDisciplinas = ler.nextInt();
		
		float salarioBruto = 0;
		final float VL_EXPERIENCIA = 50;
		final float VL_DISCIPLINA = 100;
		
		//salarioBruto = (100 + 50 + 25 - 10) = 165
		salarioBruto = (teacher.salario + teacher.bonus + teacher.gratificacao - teacher.desconto);
		//salarioBruto = 165 + (2 * 50) = 265
		salarioBruto = salarioBruto + (teacher.mesesExperiencia * VL_EXPERIENCIA);
		//salarioBruto = 265 + (10 * 100) = 1265
		salarioBruto = salarioBruto + (teacher.qtdeDisciplinas * VL_DISCIPLINA);

		System.out.printf("O professor %s (%d) é %s, pois ganha R$%.2f\n",
				teacher.nome,
				teacher.matricula,
				(salarioBruto >= 10000 ? "rico" : "pobre"),
				salarioBruto);
		
//		System.out.println("Nome: " + nome);
//		System.out.println("Matrícula: " + matricula);
//		System.out.println("Salário: " + salario);
//		System.out.println("Temporário? " + (temporario ? "Sim" : "Não"));		
	}
}