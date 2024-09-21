package br.com.lbomfim;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.lbomfim.dao.Cliente2DAO;
import br.com.lbomfim.domain.Cliente2;
import br.com.lbomfim.exception.CadastroException;

/**
 * @author Lucas Bomfim 
 */

public class Cliente2Test {
	
	private Cliente2DAO cliente2DAO;
	
	@Before
    public void setUp() {
		cliente2DAO = new Cliente2DAO();
    }

    @After
    public void tearDown() {
    	cliente2DAO = null;
    }
	
	@Test
	public void cadastrarCliente() throws CadastroException {
		Cliente2 cliente = new Cliente2();
		cliente.setCidade("TESTANDO");
		cliente.setCpf(323413412l);
		cliente.setEndereco("TESTE TESTE");
		cliente.setEstado("SP");
		cliente.setNome("TESTE");
		cliente.setNumero(123);
		cliente.setTelefone(789123l);
		cliente2DAO.cadastrar(cliente);
	}
}
