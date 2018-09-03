package testes;

import java.util.Scanner;

import negocio.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
				
		Scanner ler = new Scanner(System.in); 
		
		Aluno maria = new Aluno();
		Aluno joao = new Aluno();
		
		System.out.printf("Informe o seu nome: ");
		maria.nome = ler.next();
		
		System.out.printf("Informe o sua idade: ");
		maria.idade = ler.nextInt();
		
		System.out.printf("Informe a sua mensalidade: ");
		maria.mensalidade = ler.nextFloat();
		
		System.out.printf("Você é do sexo masculino? ");
		maria.masculino = ler.nextBoolean();
		
		maria.exibir();
		
		System.out.printf("Informe o seu nome: ");
		joao.nome = ler.next();

		System.out.printf("Informe o sua idade: ");
		joao.idade = ler.nextInt();

		System.out.printf("Informe a sua mensalidade: ");
		joao.mensalidade = ler.nextFloat();

		System.out.printf("Você é do sexo masculino? ");
		joao.masculino = ler.nextBoolean();
		
		joao.exibir();	
		
//		System.out.printf("%s %s tem %d anos e paga R$%.2f\n",
//				(maria.masculino ? "O aluno" : "A aluna"),
//				maria.nome,
//				maria.idade,
//				maria.mensalidade
//			);
				
		
		
//		Exiba na tela o nome do aluno mais velho
		System.out.printf("%s é o aluno mais velho\n",
				(maria.idade >= joao.idade ? maria.nome : joao.nome));
		
//		Exiba na tela o nome do aluno que paga a maior mensalidade
		System.out.printf("%s é o aluno com a maior mensalidade\n",
				(maria.mensalidade >= joao.mensalidade ? maria.nome : joao.nome));
	}	
}
