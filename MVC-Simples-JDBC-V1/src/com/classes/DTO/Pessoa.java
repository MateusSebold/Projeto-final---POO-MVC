package com.classes.DTO;

public class Pessoa {
	
	private int cpf;
	private String nome;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome) {
		setNome(nome);
	}
	
	public Pessoa(int cpf, String nome) {
		setCpf(cpf);
		setNome(nome);
	}
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		if(cpf>100)
			this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length()>2)
			this.nome = nome;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaDAO [cpf=");
		builder.append(cpf);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
}
