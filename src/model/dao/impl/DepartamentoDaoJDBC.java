package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbExcepetion;
import model.dao.DepartamentoDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class DepartamentoDaoJDBC implements DepartamentoDao {

	private Connection conn = null;
	
	public DepartamentoDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public void inserir(Departamento dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Departamento dep) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagarPorId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Departamento buscarPorId(Integer id) {
		ResultSet rs = null;
		PreparedStatement st = null;
		
		try {
		st = conn.prepareStatement(  
				"SELECT seller.*, department.Name as DepName " 
				+ "FROM seller INNER JOIN department "
				+ "ON seller.DepartmentId = department.Id " 
				+ "WHERE DepartmentId = ? "
				+ "ORDER BY NAME");
	
		st.setInt(1, id);
		rs = st.executeQuery();		
		
		if(rs.next()) {
			Departamento dep = new Departamento();
			dep.setId(rs.getInt("DepartmentId"));
			dep.setNome(rs.getString("DepName"));
			return dep;
		}
		return null;
		}
		catch(SQLException e) {
			throw new DbExcepetion(e.getMessage());
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

	@Override
	public List<Departamento> buscaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
