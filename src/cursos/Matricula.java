package cursos;

public class Matricula {
	
	private int ano;
	private int semestre;
	private Aluno aluno;
	private Curso curso;
	
	
	public Matricula(int ano, int semestre, Aluno aluno, Curso curso) {
		super();
		this.ano = ano;
		this.semestre = semestre;
		this.aluno = aluno;
		this.curso = curso;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getSemestre() {
		return semestre;
	}


	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public void exibirInformacoesDaMatricula1(Aluno aluno1, Curso curso1, Matricula matricula1) {
		System.out.println("Nome do Aluno(a): " + aluno1.getNome());
		System.out.println("Nome do curso: " + curso1.getNome());
		System.out.println("Carga horária total: " + curso1.getCargaHoraria());
		System.out.println("Ano: " + matricula1.getAno());
		System.out.println("Semestre: " + matricula1.getSemestre());
	}
	
	
}

	