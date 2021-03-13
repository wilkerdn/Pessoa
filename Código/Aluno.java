
public class Aluno extends Pessoa {
	private int matricula;
	private Curso curso;
	private int anoIngresso;
	
	public Aluno(int codigo,String nome,String dataNasc, String telefone, Endereco endereco, int matricula, Curso curso, int anoIngresso) {
		super(codigo, nome, dataNasc, telefone, endereco);
		this.matricula = matricula;
		this.curso = curso;
		this.anoIngresso = anoIngresso;
	}

	public int getMatricula() {
		return matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
}
