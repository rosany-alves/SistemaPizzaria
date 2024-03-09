package dao;

import connection.Conexao;
import model.ClienteModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;

public class ClienteDAO {

    private Connection con = null;

    public ClienteDAO() {
        con = new Conexao().getConnection();
    }

    public void cadastrarCliente(ClienteModel obj) {
        try {
            String sql = "INSERT INTO cliente (codigo_cli, nome_cli, cpf_cli, email_cli, endereco_cli, numero_cli, rua_cli, cep_cli, bairro_cli, cidade_cli, uf_cli, telefone_cli, celular_cli, data_cli) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getEndereco());
            stmt.setInt(6, obj.getNumero());
            stmt.setString(7, obj.getRua());
            stmt.setString(8, obj.getCep());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getUf());
            stmt.setString(12, obj.getTelefone());
            stmt.setString(13, obj.getCelular());
            stmt.setString(14, obj.getData());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarCliente(ClienteModel obj) {
         try {
            String sql = "update cliente set codigo_cli = ?, nome_cli = ?, cpf_cli = ? , email_cli = ?, endereco_cli = ?, numero_cli = ?, rua_cli = ?, cep_cli = ?, bairro_cli = ?, cidade_cli = ?, uf_cli = ?, telefone_cli = ?, celular_cli = ?, data_cli = ? where codigo_cli = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getCpf());
            stmt.setString(4, obj.getEmail());
            stmt.setString(5, obj.getEndereco());
            stmt.setInt(6, obj.getNumero());
            stmt.setString(7, obj.getRua());
            stmt.setString(8, obj.getCep());
            stmt.setString(9, obj.getBairro());
            stmt.setString(10, obj.getCidade());
            stmt.setString(11, obj.getUf());
            stmt.setString(12, obj.getTelefone());
            stmt.setString(13, obj.getCelular());
            stmt.setString(14, obj.getData());

            stmt.setInt(15, obj.getCodigo());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sql: " + e.getMessage());
        }
    }

    public void excluirCliente(ClienteModel obj) {
        try {
            String sql = "DELETE FROM cliente WHERE codigo_cli = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<ClienteModel> listarClientes() {
        try {
            List<ClienteModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM cliente";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ClienteModel obj = new ClienteModel();
                obj.setCodigo(rs.getInt("codigo_cli"));
                obj.setNome(rs.getString("nome_cli"));
                obj.setCpf(rs.getString("cpf_cli"));
                obj.setEmail(rs.getString("email_cli"));
                obj.setEndereco(rs.getString("endereco_cli"));
                obj.setNumero(rs.getInt("numero_cli"));
                obj.setRua(rs.getString("rua_cli"));                
                obj.setCep(rs.getString("cep_cli"));
                obj.setBairro(rs.getString("bairro_cli"));
                obj.setCidade(rs.getString("cidade_cli"));
                obj.setUf(rs.getString("uf_cli")); 
                obj.setTelefone(rs.getString("telefone_cli"));
                obj.setCelular(rs.getString("celular_cli")); 
                obj.setData(rs.getString("data_cli")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos clientes " + e.getMessage());
            return null;
        }
    }
    //Buscar pelo código
     public ClienteModel consultaPorCodigo(int cod){
        try {
            String sql = "SELECT * FROM cliente where codigo_cli = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            ClienteModel obj = new ClienteModel();
            
            if(rs.next()){
                
                obj.setCodigo(rs.getInt("codigo_cli"));
                obj.setNome(rs.getString("nome_cli"));
                obj.setCpf(rs.getString("cpf_cli"));
                obj.setEmail(rs.getString("email_cli"));
                obj.setEndereco(rs.getString("endereco_cli"));
                obj.setNumero(rs.getInt("numero_cli"));
                obj.setRua(rs.getString("rua_cli"));                
                obj.setCep(rs.getString("cep_cli"));
                obj.setBairro(rs.getString("bairro_cli"));
                obj.setCidade(rs.getString("cidade_cli"));
                obj.setUf(rs.getString("uf_cli")); 
                obj.setTelefone(rs.getString("telefone_cli"));
                obj.setCelular(rs.getString("Celular_cli")); 
                obj.setData(rs.getString("Data_cli")); 
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
    
    // Buscar pelo nome
    public List<ClienteModel> buscaClienteNome(String nome) {
        try {
            List<ClienteModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM cliente where nome_cli like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                ClienteModel obj = new ClienteModel();
                obj.setCodigo(rs.getInt("codigo_cli"));
                obj.setNome(rs.getString("nome_cli"));
                obj.setCpf(rs.getString("cpf_cli"));
                obj.setEmail(rs.getString("email_cli"));
                obj.setEndereco(rs.getString("email_cli"));
                obj.setNumero(rs.getInt("numero_cli"));
                obj.setRua(rs.getString("rua_cli"));                
                obj.setCep(rs.getString("cep_cli"));
                obj.setBairro(rs.getString("bairro_cli"));
                obj.setCidade(rs.getString("cidade_cli"));
                obj.setUf(rs.getString("uf_cli")); 
                obj.setTelefone(rs.getString("telefone_cli"));
                obj.setCelular(rs.getString("celular_cli")); 
                obj.setData(rs.getString("data_cli")); 
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos clientes " + e.getMessage());
            return null;
        }
    }
    
     public ClienteModel buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        ClienteModel obj = new ClienteModel();

        if (webServiceCep.wasSuccessful()) {
            obj.setEndereco(webServiceCep.getLogradouroFull());
            obj.setCidade(webServiceCep.getCidade());
            obj.setBairro(webServiceCep.getBairro());
            obj.setUf(webServiceCep.getUf());
            
            return obj;
        } else {
            JOptionPane.showMessageDialog(null, "Erro numero: " + webServiceCep.getResulCode());
            JOptionPane.showMessageDialog(null, "Descrição do erro: " + webServiceCep.getResultText());
            return null;
        }

    }
   

}

