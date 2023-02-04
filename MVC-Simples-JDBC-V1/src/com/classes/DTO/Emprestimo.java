package com.classes.DTO;
public class Emprestimo {
	
	private int codigo;
	private String dataEmprestimo;
	private String dataDevolucao;
	protected int livro;
	protected int cliente;
	
	public Emprestimo() {}
	
	public Emprestimo(String dataEmprestimo) {setDataEmprestimo(dataEmprestimo);}
	
	public Emprestimo(int codigo) {setCodigo(codigo);}
	
	public Emprestimo(String dataEmprestimo,String dataDevolucao, int livro, int cliente,int codigo) {
		setDataEmprestimo(dataEmprestimo);
		setDataDevolucao(dataDevolucao);
		setLivro(livro);
		setCliente(cliente);
		setCodigo(codigo);
	}
	public Emprestimo(String dataEmprestimo,String dataDevolucao, int livro, int cliente) {
		setDataEmprestimo(dataEmprestimo);
		setDataDevolucao(dataDevolucao);
		setLivro(livro);
		setCliente(cliente);
	}

	public int getLivro() {
		return livro;
	}


	public void setLivro(int livro) {
		this.livro = livro;
	}


	public int getCliente() {
		return cliente;
	}


	public void setCliente(int cliente) {
		this.cliente = cliente;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDataEmprestimo() {
		return dataEmprestimo;
	}


	public void setDataEmprestimo(String string) {
		this.dataEmprestimo = string;
	}


	public String getDataDevolucao() {
		return dataDevolucao;
	}


	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Emprestimo [codigo=");
		builder.append(codigo);
		builder.append(", dataEmprestimo=");
		builder.append(dataEmprestimo);
		builder.append(", dataDevolucao=");
		builder.append(dataDevolucao);
		builder.append(", livro=");
		builder.append(livro);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}
}
