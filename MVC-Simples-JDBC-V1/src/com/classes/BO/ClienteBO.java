package com.classes.BO;

import java.util.List;

import com.classes.DAO.ClienteDAO;
import com.classes.DTO.Cliente;


public class ClienteBO {
		
	public boolean inserir(Cliente cliente){
	        if (existe(cliente) != true) {
	            ClienteDAO clienteDAO = new ClienteDAO();
	            return clienteDAO.inserir(cliente);
	        }
	        return false;
	    }
	    public boolean alterar(Cliente cliente){
	    	ClienteDAO clienteDAO = new ClienteDAO();
	        return clienteDAO.alterar(cliente);
	    }
	    public boolean excluir(Cliente cliente){
	    	ClienteDAO clienteDAO = new ClienteDAO();
	        return clienteDAO.excluir(cliente);
	    }
	  
	    public boolean existe(Cliente cliente){
	    	ClienteDAO clienteDAO = new ClienteDAO();
	        return clienteDAO.existe(cliente);
	    }
	    public Cliente procurarPorCodigo(Cliente cliente){
	    	ClienteDAO clienteDAO = new ClienteDAO();
	        return clienteDAO.procurarPorCodigo(cliente);
	    }
	    public Cliente procurarPorNome(Cliente cliente){
	        ClienteDAO clienteDAO = new ClienteDAO();
	        return clienteDAO.procurarPorNome(cliente);
	    }
	    public List<Cliente> pesquisarTodos(){
	    	ClienteDAO clienteDAO = new ClienteDAO();
	        return clienteDAO.pesquisarTodos();
	    }
	}

