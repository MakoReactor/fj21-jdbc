package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TesteInsereFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Administrador");
		funcionario.setUsuario("admin");
		funcionario.setSenha("admin");
		
		FuncionarioDao dao = new FuncionarioDao();
		dao.adciona(funcionario);
		System.out.println("Funcionario " + funcionario.getNome() + " Gravado");

	}

}
