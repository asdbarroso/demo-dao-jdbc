package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class ProgramaVendedores {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		VendedorDao vendedor = FabricaDao.CreateVendedorDao();
		DepartamentoDao departamento = FabricaDao.CreateDepartamentoDao();

		System.out.println("===Testes Vendedores===");
		System.out.println("=======================");
		
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

		
		System.out.println("\n === Teste 4 - Inserir Vendedor====");
		Vendedor vendedorInserir = new Vendedor();
		Departamento depInserir = new Departamento();
		depInserir.setId(2);
		vendedorInserir.setNome("Jorge");
		vendedorInserir.setEmail("jorge@gmail.com");
		vendedorInserir.setDataNasc(sdf.parse(("20/07/1965")));
		vendedorInserir.setSalarioBase(2500.00);
		vendedorInserir.setDepartamento(depInserir);
		vendedor.inserir(vendedorInserir);
		System.out.println("Novo Id inserido : " + vendedorInserir.getId());

		System.out.println("\n===Teste 5 - Atualização de Vendedor");
		Vendedor vendAtu = vendedor.buscarPorId(1);
		vendAtu.setNome("Bruce Wayne");
		vendAtu.setEmail("wayne@gmail.com");
		vendedor.atualizar(vendAtu);
		System.out.println("Update Completo!!");
		System.out.println("Vendedor atualizado: " + vendedorEncontrado.getId());
		
		System.out.println("==============================");

		System.out.println("===Testes Departamento===");
		System.out.println("Teste 1 - Inserindo Departamento ");
		
		System.out.println("Informe o nome do departamento a inserir: ");
		
		
		System.out.println("\n===Teste 6 - Vendedor Deletado===");
		vendAtu = vendedor.buscarPorId(13);
		if(vendAtu != null) {
		vendedor.apagarPorId(vendAtu.getId());
		System.out.println("Vendedor com Id " + vendAtu.getId() + " deletado!!");
		}
		else {
			System.out.println("Vendedor não existe!!");
		}
		
		System.out.println("\n===Teste Busca Departamento po Id====");
		Departamento dep = departamento.buscarPorId(3);
		System.out.println(dep);

	}

}
