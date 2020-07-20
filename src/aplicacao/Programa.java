package aplicacao;

import java.text.ParseException;
import java.util.List;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {

		VendedorDao vendedor = FabricaDao.CreateVendedorDao();
		DepartamentoDao departamento = FabricaDao.CreateDepartamentoDao();

		System.out.println("===Teste Busca Vendedores por Id===");
		Vendedor vendedorEncontrado = vendedor.buscarPorId(3);
		System.out.println(vendedorEncontrado);

		System.out.println("\n===Teste 2 Lista Vendedores por departamento===");
		Departamento depto = new Departamento(2, null);
		List<Vendedor> vendedorEncontrado2 = vendedor.buscaPorDepartamento(depto);
		for (Vendedor vend : vendedorEncontrado2) {
			System.out.println(vend);
		}

		System.out.println("\n === Teste 3 - Listar todos Vendedores===");
		vendedorEncontrado2 = vendedor.buscarTodos();
		for (Vendedor vend : vendedorEncontrado2) {
			System.out.println(vend);
		}

		System.out.println("\n===Teste Busca Departamento po Id====");
		Departamento dep = departamento.buscarPorId(3);
		System.out.println(dep);

	}

}
