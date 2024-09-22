package br.com.lbomfim;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.lbomfim.dao.Cliente2DAO;
import br.com.lbomfim.domain.Cliente;
import br.com.lbomfim.domain.Cliente2;
import br.com.lbomfim.domain.Venda;
import br.com.lbomfim.exception.BuscaException;
import br.com.lbomfim.exception.CadastroException;
import br.com.lbomfim.exception.ConsultaException;

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
	public void cadastrarCliente() throws CadastroException, BuscaException, ConsultaException {
		
		// CRIAR ENTIDADE
		Cliente2 cliente = new Cliente2();
		cliente.setCidade("Olinda");
		cliente.setCpf(323413412l);
		cliente.setEndereco("Av. Sol Nascente");
		cliente.setEstado("PE");
		cliente.setNome("Fabiano Vitor");
		cliente.setNumero(916);
		cliente.setTelefone(81989658714l);
		
		// CADASTRAR
		cliente2DAO.cadastrar(cliente);
		assertNotNull(cliente);
		
		// CONSULTAR NO BANCO
		Cliente2 consultar_cliente = cliente2DAO.consultar(cliente.getId());
		assertNotNull(consultar_cliente);
		
		// ATUALIZAR
		consultar_cliente.setEstado("PB");
		
		// BUSCAR TUDO
        Collection<Cliente2> lista = cliente2DAO.buscarTodos();
        assertTrue(lista.size() >= 0);
	}
}
