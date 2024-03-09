package dao;

import connection.Conexao;
import model.PedidoModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;

public class PedidoDAO {

    private Connection con = null;

    public PedidoDAO() {
        con = new Conexao().getConnection();
    }

    public void cadastrarPedido(PedidoModel obj) {
        try {
            String sql = "INSERT INTO pedido (cod_pd, nome_pd, ingrediente_pd, tamanho_pd, preco_pd) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getIngrediente());
            stmt.setString(4, obj.getTamanho());
            stmt.setString(5, obj.getPreco());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarPedido(PedidoModel obj) {
         try {
            String sql = "update pedido set cod_pd = ?, nome_pd = ?, ingrediente_pd = ?, tamanho_pd = ?, preco_pd = ? where cod_pd = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getIngrediente());
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

    public void excluirPedido(PedidoModel obj) {
        try {
            String sql = "DELETE FROM pedido WHERE cod_pd = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<PedidoModel> listarPedidos() {
        try {
            List<PedidoModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM Pedido";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                PedidoModel obj = new PedidoModel();
                obj.setCodigo(rs.getInt("cod_pd"));
                obj.setNome(rs.getString("nome_pd"));
                obj.setIngrediente(rs.getString("ingrediente_pd")); 
                obj.setTamanho(rs.getString("tamanho_pd")); 
                obj.setPreco(rs.getString("preco_pd")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos pedidos " + e.getMessage());
            return null;
        }
    }
    //Buscar pelo código
     public PedidoModel consultaPorCodigo(int cod){
        try {
            String sql = "SELECT * FROM pedido where cod_pd = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            PedidoModel obj = new PedidoModel();
            
            if(rs.next()){
                
                obj.setCodigo(rs.getInt("cod_pd"));
                obj.setNome(rs.getString("nome_pd"));
                obj.setIngrediente(rs.getString("ingrediente_pd")); 
                obj.setTamanho(rs.getString("tamanho_pd")); 
                obj.setPreco(rs.getString("preco_pd")); 
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
    
    // Buscar pelo nome
    public List<PedidoModel> buscaPedidoNome(String nome) {
        try {
            List<PedidoModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM pedido where nome_pd like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                PedidoModel obj = new PedidoModel();
                obj.setCodigo(rs.getInt("cod_pd"));
                obj.setNome(rs.getString("nome_pd"));
                obj.setIngrediente(rs.getString("ingrediente_pd")); 
                obj.setTamanho(rs.getString("tamanho_pd")); 
                obj.setPreco(rs.getString("preco_pd")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos pedidos " + e.getMessage());
            return null;
        }
    }
}

