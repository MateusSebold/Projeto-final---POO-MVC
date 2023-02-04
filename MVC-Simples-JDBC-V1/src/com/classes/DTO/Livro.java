package com.classes.DTO;

import java.sql.Date;

public class Livro {
	
	
	
	private int codigo ;
	private String nome;
	private  int autor; 
	private String descricao;
	private String publicacao;
	
	
	public Livro(){}
	
	public Livro(String nome,  int autor, String descricao,String publicacao,int codigo){
		setNome(nome);
		setAutor(autor);
		setDescricao(descricao);
		setPublicacao(publicacao);
		setCodigo(codigo);
		
	}
	public Livro(String nome,  int autor, String descricao,String publicacao) {
		setNome(nome);
		setAutor(autor);
		setDescricao(descricao);
		setPublicacao(publicacao);
	}
	public Livro(int codigo){
		setCodigo(codigo);
	}
	public Livro(String nome){
		setNome(nome);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAutor() {
		return autor;
	}
	public void setAutor(int autor) {
		this.autor = autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String  getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(String  publicacao) {
		this.publicacao = publicacao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Livro [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", publicacao=");
		builder.append(publicacao);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
