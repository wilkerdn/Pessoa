
public class Curso {
	private String nome;
	private String tipo;
	private int qtdadePeriodos;
	private float mensalidade;
	public String getNome() {
		return nome;
	}
	public String getTipo() {
		return tipo;
	}
	public int getQtdadePeriodos() {
		return qtdadePeriodos;
	}
	public float getMensalidade() {
		return mensalidade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setQtdadePeriodos(int qtdadePeriodos) {
		this.qtdadePeriodos = qtdadePeriodos;
	}
	public void setMensalidade(float mensalidade) {
		this.mensalidade = mensalidade;
	}
}
