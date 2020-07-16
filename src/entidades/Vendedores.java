package entidades;

import java.sql.Date;

public class Vendedores {

	private Integer id;
	private String nome;
	private String email;
	private Date dataNasc;
	private Double salarioBase;
	private Departamento departamento;
	
	public Vendedores(Integer id, String nome, String email, Date dataNasc, Double salarioBase,
			Departamento departamento) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.dataNasc = dataNasc;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Vendedores [id=" + id + ", nome=" + nome + ", email=" + email + ", dataNasc=" + dataNasc
				+ ", salarioBase=" + salarioBase + ", departamento=" + departamento + "]";
	}
}