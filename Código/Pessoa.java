
public abstract class Pessoa {
	private int codigo;
	private String nome;
	private String dataNasc;
	private String telefone;
	private Endereco endereco;
	
	public Pessoa(int codigo,String nome,String dataNasc, String telefone, Endereco endereco){
		this.codigo = codigo;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Pessoa() {
		codigo = 0;
		nome = "";
		dataNasc = "";
		telefone = "";
		endereco = new Endereco();
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
}
