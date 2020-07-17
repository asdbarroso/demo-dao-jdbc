package aplicacao;

import java.text.ParseException;

import model.dao.FabricaDao;
import model.dao.VendedorDao;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {

		VendedorDao vendedor = FabricaDao.CreateVendedorDao();
		System.out.println("===Teste Busca por Id===");
		Vendedor vendedorEncontrado = vendedor.buscarPorId(3);
		
		System.out.println(vendedorEncontrado);

	}

}
