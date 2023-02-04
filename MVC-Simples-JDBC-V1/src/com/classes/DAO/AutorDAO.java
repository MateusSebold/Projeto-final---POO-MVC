package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Autor;



public class AutorDAO {

	final String NOMEDATABELA = "autor";
    public boolean inserir(Autor autor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (cpf_autor,nome_autor) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, autor.getCpf());
            ps.setString(2, autor.getNome());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Autor autor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET cpf_autor = ?, nome_autor = ? WHERE code_autor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, autor.getCpf());
            ps.setString(2, autor.getNome());
            ps.setInt(3, autor.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Autor autor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE code_autor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, autor.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean existe(Autor autor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_autor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, autor.getNome());
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
    public Autor procurarPorCodigo(Autor autor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE code_autor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, autor.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Autor clie = new Autor();
                clie.setCodigo(rs.getInt(1));
                clie.setCpf(rs.getInt(2));
                clie.setNome(rs.getString(3));
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
    public Autor procurarPorNome(Autor autor) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_autor = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, autor.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
            	Autor clie = new Autor();
                clie.setCodigo(rs.getInt(1));
                clie.setCpf(rs.getInt(2));
                clie.setNome(rs.getString(3));
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
    public List<Autor> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Autor> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Autor> montarLista(ResultSet rs) {
        List<Autor> listObj = new ArrayList<Autor>();
        try {
            while (rs.next()) {
                Autor obj = new Autor();
                obj.setCodigo(rs.getInt(1));
                obj.setCpf(rs.getInt(2));
                obj.setNome(rs.getString(3));
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