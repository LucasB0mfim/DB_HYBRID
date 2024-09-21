package br.com.lbomfim.dao;

import br.com.lbomfim.dao.generic.GenericDAO;
import br.com.lbomfim.dao.generic.IGenericDAO;
import br.com.lbomfim.domain.Cliente2;

/**
 * @author Lucas Bomfim 
 */

public class Cliente2DAO extends GenericDAO<Cliente2, Long> implements IGenericDAO<Cliente2, Long> {

	public Cliente2DAO() {
		super(Cliente2.class);
	}
}

