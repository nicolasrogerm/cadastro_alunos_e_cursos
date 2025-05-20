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
		System.out.println("Nome do aluno(a): " + aluno1.getNome());
		System.out.println("Matrícula do aluno(a): " + aluno1.getMatricula());
		System.out.println("Nome do aluno(a): " + aluno1.getIdade());
		System.out.println();
		
	}
	
	public void exibirInformacoesAluno2(Aluno aluno2) {
		System.out.println("Nome do aluno(a): " + aluno2.getNome());
		System.out.println("Matrícula do aluno(a): " + aluno2.getMatricula());
		System.out.println("Nome do aluno(a): " + aluno2.getIdade());
		System.out.println();
		
	}

}