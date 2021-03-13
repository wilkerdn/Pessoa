import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Faculdade f = new Faculdade();
		int op = 0;
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES\n1 - Inserir Pessoa\n"
				+ "2 - Remover Pessoa\n3 - Atualizar dados\n4 - Pesquisar pela pessoa\n"
				+ "5 - Pesquisar pelo código\n6 - Imprimir todas as pessoas\n7 - Sair"));
		switch(op) {
		case 1:{
			int op2 = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES\n1 - Aluno\n2 - Professor\n"));
			if(op2==1) {
				for(int i=0;i<3;i++) {
				int cod = (Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
				String n = (JOptionPane.showInputDialog("Digite o nome"));
				String dn = (JOptionPane.showInputDialog("Digite a data de nascimento"));
				String tel = (JOptionPane.showInputDialog("Digite o telefone"));
				Endereco e = new Endereco();
				e.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
				e.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número")));
				e.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
				e.setCidade(JOptionPane.showInputDialog("Digite a cidade"));
				e.setEstado(JOptionPane.showInputDialog("Digite o estado"));
				int mat = (Integer.parseInt(JOptionPane.showInputDialog("Digite o número da matrícula")));
				Curso c = new Curso();
				c.setNome(JOptionPane.showInputDialog("Digite o nome do curso"));
				c.setTipo(JOptionPane.showInputDialog("Digite o tipo do curso"));
				c.setQtdadePeriodos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de períodos")));
				c.setMensalidade(Float.parseFloat(JOptionPane.showInputDialog("Digite a mensalidade")));
				int anoi = (Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de ingresso")));
				Pessoa aluno = new Aluno(cod, n, dn, tel, e, mat, c, anoi);
				f.inserir(aluno);
				}
			}else {
				for(int i=0;i<2;i++) {
				int cod = (Integer.parseInt(JOptionPane.showInputDialog("Digite o código")));
				String n = (JOptionPane.showInputDialog("Digite o nome"));
				String dn = (JOptionPane.showInputDialog("Digite a data de nascimento"));
				String tel = (JOptionPane.showInputDialog("Digite o telefone"));
				Endereco e = new Endereco();
				e.setLogradouro(JOptionPane.showInputDialog("Digite o logradouro"));
				e.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número")));
				e.setComplemento(JOptionPane.showInputDialog("Digite o complemento"));
				e.setCidade(JOptionPane.showInputDialog("Digite a cidade"));
				e.setEstado(JOptionPane.showInputDialog("Digite o estado"));
				String form = JOptionPane.showInputDialog("Digite a formação");
				String area = JOptionPane.showInputDialog("Digite a área");
				int anoAdm = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de admissão"));
				int qtdadeAulas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aulas"));
				Pessoa professor = new Professor(cod, n, dn, tel, e, form, area, anoAdm, qtdadeAulas);
				f.inserir(professor);
				}
			}
			break;
		}
		case 2:{
			String imp = "Escolha uma pessoa\n";
			for(int i=0; i<f.getDados().size(); i++) {
				imp += i + " - " + f.getDados().get(i).getNome() + "\n";
			}
			int exc = Integer.parseInt(JOptionPane.showInputDialog(imp));
			f.remover(f.getDados().get(exc));
			break;
		}
		case 3:{
			String imp = "Escolha uma pessoa\n";
			for(int i=0; i<f.getDados().size(); i++) {
				imp += i + " - " + f.getDados().get(i).getNome() + "\n";
			}
			int atual = Integer.parseInt(JOptionPane.showInputDialog(imp));
			f.atualizarDados(f.getDados().get(atual));
			break;
		}
		case 4:{
			String imp = "Escolha uma pessoa\n";
			for(int i=0; i<f.getDados().size(); i++) {
				imp += i + " - " + f.getDados().get(i).getNome() + "\n";
			}
			int pesq = Integer.parseInt(JOptionPane.showInputDialog(imp));
			Pessoa a = f.pesquisar(f.getDados().get(pesq));
			String aux = "Código: " + a.getCodigo()+"\nNome: "+a.getNome()+"\nData de Nascimento: "+
			a.getDataNasc()+"\nTelefone: "+a.getTelefone()+"\nLogradouro: "+a.getEndereco().getLogradouro()+
			"\nNúmero: "+a.getEndereco().getNumero()+"\nComplemento: "+a.getEndereco().getComplemento()+
			"\nCidade: "+a.getEndereco().getCidade()+"\nEstado: "+a.getEndereco().getEstado();
			JOptionPane.showMessageDialog(null,aux);
			break;
		}
		case 5:{
			String imp = "Digite um código\n";
			for(int i = 0; i<f.getDados().size();i++) {
				imp += f.getDados().get(i).getCodigo() + "\n";
			}
			int cod = Integer.parseInt(JOptionPane.showInputDialog(imp));
			Pessoa a = f.pesquisar(cod);
			String aux = "Código: " + a.getCodigo()+"\nNome: "+a.getNome()+"\nData de Nascimento: "+
			a.getDataNasc()+"\nTelefone: "+a.getTelefone()+"\nLogradouro: "+a.getEndereco().getLogradouro()+
			"\nNúmero: "+a.getEndereco().getNumero()+"\nComplemento: "+a.getEndereco().getComplemento()+
			"\nCidade: "+a.getEndereco().getCidade()+"\nEstado: "+a.getEndereco().getEstado();
			JOptionPane.showMessageDialog(null,aux);
			break;
		}
		case 6:{
			ArrayList<Pessoa> p = f.pesquisar();
			String imp = "Pessoas\n";
			for(int i = 0;i<p.size();i++) {
				imp += i + " - " + p.get(i).getNome();
			}
			JOptionPane.showMessageDialog(null,imp);
			break;
		}
		case 7:{
			JOptionPane.showMessageDialog(null,"Programa finalizado!");
			break;
		}
		default:{
			JOptionPane.showMessageDialog(null,"Opção inválida!");
			break;
		}
		}
		}while(op!=7);
	}

}
