package com.classes.main;

import com.classes.BO.LivroBO;
import com.classes.DTO.Livro;



public class MainLivro {

	public static void main(String[] args) {
		LivroBO livroBO = new LivroBO();
		
		     
		
	   	 Livro livro = new Livro("Frankstein",6,"Terror","01/01/1818");
	   	 if (livroBO.inserir(livro))
	   		 System.out.println("Inserido com Sucesso");
	   	 else
	   		 System.out.println("Erro ao Inserir");
	   	 
	   	 
	   	 // alterar
	   	 
	   	 /*Livro livro = new Livro("Ranger - Ordem dos Arqueiros ",3,"Fantasi/Aventura","05/02/2009",1);
	   	 livroBO.alterar(livro);
	   	 livro = livroBO.procurarPorCodigo(livro);
	   	 System.out.println(livro); */
	   	 
	   	 /*Livro livro = new Livro(8);
	   	 if (livroBO.excluir(livro))
	   		 System.out.println("Excluido com Sucesso");
	   	 else
	   		 System.out.println("Erro ao Excluir"); */
	   	 
	   	 /*
	   	 Livro livro = new Livro("Dracula");
	   	 if (livroBO.existe(livro))
	   		 System.out.println("Cliente Encontrado");
	   	 else
	   		 System.out.println("Nao Encontrado");
	   	 
	   	 /*List<Livro> lista = new ArrayList<Livro>();
	   	 lista = livroBO.pesquisarTodos();    
	   	 for (Livro livro : lista) {
	   		 System.out.println(livro.toString());
	   	 }*/
	   	 /*
	   	 Livro livro = new Livro(3);
	   	 livro = livroBO.procurarPorCodigo(livro);
	   	 System.out.println(livro); */
	   	 
	   	 /*
	   	 Livro livro = new Livro("Dracula");
	   	 livro = livroBO.procurarPorNome(livro);
	   	 System.out.println(livro); */

	}

}
