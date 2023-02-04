package com.classes.main;

import java.util.ArrayList;
import java.util.List;

import com.classes.BO.ClienteBO;
import com.classes.DTO.Cliente;



public class MainCliente {
	public static void main(String[] args) {
		
		ClienteBO clienteBO = new ClienteBO();
		
		//INSERIR
		
		Cliente cliente = new Cliente(343443,"Marcela lee");
		if (clienteBO.inserir(cliente))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir"); 
		
		
		//ALTERAR
		/*
		Cliente cliente = new Cliente(3,212121212,"Roger");
		clienteBO.alterar(cliente);
		cliente = clienteBO.procurarPorCodigo(cliente);
		System.out.println(cliente);*/
		
		//EXCLUIR
		/*
		Cliente cliente = new Cliente(3);
		if (clienteBO.excluir(cliente))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");*/
		
		
		//EXISTE
		/*
		Cliente cliente = new Cliente("Lula");
		if (clienteBO.existe(cliente))
			System.out.println("Cliente Encontrado");
		else
			System.out.println("Nao Encontrado"); */
		
		// MOSTRA TODOS
		/*List<Cliente> lista = new ArrayList<Cliente>();
		lista = clienteBO.pesquisarTodos();	
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}*/ 
		/*Cliente cliente = new Cliente(3);
		cliente = clienteBO.procurarPorCodigo(cliente);
		System.out.println(cliente);*/
		
		/*Cliente cliente = new Cliente("Mateus");
		cliente = clienteBO.procurarPorNome(cliente);
		System.out.println(cliente);*/
		
		
	}
}