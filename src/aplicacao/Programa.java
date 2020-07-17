package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Departamento departamento = new Departamento(1, "Livros");
		Vendedor vendedor = new Vendedor(21, "Michael", "michael@hotmail.com", sdf.parse("16/07/1985"), 5000.0, departamento);
		System.out.println(departamento);
		System.out.println(vendedor);

	}

}
