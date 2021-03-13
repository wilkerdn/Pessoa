import java.util.ArrayList;

public interface InterfacePessoa {
	public void inserir(Pessoa pessoa);
	public void remover(Pessoa pessoa);
	public void atualizarDados(Pessoa pessoa);
	public Pessoa pesquisar(int codigo);
	public Pessoa pesquisar(Pessoa pessoa);
	public ArrayList<Pessoa> pesquisar();
}
