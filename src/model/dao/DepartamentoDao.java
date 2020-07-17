package model.dao;

import java.util.List;

import model.entidades.Departamento;

public interface DepartamentoDao {

	void inserir(Departamento dep);
	void atualizar(Departamento dep);
	void apagarPorId(Integer id);
	Departamento buscarPorId(Integer id);
	List<Departamento> buscaTodos();
	
}
