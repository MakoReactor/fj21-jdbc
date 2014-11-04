package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaAtualiza {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("João Bobo");
		contato.setEmail("jao@email.com.br");
		contato.setEndereco("Rua do João nº 999");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 7);
		
		// gravar nesta conexão
		ContatoDao dao = new ContatoDao();
		
		dao.altera(contato);
		System.out.println("Alterado!!!");
		

	}

}
