package com.classes.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.classes.Conexao.Conexao;
import com.classes.DTO.Emprestimo;

public class EmprestimoDAO {
	final String NOMEDATABELA = "emprestimo";
	public boolean inserir(Emprestimo emprestimo) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "INSERT INTO " + NOMEDATABELA + " (data_emprestimo,dt_devolucao,code_livro,code_cliente) VALUES (?,?,?,?);";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, emprestimo.getDataEmprestimo());
        	ps.setString(2, emprestimo.getDataDevolucao());
        	ps.setInt(3, emprestimo.getLivro());
        	ps.setInt(4, emprestimo.getCliente());
        	ps.executeUpdate();
        	ps.close();
        	conn.close();
        	return true;
    	} catch (Exception e) {
        	e.printStackTrace();
        	return false;
    	}
	}
	public boolean alterar(Emprestimo emprestimo) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "UPDATE " + NOMEDATABELA + " SET data_emprestimo = ?, dt_devolucao = ?,code_livro = ?,code_cliente =? WHERE code_emprestimo = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, emprestimo.getDataEmprestimo());
        	ps.setString(2, emprestimo.getDataDevolucao());
        	ps.setInt(3, emprestimo.getLivro());
        	ps.setInt(4, emprestimo.getCliente());
        	ps.setInt(5, emprestimo.getCodigo());
        	ps.executeUpdate();
        	ps.close();
        	conn.close();
        	return true;
    	} catch (Exception e) {
   		  e.printStackTrace();
         	return false;
    	}
	}
	public boolean excluir(Emprestimo emprestimo) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "DELETE FROM " + NOMEDATABELA + " WHERE code_emprestimo = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setInt(1, emprestimo.getCodigo());
        	ps.executeUpdate();
        	ps.close();
        	conn.close();
        	return true;
    	} catch (Exception e) {
   		  e.printStackTrace();
         	return false;
    	}
	}
    
	public boolean existe(Emprestimo emprestimo) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE data_emprestimo = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, emprestimo.getDataEmprestimo());
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
	public Emprestimo procurarPorCodigo(Emprestimo emprestimo) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE code_emprestimo = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setInt(1, emprestimo.getCodigo());
        	ResultSet rs = ps.executeQuery();
        	if (rs.next()) {
       		 Emprestimo clie = new Emprestimo();
            	clie.setCodigo(rs.getInt(1));
            	clie.setDataEmprestimo(rs.getString(2));
            	clie.setDataDevolucao(rs.getString(3));
            	clie.setLivro(rs.getInt(4));
            	clie.setCliente(rs.getInt(5));
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
	public Emprestimo procurarPorDataEmprestimo(Emprestimo emprestimo) {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_emprestimo = ?;";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ps.setString(1, emprestimo.getDataEmprestimo());
        	ResultSet rs = ps.executeQuery();
        	if (rs.next()) {
       		 Emprestimo clie = new Emprestimo();
            	clie.setCodigo(rs.getInt(1));
            	clie.setDataEmprestimo(rs.getString(2));
            	clie.setDataDevolucao(rs.getString(3));
            	clie.setLivro(rs.getInt(4));
            	clie.setCliente(rs.getInt(5));
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
	public List<Emprestimo> pesquisarTodos() {
    	try {
        	Connection conn = Conexao.conectar();
        	String sql = "SELECT * FROM " + NOMEDATABELA + ";";
        	PreparedStatement ps = conn.prepareStatement(sql);
        	ResultSet rs = ps.executeQuery();
        	List<Emprestimo> listObj = montarLista(rs);
        	return listObj;
    	} catch (Exception e) {
        	//System.err.println("Erro: " + e.toString());
        	//e.printStackTrace();
        	return null;
    	}
	}
	public List<Emprestimo> montarLista(ResultSet rs) {
    	List<Emprestimo> listObj = new ArrayList<Emprestimo>();
    	try {
        	while (rs.next()) {
            	Emprestimo obj = new Emprestimo();
            	obj.setCodigo(rs.getInt(1));
            	obj.setDataEmprestimo(rs.getString(2));
            	obj.setDataDevolucao(rs.getString(3));
            	obj.setLivro(rs.getInt(4));
            	obj.setCliente(rs.getInt(5));
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


