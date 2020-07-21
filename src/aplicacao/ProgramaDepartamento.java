package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DepartamentoDao;
import model.dao.FabricaDao;
import model.entidades.Departamento;

public class ProgramaDepartamento {

	public static void main(String[] args) {
		
		DepartamentoDao departamentoDao = FabricaDao.CreateDepartamentoDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===Teste Departamentos===");
		System.out.println("===Teste 1 - Inserção Departamento");

		Departamento dep = new Departamento();
		
		/*
		System.out.println("Informe o nome do novo Departamento: ");
		dep.setNome(sc.nextLine());
		departamentoDao.inserir(dep);
		System.out.println("Registro inserido com Id " + dep.getId());
		*/
		
		
		/*
		 * System.out.println("=== Teste 2 - Atualização de Departamento===");
		 * System.out.print("Informar o Id do Departamento a ser alterado: "); int id =
		 * sc.nextInt(); dep = departamentoDao.buscarPorId(id);
		 * System.out.print("Informe o nome para o departamento: ");
		 * dep.setNome(sc.next()); departamentoDao.atualizar(dep);
		 */

		/*
		 * System.out.println("===Teste 3 - Deletar departamento===");
		 * System.out.println("Informe o Id do departamento para ser deletado: "); id =
		 * sc.nextInt(); departamentoDao.apagarPorId(id);
		 */
		
		/*
		 * System.out.println("===Teste 4 - Busca departamento por Id"); dep =
		 * departamentoDao.buscarPorId(1);
		 * System.out.println("Departamento encontrado: " + dep.getId() + " - " +
		 * dep.getNome());
		 */
		
		
		System.out.println("===Teste 5 - Busca todos os departamentos");
		List<Departamento> lista = departamentoDao.buscaTodos();
		
		for(Departamento d : lista) {
			System.out.println(d);
		}
		
	}

}
