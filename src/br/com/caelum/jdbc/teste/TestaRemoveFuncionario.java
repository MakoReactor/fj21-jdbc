package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestaRemoveFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		funcionario.setId((long) 3);
		
		System.out.println("Funcionario: " + funcionario.getId());
		FuncionarioDao dao = new FuncionarioDao();
		dao.remove(funcionario);
		System.out.println("Apagado");
		
		
		
	}

}
