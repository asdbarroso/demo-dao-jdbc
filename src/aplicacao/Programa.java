package aplicacao;

import java.util.Date;

import entidades.Departamento;
import entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {

		Departamento departamento = new Departamento(1, "Livros");
		Vendedor vendedor = new Vendedor(21, "Michael", "michael@hotmail.com", new Date(), 5000.0, departamento);
		System.out.println(departamento);
		System.out.println(vendedor);

	}

}
