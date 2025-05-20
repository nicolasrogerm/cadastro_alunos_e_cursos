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

}
