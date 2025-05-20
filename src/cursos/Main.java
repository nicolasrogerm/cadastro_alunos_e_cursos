package cursos;

public class Main {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Nicolas", "01", 19);
		Aluno aluno1 = new Aluno("Isa", "02", 18);
		
		Curso curso1 = new Curso("DS", "93314", 500);
		Curso curso2 = new Curso("ADM", "94415", 400);
		
		Matricula matricula1 = new Matricula(2024, 2, aluno1.getNome(), curso1.getNome());
				
	}

}