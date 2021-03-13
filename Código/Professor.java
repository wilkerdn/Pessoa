
public class Professor extends Pessoa {
	private String formacao;
	private String area;
	private int anoAdmissao;
	private int qtdadeAulas;
	
	Professor(int codigo, String nome, String dataNasc,String telefone, Endereco endereco, String formacao, String area, int anoAdmissao, int qtdadeAulas){
		super(codigo, nome, dataNasc, telefone, endereco);
		this.formacao = formacao;
		this.area = area;
		this.anoAdmissao = anoAdmissao;
		this.qtdadeAulas = qtdadeAulas;
	}

	public String getFormacao() {
		return formacao;
	}

	public String getArea() {
		return area;
	}

	public int getAnoAdmissao() {
		return anoAdmissao;
	}

	public int getQtdadeAulas() {
		return qtdadeAulas;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setAnoAdmissao(int anoAdmissao) {
		this.anoAdmissao = anoAdmissao;
	}

	public void setQtdadeAulas(int qtdadeAulas) {
		this.qtdadeAulas = qtdadeAulas;
	}
	
}
