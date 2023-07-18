package model.dao;

import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	
	public static VendedorDaoo criarVendedorDaoo() {
		return new VendedorDaoJDBC();
		
	}

}
