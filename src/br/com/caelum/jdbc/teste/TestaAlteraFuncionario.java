package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaAlteraFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Pedro de jesus");
		funcionario.setUsuario("pedroj");
		funcionario.setSenha("131313");
		funcionario.setId((long) 2);
				
		FuncionarioDao dao = new FuncionarioDao();
		dao.altera(funcionario);
		System.out.println("Funcionario: " + funcionario.getId() + " alterado com sucesso!!");
		
		
		

	}

}
