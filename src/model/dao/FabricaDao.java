package model.dao;

import db.DB;
import model.dao.impl.VendedorDaoJDBC;

public class FabricaDao {

	public static VendedorDao CreateVendedorDao() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
	
}
