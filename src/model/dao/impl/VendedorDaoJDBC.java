package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import db.DB;
import db.DbExcepetion;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class VendedorDaoJDBC implements VendedorDao {

	private Connection conn;

	public VendedorDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void inserir(Vendedor dep) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Vendedor dep) {
		// TODO Auto-generated method stub

	}

	@Override
	public void apagarPorId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vendedor buscarPorId(Integer id) {
		
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			st = conn.prepareStatement(
				"SELECT seller.*, department.Name as DepName "
				+ "FROM seller INNER JOIN department "
				+ "ON seller.DepartmentId = department.Id "
				+ "WHERE seller.Id = ?");						
			
			st.setInt(1, id);
			rs = st.executeQuery();
				
			if(rs.next()) {
				Departamento dep = new Departamento();
				dep.setId(rs.getInt("DepartmentId"));
				dep.setNome(rs.getString("DepName"));
				Vendedor vendedor = new Vendedor();
				vendedor.setId(rs.getInt("Id"));
				vendedor.setNome(rs.getString("Name"));
				vendedor.setEmail(rs.getString("Email"));
				vendedor.setDataNasc(rs.getDate("BirthDate"));
				vendedor.setSalarioBase(rs.getDouble("BaseSalary"));
				vendedor.setDepartamento(dep);
				
				return vendedor;
				
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbExcepetion(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
		
		
	}

	@Override
	public List<Vendedor> buscaTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
