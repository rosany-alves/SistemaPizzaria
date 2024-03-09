package dao;

import connection.Conexao;
import model.EntregadorModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;

public class EntregadorDAO {

    private Connection con = null;

    public EntregadorDAO() {
        con = new Conexao().getConnection();
    }

    public void cadastrarEntregador(EntregadorModel obj) {
        try {
            String sql = "INSERT INTO entregador (codigo_entg, nome_entg, celular_entg, data_entg) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCelular());
            stmt.setString(4, obj.getData());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarEntregador(EntregadorModel obj) {
         try {
            String sql = "update entregador set codigo_entg = ?, nome_entg = ?, celular_entg = ?, data_entg = ? where codigo_entg = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCelular());
            stmt.setString(4, obj.getData());

            stmt.setInt(5, obj.getCodigo());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sql: " + e.getMessage());
        }
    }

    public void excluirEntregador(EntregadorModel obj) {
        try {
            String sql = "DELETE FROM entregador WHERE codigo_entg = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<EntregadorModel> listarEntregadors() {
        try {
            List<EntregadorModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM entregador";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                EntregadorModel obj = new EntregadorModel();
                obj.setCodigo(rs.getInt("codigo_entg"));
                obj.setNome(rs.getString("nome_entg"));
                obj.setCelular(rs.getString("celular_entg")); 
                obj.setData(rs.getString("data_entg")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos entregadors " + e.getMessage());
            return null;
        }
    }
    //Buscar pelo código
     public EntregadorModel consultaPorCodigo(int cod){
        try {
            String sql = "SELECT * FROM entregador where codigo_entg = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            EntregadorModel obj = new EntregadorModel();
            
            if(rs.next()){
                
                obj.setCodigo(rs.getInt("codigo_entg"));
                obj.setNome(rs.getString("nome_entg"));
                obj.setCelular(rs.getString("Celular_entg")); 
                obj.setData(rs.getString("Data_entg")); 
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
    
    // Buscar pelo nome
    public List<EntregadorModel> buscaEntregadorNome(String nome) {
        try {
            List<EntregadorModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM entregador where nome_entg like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                EntregadorModel obj = new EntregadorModel();
                obj.setCodigo(rs.getInt("codigo_entg"));
                obj.setNome(rs.getString("nome_entg"));
                obj.setCelular(rs.getString("celular_entg")); 
                obj.setData(rs.getString("data_entg")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos entregadors " + e.getMessage());
            return null;
        }
    }
}

