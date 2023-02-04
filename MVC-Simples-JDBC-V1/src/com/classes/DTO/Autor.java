package com.classes.DTO;

public class Autor extends Pessoa {
	
	private int codigo;
	
	
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Autor() {
		
	}
	public Autor(int codigo) {
		setCodigo(codigo);
	}

	public Autor(int cpf, String nome) {
		super(cpf, nome);
	}
	public Autor( String nome) {
		super( nome);
	}
	public Autor(int codigo ,int cpf, String nome) {
		super(cpf, nome);
		setCodigo(codigo);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autor [codigo=");
		builder.append(codigo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
