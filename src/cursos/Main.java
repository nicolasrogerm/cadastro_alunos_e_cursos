package cursos;

public class Main {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Nicolas", "01", 19);
		Aluno aluno2 = new Aluno("Isa", "02", 18);
		
		Curso curso1 = new Curso("DS", "93314", 500);
		Curso curso2 = new Curso("ADM", "94415", 400);
		
		Matricula matricula1 = new Matricula(2024, 2, aluno1.getNome(), curso1.getNome());
		Matricula matricula2 = new Matricula(2025, 1, aluno2.getNome(), curso2.getNome());
		
		aluno1.exibirInformacoesAluno1(aluno1);
		curso1.exibirInformacoesCurso1(curso1);
		
		aluno2.exibirInformacoesAluno1(aluno2);
		curso2.exibirInformacoesCurso2(curso2);
		
		matricula1.exibirInformacoesDaMatricula(aluno1, curso1, matricula1);
		matricula2.exibirInformacoesDaMatricula(aluno2, curso2, matricula2);
	}
}