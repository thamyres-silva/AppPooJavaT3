package negocio;

public class Aluno {
	public String nome;
	public int idade;
	public float mensalidade;
	public boolean masculino;
	
	final int ANO_ATUAL = 2018;
	
	//método
	//visibilidade tipo_retorno nome_metodo(parametros)
	
	public void exibir() {
		System.out.printf("%s %s tem %d anos e paga R$%.2f\n",
				(masculino ? "O aluno" : "A aluna"),
				nome,
				idade,
				mensalidade
			);		
		impressao();
	}
	
	private void impressao () {
		System.out.println("Ano de nascimento: " + calcularAnoNascimento());
		System.out.println("Tipo de salario: " + obterTipoSalario ());
	}
	
	private int calcularAnoNascimento() {
		return ANO_ATUAL - idade;
	}
		
	private String obterTipoSalario () {
		if(mensalidade >= 1000) {
			return "Muito caro!!";
		} else if(mensalidade >= 500 & mensalidade < 1000){
			return "Barato!";
		} else {
			return "Muito Barato!!!";
		}				
	}		
}