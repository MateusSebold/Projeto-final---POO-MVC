package com.classes.BO;

import java.util.List;

import com.classes.DAO.EmprestimoDAO;
import com.classes.DTO.Emprestimo;

public class EmprestimoBO {
	public boolean inserir(Emprestimo emprestimo){
    	if (existe(emprestimo) != true) {
        	EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
        	return emprestimoDAO.inserir(emprestimo);
    	}
    	return false;
	}
	public boolean alterar(Emprestimo emprestimo){
   	 EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    	return emprestimoDAO.alterar(emprestimo);
	}
	public boolean excluir(Emprestimo emprestimo){
   	 EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    	return emprestimoDAO.excluir(emprestimo);
	}
 
	public boolean existe(Emprestimo emprestimo){
   	 EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    	return emprestimoDAO.existe(emprestimo);
	}
	public Emprestimo procurarPorCodigo(Emprestimo emprestimo){
   	 EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    	return emprestimoDAO.procurarPorCodigo(emprestimo);
	}
	public Emprestimo procurarPorDataEmprestimo(Emprestimo emprestimo){
   	 EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    	return emprestimoDAO.procurarPorDataEmprestimo(emprestimo);
	}
	public List<Emprestimo> pesquisarTodos(){
   	 EmprestimoDAO emprestimoDAO = new EmprestimoDAO();
    	return emprestimoDAO.pesquisarTodos();
	}

}
