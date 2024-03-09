package dao;

import connection.Conexao;
import model.PizzaModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;

public class PizzaDAO {

    private Connection con = null;

    public PizzaDAO() {
        con = new Conexao().getConnection();
    }

    public void cadastrarPizza(PizzaModel obj) {
        try {
            String sql = "INSERT INTO pizza (cod_pz, nome_pz, ingredientes_pz, tamanho_pz, preco_pz) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getIngredientes());
            stmt.setString(4, obj.getTamanho());
            stmt.setString(5, obj.getPreco());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarPizza(PizzaModel obj) {
         try {
            String sql = "update pizza set cod_pz = ?, nome_pz = ?, ingredientes_pz = ?, "
                    + "tamanho_pz = ?, preco_pz = ? where cod_pz = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getIngredientes());
            stmt.setString(4, obj.getTamanho());
            stmt.setString(5, obj.getPreco());

            stmt.setInt(6, obj.getCodigo());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sql: " + e.getMessage());
        }
    }

    public void excluirPizza(PizzaModel obj) {
        try {
            String sql = "DELETE FROM pizza WHERE cod_pz = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<PizzaModel> listarPizzas() {
        try {
            List<PizzaModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM pizza";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                PizzaModel obj = new PizzaModel();
                obj.setCodigo(rs.getInt("cod_pz"));
                obj.setNome(rs.getString("nome_pz"));
                obj.setIngredientes(rs.getString("Ingredientes_pz")); 
                obj.setTamanho(rs.getString("tamanho_pz")); 
                obj.setPreco(rs.getString("preco_pz")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos pizzas " + e.getMessage());
            return null;
        }
    }
    //Buscar pelo código
     public PizzaModel consultaPorCodigo(int cod){
        try {
            String sql = "SELECT * FROM pizza where cod_pz = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            PizzaModel obj = new PizzaModel();
            
            if(rs.next()){
                
                obj.setCodigo(rs.getInt("cod_pz"));
                obj.setNome(rs.getString("nome_pz"));
                obj.setIngredientes(rs.getString("ingredientes_pz")); 
                obj.setTamanho(rs.getString("tamanho_pz")); 
                obj.setPreco(rs.getString("preco_pz")); 
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
    
    // Buscar pelo nome
    public List<PizzaModel> buscaPizzaNome(String nome) {
        try {
            List<PizzaModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM pizza where nome_sbm like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                PizzaModel obj = new PizzaModel();
                obj.setCodigo(rs.getInt("cod_pz"));
                obj.setNome(rs.getString("nome_pz"));
                obj.setIngredientes(rs.getString("Ingredientes_pz")); 
                obj.setTamanho(rs.getString("tamanho_pz")); 
                obj.setPreco(rs.getString("preco_pz")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos pizzas " + e.getMessage());
            return null;
        }
    }
}

