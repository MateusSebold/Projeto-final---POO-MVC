package com.classes.BO;

import java.util.List;

import com.classes.DAO.AutorDAO;
import com.classes.DTO.Autor;

public class AutorBO {
	public boolean inserir(Autor autor){
        if (existe(autor) != true) {
            AutorDAO autorDAO = new AutorDAO();
            return autorDAO.inserir(autor);
        }
        return false;
    }
    public boolean alterar(Autor autor){
    	AutorDAO autorDAO = new AutorDAO();
        return autorDAO.alterar(autor);
    }
    public boolean excluir(Autor autor){
    	AutorDAO autorDAO = new AutorDAO();
        return autorDAO.excluir(autor);
    }
  
    public boolean existe(Autor autor){
    	AutorDAO autorDAO = new AutorDAO();
        return autorDAO.existe(autor);
    }
    public Autor procurarPorCodigo(Autor autor){
    	AutorDAO autorDAO = new AutorDAO();
        return autorDAO.procurarPorCodigo(autor);
    }
    public Autor procurarPorNome(Autor autor){
    	AutorDAO autorDAO = new AutorDAO();
        return autorDAO.procurarPorNome(autor);
    }
    public List<Autor> pesquisarTodos(){
    	AutorDAO autorDAO = new AutorDAO();
        return autorDAO.pesquisarTodos();
    }
}
