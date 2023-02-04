package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Livro;

public class LivroDAO {
	final String NOMEDATABELA = "livro";
	public boolean inserir(Livro livro) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "INSERT INTO " + NOMEDATABELA + " (nome_livro,code_autor,descricao_livro,data_publicacao) VALUES (?,?,?,?);";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, livro.getNome());
        	ps.setInt(2, livro.getAutor());
        	ps.setString(3, livro.getDescricao());
        	ps.setString(4, livro.getPublicacao());
        	ps.executeUpdate();
        	ps.close();
        	conn.close();
        	return true;
    	} catch (Exception e) {
        	e.printStackTrace();
        	return false;
    	}
	}
	public boolean alterar(Livro livro) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "UPDATE " + NOMEDATABELA + " SET nome_livro = ?,code_autor = ?,descricao_livro = ?,data_publicacao = ?  WHERE code_livro = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, livro.getNome());
        	ps.setInt(2, livro.getAutor());
        	ps.setString(3, livro.getDescricao());
        	ps.setString(4, livro.getPublicacao());
        	ps.setInt(5, livro.getCodigo());
        	ps.executeUpdate();
        	ps.close();
        	conn.close();
        	return true;
    	} catch (Exception e) {
   		  e.printStackTrace();
         	return false;
    	}
	}
	public boolean excluir(Livro livro) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "DELETE FROM " + NOMEDATABELA + " WHERE code_livro = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setInt(1, livro.getCodigo());
        	ps.executeUpdate();
        	ps.close();
        	conn.close();
        	return true;
    	} catch (Exception e) {
   		  e.printStackTrace();
         	return false;
    	}
	}
    
	public boolean existe(Livro livro) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_livro = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, livro.getNome());
        	ResultSet rs = ps.executeQuery();
        	if (rs.next()) {
            	ps.close();
            	rs.close();
            	conn.close();
            	return true;
        	}
    	} catch (Exception e) {
        	//System.err.println("Erro: " + e.toString());
        	//e.printStackTrace();
        	return false;
    	}
    	return false;
	}
	public Livro procurarPorCodigo(Livro livro) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE code_livro = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setInt(1, livro.getCodigo());
        	ResultSet rs = ps.executeQuery();
        	if (rs.next()) {
       		 Livro clie = new Livro();
            	clie.setCodigo(rs.getInt(1));
            	clie.setNome(rs.getString(2));
            	clie.setAutor(rs.getInt(3));
            	clie.setDescricao(rs.getString(4));
            	clie.setPublicacao(rs.getString(5));
            	ps.close();
            	rs.close();
            	conn.close();
            	return clie;
        	} else {
            	ps.close();
            	rs.close();
            	conn.close();
            	return null;
        	}
    	} catch (Exception e) {
   		  e.printStackTrace();
         	return null;
    	}
	}
	public Livro procurarPorNome(Livro livro) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_livro = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, livro.getNome());
        	ResultSet rs = ps.executeQuery();
        	if (rs.next()) {
       		 Livro clie = new Livro();
	       		clie.setCodigo(rs.getInt(1));
	        	clie.setNome(rs.getString(2));
	        	clie.setAutor(rs.getInt(3));
	        	clie.setDescricao(rs.getString(4));
	        	clie.setPublicacao(rs.getString(5));
            	ps.close();
            	rs.close();
            	conn.close();
            	return clie;
        	} else {
            	ps.close();
            	rs.close();
            	conn.close();
            	return null;
        	}
    	} catch (Exception e) {
        	return null;
    	}
	}
	public List<Livro> pesquisarTodos() {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + ";";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ResultSet rs = ps.executeQuery();
        	List<Livro> listObj = montarLista(rs);
        	return listObj;
    	} catch (Exception e) {
        	//System.err.println("Erro: " + e.toString());
        	//e.printStackTrace();
        	return null;
    	}
	}
	public List<Livro> montarLista(ResultSet rs) {
    	List<Livro> listObj = new ArrayList<Livro>();
    	try {
        	while (rs.next()) {
       		 Livro obj = new Livro();
       		 	obj.setCodigo(rs.getInt(1));
       		 	obj.setNome(rs.getString(2));
       		 	obj.setAutor(rs.getInt(3));
       		 	obj.setDescricao(rs.getString(4));
       		 	obj.setPublicacao(rs.getString(5));
            	listObj.add(obj);
        	}
        	return listObj;
    	} catch (Exception e) {
        	//System.err.println("Erro: " + e.toString());
        	//e.printStackTrace();
        	return null;
    	}
	}

}
