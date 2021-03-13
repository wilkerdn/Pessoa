import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Faculdade implements InterfacePessoa {
	private ArrayList<Pessoa> dados = new ArrayList<>();

	public ArrayList<Pessoa> getDados() {
		return dados;
	}

	@Override
	public void inserir(Pessoa pessoa) {
		dados.add(pessoa);
	}

	@Override
	public void remover(Pessoa pessoa) {
		dados.remove(pessoa);
	}

	@Override
	public void atualizarDados(Pessoa pessoa) {
		int codigo = pessoa.getCodigo();
		int num = 0,op = 10, op2 = 10;
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i).getCodigo() == codigo) {
				num = i;
			}
		}
		String imp = "Escolha um dado para atualizar\n1 - Codigo\n2 - Nome\n3 - Data de nascimento\n"
					+ "4 - Telefone\n5 - Endereço\n0 -Sair";
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(imp));
			switch(op) {
			case 1:
				int cod = (Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
				dados.get(num).setCodigo(cod);
			break;
			case 2:
				String n = (JOptionPane.showInputDialog("Digite o nome"));
				dados.get(num).setNome(n);
			break;
			case 3:
				String dn = (JOptionPane.showInputDialog("Digite a data de nascimento"));
				dados.get(num).setDataNasc(dn);
			break;
			case 4:
				String tel = (JOptionPane.showInputDialog("Digite o telefone"));
				dados.get(num).setTelefone(tel);
			break;
			case 5:
				String imp2 = "Escolha uma opção\n1 - Logradouro\n2 - Número\n3 - Complemento\n4 - Cidade\n"
						+ "5 - Estado\n0 - Sair\n";
				do {
				op2 = Integer.parseInt(JOptionPane.showInputDialog(imp2));
				switch(op2) {
				case 1:
				dados.get(num).getEndereco().setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
				break;
				case 2:
				dados.get(num).getEndereco().setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número")));
				case 3:
				dados.get(num).getEndereco().setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
				break;
				case 4:
				dados.get(num).getEndereco().setCidade(JOptionPane.showInputDialog("Digite a cidade"));
				break;
				case 5:
				dados.get(num).getEndereco().setEstado(JOptionPane.showInputDialog("Digite o estado"));
				break;
				}
				}while(op2!=0);
				break;
			}	
		}while(op!=0);
	}

	@Override
	public Pessoa pesquisar(int codigo) {
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i).getCodigo() == codigo) {
				return dados.get(i);
			}
		}
		return null;
	}

	@Override
	public Pessoa pesquisar(Pessoa pessoa) {
		int codigo = pessoa.getCodigo();
		for(int i = 0; i < dados.size(); i++) {
			if(dados.get(i).getCodigo() == codigo) {
				return dados.get(i);
			}
		}
		return null;
	}

	@Override
	public ArrayList<Pessoa> pesquisar() {
		return dados;
	}
}
