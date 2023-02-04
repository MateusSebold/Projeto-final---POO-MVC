package com.classes.BO;

import java.util.List;

import com.classes.DAO.LivroDAO;
import com.classes.DTO.Livro;

public class LivroBO {
	public boolean inserir(Livro livro){
    	if (existe(livro) != true) {
        	LivroDAO livroDAO = new LivroDAO();
        	return livroDAO.inserir(livro);
    	}
    	return false;
	}
	public boolean alterar(Livro livro){
   	 LivroDAO livroDAO = new LivroDAO();
    	return livroDAO.alterar(livro);
	}
	public boolean excluir(Livro livro){
   	 LivroDAO livroDAO = new LivroDAO();
    	return livroDAO.excluir(livro);
	}
 
	public boolean existe(Livro livro){
   	 LivroDAO livroDAO = new LivroDAO();
    	return livroDAO.existe(livro);
	}
	public Livro procurarPorCodigo(Livro livro){
   	 LivroDAO livroDAO = new LivroDAO();
    	return livroDAO.procurarPorCodigo(livro);
	}
	public Livro procurarPorNome(Livro livro){
   	 LivroDAO livroDAO = new LivroDAO();
    	return livroDAO.procurarPorNome(livro);
	}
	public List<Livro> pesquisarTodos(){
   	 LivroDAO livroDAO = new LivroDAO();
    	return livroDAO.pesquisarTodos();
	}

}
