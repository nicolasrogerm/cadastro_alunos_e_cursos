package cursos;

public class Curso {
	
	public String nome;
	public String codigo;
	public int cargaHoraria;
	
	public Curso(String nome, String codigo, int cargaHoraria) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.cargaHoraria = cargaHoraria;	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo (String codigo) {
		this.codigo = codigo;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCodigo (int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public void exibirInformacoesCurso1(Curso curso1) {
		System.out.println("Nome do curso: " + curso1.getNome());
		System.out.println("Código do curso: " + curso1.getCodigo());
		System.out.println("Carga horária total: " + curso1.getCargaHoraria());
		System.out.println();
	}
	
	public void exibirInformacoesCurso2(Curso curso2) {
		System.out.println("Nome do curso: " + curso2.getNome());
		System.out.println("Código do curso: " + curso2.getCodigo());
		System.out.println("Carga horária total: " + curso2.getCargaHoraria());
		System.out.println();
	}

}