package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.AutorBO;
import com.classes.DTO.Autor;
public class MainAutor  {

	public static void main(String[] args) {
		
		AutorBO autorBO = new AutorBO();
	   	 
	   	 // INSERIR    
	      	  
      	  Autor autor = new Autor(132313,"Rodrigo");
      	  if (autorBO.inserir(autor))
      		  System.out.println("Inserido com Sucesso");
      	  else
      		  System.out.println("Erro ao Inserir"); 
      	  
      	 
      	  // alterar
      	  /*
      	  Autor autor = new Autor(1,212121212,"Bram Stocker");
      	  autorBO.alterar(autor);
      	  autor = autorBO.procurarPorCodigo(autor);
      	  System.out.println(autor);*/
      	 
      	  /*Autor autor = new Autor(5);
      	  if (autorBO.excluir(autor))
      		  System.out.println("Excluido com Sucesso");
      	  else
      		  System.out.println("Erro ao Excluir"); */
      	 
      	  /*
      	  Autor autor = new Autor("Bram Stocker");
      	  if (autorBO.existe(autor))
      		  System.out.println("Cliente Encontrado");
      	  else
      		  System.out.println("Nao Encontrado");
      	  */
      	  /*List<Autor> lista = new ArrayList<Autor>();
      	  lista = autorBO.pesquisarTodos();    
      	  for (Autor autor : lista) {
      		  System.out.println(autor.toString());
      	  }*/
      	  /*
      	  Autor autor = new Autor(3);
      	  autor = autorBO.procurarPorCodigo(autor);
      	  System.out.println(autor); */
      	 
      	  /*
      	  Autor autor = new Autor("John Flanagan");
      	  autor = autorBO.procurarPorNome(autor);
      	  System.out.println(autor); */
    }

}

