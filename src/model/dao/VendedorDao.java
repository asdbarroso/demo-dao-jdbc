package model.dao;

import java.util.List;

import model.entidades.Departamento;
import model.entidades.Vendedor;

public interface VendedorDao {

	void inserir(Vendedor dep);
	void atualizar(Vendedor dep);
	void apagarPorId(Integer id);
	Vendedor buscarPorId(Integer id);
	List<Vendedor> buscarTodos();
	List<Vendedor> buscaPorDepartamento(Departamento dep);
}
