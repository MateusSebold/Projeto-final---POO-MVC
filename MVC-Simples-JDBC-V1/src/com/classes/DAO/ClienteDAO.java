package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.Conexao;
import com.classes.DTO.Cliente;



public class ClienteDAO {

	final String NOMEDATABELA = "cliente";
    public boolean inserir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "INSERT INTO " + NOMEDATABELA + " (cpf_cliente,nome_cliente) VALUES (?,?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean alterar(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "UPDATE " + NOMEDATABELA + " SET cpf_cliente = ?, nome_cliente = ? WHERE code_cliente = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCpf());
            ps.setString(2, cliente.getNome());
            ps.setInt(3,cliente.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    public boolean excluir(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE code_cliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (Exception e) {
        	 e.printStackTrace();
             return false;
        }
    }
    
    public boolean existe(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_cliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
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
    
    public Cliente procurarPorCodigo(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE code_cliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente clie = new Cliente();
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
    public Cliente procurarPorNome(Cliente cliente) {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome_cliente = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Cliente clie = new Cliente();
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
    public List<Cliente> pesquisarTodos() {
        try {
            Connection conn = Conexao.conectar();
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Cliente> listObj = montarLista(rs);
            return listObj;
        } catch (Exception e) {
            //System.err.println("Erro: " + e.toString());
            //e.printStackTrace();
            return null;
        }
    }
    public List<Cliente> montarLista(ResultSet rs) {
        List<Cliente> listObj = new ArrayList<Cliente>();
        try {
            while (rs.next()) {
                Cliente obj = new Cliente();
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