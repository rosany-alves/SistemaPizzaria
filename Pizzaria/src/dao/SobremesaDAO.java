package dao;

import connection.Conexao;
import model.SobremesaModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;

public class SobremesaDAO {

    private Connection con = null;

    public SobremesaDAO() {
        con = new Conexao().getConnection();
    }

    public void cadastrarSobremesa(SobremesaModel obj) {
        try {
            String sql = "INSERT INTO sobremesa (codigo_sbm, nome_sbm, sabor_sbm, qtd_sbm, preco_sbm) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getSabor());
            stmt.setString(4, obj.getQtd());
            stmt.setString(5, obj.getPreco());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarSobremesa(SobremesaModel obj) {
         try {
            String sql = "update sobremesa set codigo_sbm = ?, nome_sbm = ?, sabor_sbm = ?, "
                    + "qtd_sbm = ?, preco_sbm = ? where codigo_sbm = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getSabor());
            stmt.setString(4, obj.getQtd());
            stmt.setString(5, obj.getPreco());

            stmt.setInt(6, obj.getCodigo());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sql: " + e.getMessage());
        }
    }

    public void excluirSobremesa(SobremesaModel obj) {
        try {
            String sql = "DELETE FROM sobremesa WHERE codigo_sbm = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<SobremesaModel> listarSobremesas() {
        try {
            List<SobremesaModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM sobremesa";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                SobremesaModel obj = new SobremesaModel();
                obj.setCodigo(rs.getInt("codigo_sbm"));
                obj.setNome(rs.getString("nome_sbm"));
                obj.setSabor(rs.getString("sabor_sbm")); 
                obj.setQtd(rs.getString("qtd_sbm")); 
                obj.setPreco(rs.getString("preco_sbm")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos sobremesas " + e.getMessage());
            return null;
        }
    }
    //Buscar pelo código
     public SobremesaModel consultaPorCodigo(int cod){
        try {
            String sql = "SELECT * FROM sobremesa where codigo_sbm = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            SobremesaModel obj = new SobremesaModel();
            
            if(rs.next()){
                
                obj.setCodigo(rs.getInt("codigo_sbm"));
                obj.setNome(rs.getString("nome_sbm"));
                obj.setSabor(rs.getString("sabor_sbm")); 
                obj.setQtd(rs.getString("qtd_sbm")); 
                obj.setPreco(rs.getString("preco_sbm")); 
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
    
    // Buscar pelo nome
    public List<SobremesaModel> buscaSobremesaNome(String nome) {
        try {
            List<SobremesaModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM sobremesa where nome_sbm like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                SobremesaModel obj = new SobremesaModel();
                obj.setCodigo(rs.getInt("codigo_sbm"));
                obj.setNome(rs.getString("nome_sbm"));
                obj.setSabor(rs.getString("sabor_sbm")); 
                obj.setQtd(rs.getString("qtd_sbm")); 
                obj.setPreco(rs.getString("preco_sbm")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos sobremesas " + e.getMessage());
            return null;
        }
    }
}

