package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.EmprestimoBO;
import com.classes.DTO.Emprestimo;
public class MainEmprestimo {

	public static void main(String[] args) {
		
		
		EmprestimoBO  emprestimoBO = new EmprestimoBO();
		
		Emprestimo emprestimo = new Emprestimo("2022-12-16","2023-01-16",4,5);
	    if (emprestimoBO.inserir(emprestimo))
		   System.out.println("Inserido com Sucesso");
	    else
		   System.out.println("Erro ao Inserir");
	    
	    /*Emprestimo emprestimo = new Emprestimo("2022-12-01","2022-12-20",1,5,4);
    	  emprestimoBO.alterar(emprestimo);
    	  emprestimo = emprestimoBO.procurarPorCodigo(emprestimo);
    	  System.out.println(emprestimo);
    	 
    	  // alterar
    	 /*
    	  Emprestimo emprestimo = new Emprestimo(3);
    	  if (emprestimoBO.excluir(emprestimo))
    		  System.out.println("Excluido com Sucesso");
    	  else
    		  System.out.println("Erro ao Excluir"); 
    	 */
    	  /*
    	  Emprestimo emprestimo = new Emprestimo("Dracula");
    	  if (emprestimoBO.existe(emprestimo))
    		  System.out.println("Cliente Encontrado");
    	  else
    		  System.out.println("Nao Encontrado");
    	  */
		
    	  /*List<Emprestimo> lista = new ArrayList<Emprestimo>();
    	  lista = emprestimoBO.pesquisarTodos();    
    	  for (Emprestimo emprestimo : lista) {
    		  System.out.println(emprestimo.toString());
    	  }*/
    	  
    	  /*Emprestimo emprestimo = new Emprestimo(5);
    	  emprestimo = emprestimoBO.procurarPorCodigo(emprestimo);
    	  System.out.println(emprestimo); */
    	 
    	  /*
    	  Emprestimo emprestimo = new Emprestimo("Dracula");
    	  emprestimo = emprestimoBO.procurarPorNome(emprestimo);
    	  System.out.println(emprestimo); */
		
	   
	   

	}

}
