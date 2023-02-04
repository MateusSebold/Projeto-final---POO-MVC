package com.classes.DTO;

public class Cliente extends Pessoa {

	private int codigo;

	
	public Cliente(String nome) {
		super(nome);
	}
	public Cliente(int codigo ,int cpf, String nome) {
		super(cpf, nome);
		setCodigo(codigo);	
	}
	public Cliente(int cpf, String nome) {
		super(cpf, nome);
	}
	
	public Cliente() {
		
	}
	
	public Cliente(int codigo) {
		setCodigo(codigo);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [codigo=");
		builder.append(codigo);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
