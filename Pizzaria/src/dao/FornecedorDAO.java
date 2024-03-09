package dao;

import connection.Conexao;
import model.FornecedorModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;


public class FornecedorDAO {
   
    private Connection con = null;

    public FornecedorDAO() {
        this.con = new Conexao().getConnection();
    }

    public void cadastrarFornecedor(FornecedorModel obj) {
        try {
            String sql = "INSERT INTO Fornecedor (nome_fr, cnpj_fr, telefone_fr, celular_fr, cep_fr, endereco_fr, numero_fr, complemento_fr,bairro_fr, cidade_fr, estado_fr) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getEndereco());
            stmt.setInt(7, obj.getNumero());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getEstado());//ctrl+shift+seta p/baixo é replicado
 
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarFornecedor(FornecedorModel obj) {
         try {
            String sql = "update Fornecedor set nome = ?, cnpj = ?, telefone = ?, celular = ?, cep = ?, endereco = ?,"
                    + "numero = ?, complemento = ?, bairro = ?, cidade = ?, estado = ? where id = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
         
            stmt.setString(1, obj.getNome());
            stmt.setString(2, obj.getCnpj());
            stmt.setString(3, obj.getTelefone());
            stmt.setString(4, obj.getCelular());
            stmt.setString(5, obj.getCep());
            stmt.setString(6, obj.getEndereco());
            stmt.setInt(7, obj.getNumero());
            stmt.setString(8, obj.getComplemento());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getEstado());//ctrl+shift+seta p/baixo é replicado
            stmt.setInt(12, obj.getId());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void excluirFornecedor(FornecedorModel obj) {
        try {
            String sql = "DELETE FROM Fornecedor WHERE id_fr = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<FornecedorModel> listarFornecedor() {
        try {
            List<FornecedorModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM Fornecedor";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                FornecedorModel obj = new FornecedorModel();
                obj.setId(rs.getInt("id_fr"));
                obj.setNome(rs.getString("nome_fr"));
                obj.setCnpj(rs.getString("cnpj_fr"));
                obj.setTelefone(rs.getString("telefone_fr")); 
                obj.setCelular(rs.getString("celular_fr"));
                obj.setCep(rs.getString("cep_fr"));
                obj.setEndereco(rs.getString("endereco_fr"));
                obj.setNumero(rs.getInt("numero_fr"));
                obj.setComplemento(rs.getString("complemento_fr"));
                obj.setBairro(rs.getString("bairro_fr"));                
                obj.setCidade(rs.getString("cidade_fr"));
                obj.setEstado(rs.getString("estado_fr"));
               
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos fornecedors " + e.getMessage());
            return null;
        }
    }
    
    public FornecedorModel consultaPorCodigo(int id){
        try {
            String sql = "SELECT * FROM fornecedor where id = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            FornecedorModel obj = new FornecedorModel();
            
            if(rs.next()){
                obj.setId(rs.getInt("id_fr"));
                obj.setNome(rs.getString("nome_fr"));
                obj.setCnpj(rs.getString("cnpj_fr"));
                obj.setTelefone(rs.getString("telefone_fr")); 
                obj.setCelular(rs.getString("celular_fr"));
                obj.setCep(rs.getString("cep_fr"));
                obj.setEndereco(rs.getString("endereco_fr"));
                obj.setNumero(rs.getInt("numero_fr"));
                obj.setComplemento(rs.getString("complemento_fr"));
                obj.setBairro(rs.getString("bairro_fr"));                
                obj.setCidade(rs.getString("cidade_fr"));
                obj.setEstado(rs.getString("estado_fr"));
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
            
    // Buscar pelo nome
    public List<FornecedorModel> buscaFornecedorNome(String nome) {
        try {
            List<FornecedorModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM Fornecedor where nome_fr like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                FornecedorModel obj = new FornecedorModel();
                obj.setId(rs.getInt("id_fr"));
                obj.setNome(rs.getString("nome_fr"));
                obj.setCnpj(rs.getString("cnpj_fr"));
                obj.setTelefone(rs.getString("telefone_fr")); 
                obj.setCelular(rs.getString("celular_fr"));
                obj.setCep(rs.getString("cep_fr"));
                obj.setEndereco(rs.getString("endereco_fr"));
                obj.setNumero(rs.getInt("numero_fr"));
                obj.setComplemento(rs.getString("complemento_fr"));
                obj.setBairro(rs.getString("bairro_fr"));                
                obj.setCidade(rs.getString("cidade_fr"));
                obj.setEstado(rs.getString("estado_fr"));
               
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos fornecedors " + e.getMessage());
            return null;
        }
    }
   
     public FornecedorModel buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        FornecedorModel obj = new FornecedorModel();

        if (webServiceCep.wasSuccessful()) {
            obj.setComplemento(webServiceCep.getLogradouroFull());
            obj.setCidade(webServiceCep.getCidade());
            obj.setBairro(webServiceCep.getBairro());
            obj.setEstado(webServiceCep.getUf());
            return obj;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
}

