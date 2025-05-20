package cursos;

public class Aluno {
	private String nome;
	private String matricula;
	private int idade;
	
	public Aluno(String nome, String matricula, int idade) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void exibirInformacoesAluno1(Aluno aluno1) {
		System.out.println("Nome do aluno(a): " + getNome());
		System.out.println("Matrícula do aluno(a): " + getMatricula());
		System.out.println("Nome do aluno(a): " + getIdade());
		
	}

}
