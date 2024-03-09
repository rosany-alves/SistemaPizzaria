package dao;

import connection.Conexao;
import model.FuncionarioModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.WebServiceCep;
import view.TelaLogin;
import view.TelaPrincipal;

public class FuncionarioDAO {

    private Connection con = null;

    public FuncionarioDAO() {
        con = new Conexao().getConnection();
    }

    public void cadastrarFuncionario(FuncionarioModel obj) {
        try {
            String sql = "INSERT INTO funcionario (codigo_func,nome_func,nascimento_func,sexo_func,rg_func,cor_func,cpf_func,email_func,endereco_func,numero_func,rua_func,cep_func,cidade_func,bairro_func,uf_func,naturalidade_func,telefone_func,celular_func,especial_func,especificar_func,pai_func,mae_func,cargo_func,data_func, senha_func)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getNascimento());
            stmt.setString(4, obj.getSexo());
            stmt.setString(5, obj.getRg());
            stmt.setString(6, obj.getCor());
            stmt.setString(7, obj.getCpf());
            stmt.setString(8, obj.getEmail());
            stmt.setString(9, obj.getEndereco());
            stmt.setInt(10, obj.getNumero());
            stmt.setString(11, obj.getRua());
            stmt.setString(12, obj.getCep());
            stmt.setString(13, obj.getCidade());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getUf());
            stmt.setString(16, obj.getNaturalidade());
            stmt.setString(17, obj.getTelefone());
            stmt.setString(18, obj.getCelular());
            stmt.setString(19, obj.getEspecial());
            stmt.setString(20, obj.getEspecificar());
            stmt.setString(21, obj.getPai());
            stmt.setString(22, obj.getMae());
            stmt.setString(23, obj.getCargo());
            stmt.setString(24, obj.getData());
            stmt.setString(25, obj.getSenha());
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public void atualizarFuncionario(FuncionarioModel obj) {
         try {
            String sql = "update funcionario set codigo_func = ?, nome_func = ?, nascimento_func = ? , sexo_func = ?, rg_func = ?, cor_func = ?, cpf_func = ?, email_func = ?, endereco_func = ?, numero_func = ?, rua_func = ?, cep_func = ?, cidade_func = ?, bairro_func = ?, uf_func = ?, naturalidade_func = ?, telefone_func = ?, celular_func = ?, especial_func = ?, especificar_func = ?, pai_func = ?, mae_func = ?, cargo_func = ?, data_func = ?, senha_func = ? where codigo_func = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            stmt.setString(2, obj.getNome());
            stmt.setString(3, obj.getNascimento());
            stmt.setString(4, obj.getSexo());
            stmt.setString(5, obj.getRg());
            stmt.setString(6, obj.getCor());
            stmt.setString(7, obj.getCpf());
            stmt.setString(8, obj.getEmail());
            stmt.setString(9, obj.getEndereco());
            stmt.setInt(10, obj.getNumero());
            stmt.setString(11, obj.getRua());
            stmt.setString(12, obj.getCep());
            stmt.setString(13, obj.getCidade());
            stmt.setString(14, obj.getBairro());
            stmt.setString(15, obj.getUf());
            stmt.setString(16, obj.getNaturalidade());
            stmt.setString(17, obj.getTelefone());
            stmt.setString(18, obj.getCelular());
            stmt.setString(19, obj.getEspecial());
            stmt.setString(20, obj.getEspecificar());
            stmt.setString(21, obj.getPai());
            stmt.setString(22, obj.getMae());
            stmt.setString(23, obj.getCargo());
            stmt.setString(24, obj.getData());
            stmt.setString(25, obj.getSenha());

            stmt.setInt(26, obj.getCodigo());
            
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro de sql: " + e.getMessage());
        }
    }

    public void excluirFuncionario(FuncionarioModel obj) {
        try {
            String sql = "DELETE FROM funcionario WHERE codigo_func = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, obj.getCodigo());
            
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    public List<FuncionarioModel> listarFuncionario() {
        try {
            List<FuncionarioModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM funcionario";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                FuncionarioModel obj = new FuncionarioModel();
                obj.setCodigo(rs.getInt("codigo_func"));
                obj.setNome(rs.getString("nome_func"));
                obj.setNascimento(rs.getString("nascimento_func"));
                obj.setSexo(rs.getString("sexo_func"));
                obj.setRg(rs.getString("rg_func"));
                obj.setCor(rs.getString("cor_func"));
                obj.setCpf(rs.getString("cpf_func"));                
                obj.setEmail(rs.getString("email_func"));
                obj.setEndereco(rs.getString("endereco_func"));
                obj.setNumero(rs.getInt("numero_func"));
                obj.setRua(rs.getString("rua_func")); 
                obj.setCep(rs.getString("cep_func"));
                obj.setCidade(rs.getString("cidade_func")); 
                obj.setBairro(rs.getString("bairro_func"));
                obj.setUf(rs.getString("uf_func"));
                obj.setNaturalidade(rs.getString("naturalidade_func"));
                obj.setTelefone(rs.getString("telefone_func"));
                obj.setCelular(rs.getString("celular_func"));
                obj.setEspecial(rs.getString("especial_func"));
                obj.setEspecificar(rs.getString("especificar_func"));
                obj.setPai(rs.getString("pai_func"));
                obj.setMae(rs.getString("mae_func"));
                obj.setCargo(rs.getString("cargo_func"));
                obj.setData(rs.getString("data_func"));
                obj.setSenha(rs.getString("senha_func"));
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos funcionarios " + e.getMessage());
            return null;
        }
    }
    //Buscar pelo codigo
    
     public FuncionarioModel consultaPorCodigo(int cod){
        try {
            String sql = "SELECT * FROM funcionario where codigo_func = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cod);
            ResultSet rs = stmt.executeQuery();
            
            rs = stmt.executeQuery();
            FuncionarioModel obj = new FuncionarioModel();
            
            if(rs.next()){
                
                obj.setCodigo(rs.getInt("codigo_func"));
                obj.setNome(rs.getString("nome_func"));
                obj.setNascimento(rs.getString("nascimento_func"));
                obj.setSexo(rs.getString("sexo_func"));
                obj.setRg(rs.getString("rg_func"));
                obj.setCor(rs.getString("cor_func"));
                obj.setCpf(rs.getString("cpf_func"));                
                obj.setEmail(rs.getString("email_func"));
                obj.setEndereco(rs.getString("endereco_func"));
                obj.setNumero(rs.getInt("numero_func"));
                obj.setRua(rs.getString("rua_func")); 
                obj.setCep(rs.getString("cep_func"));
                obj.setCidade(rs.getString("cidade_func")); 
                obj.setBairro(rs.getString("bairro_func"));
                obj.setUf(rs.getString("uf_func"));
                obj.setNaturalidade(rs.getString("naturalidade_func"));
                obj.setTelefone(rs.getString("telefone_func"));
                obj.setCelular(rs.getString("celular_func"));
                obj.setEspecial(rs.getString("especial_func"));
                obj.setEspecificar(rs.getString("especificar_func"));
                obj.setPai(rs.getString("pai_func"));
                obj.setMae(rs.getString("mae_func"));
                obj.setCargo(rs.getString("cargo_func"));
                obj.setData(rs.getString("data_func"));
                obj.setSenha(rs.getString("senha_func"));
            return obj;    
            } 
   
            
        }catch (SQLException e) {
           JOptionPane.showMessageDialog(null, "Erro ao pesquisar código " + e.getMessage());
        } return null;
    }
            
    
    // Buscar pelo nome
    public List<FuncionarioModel> buscaFuncionarioNome(String nome_func) {
        try {
            List<FuncionarioModel> lista = new ArrayList<>();
            String sql = "SELECT * FROM funcionario where nome_func like ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nome_func);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                FuncionarioModel obj = new FuncionarioModel();
                obj.setCodigo(rs.getInt("codigo_func"));
                obj.setNome(rs.getString("nome_func"));
                obj.setNascimento(rs.getString("nascimento_func"));
                obj.setSexo(rs.getString("sexo_func"));
                obj.setRg(rs.getString("rg_func"));
                obj.setCor(rs.getString("cor_func"));
                obj.setCpf(rs.getString("cpf_func"));                
                obj.setEmail(rs.getString("email_func"));
                obj.setEndereco(rs.getString("endereco_func"));
                obj.setNumero(rs.getInt("numero_func"));
                obj.setRua(rs.getString("rua_func")); 
                obj.setCep(rs.getString("cep_func"));
                obj.setCidade(rs.getString("cidade_func")); 
                obj.setBairro(rs.getString("bairro_func"));
                obj.setUf(rs.getString("uf_func"));
                obj.setNaturalidade(rs.getString("naturalidade_func"));
                obj.setTelefone(rs.getString("telefone_func"));
                obj.setCelular(rs.getString("celular_func"));
                obj.setEspecial(rs.getString("especial_func"));
                obj.setEspecificar(rs.getString("especificar_func"));
                obj.setPai(rs.getString("pai_func"));
                obj.setMae(rs.getString("mae_func"));
                obj.setCargo(rs.getString("cargo_func"));
                obj.setData(rs.getString("data_func"));
                obj.setSenha(rs.getString("senha_func"));
                lista.add(obj);
            }

            rs.close();
            stmt.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar os dados dos funcionarios " + e.getMessage());
            return null;
        }
    
    }
     public FuncionarioModel buscaCep(String cep) {
       
        WebServiceCep webServiceCep = WebServiceCep.searchCep(cep);
       

        FuncionarioModel obj = new FuncionarioModel();

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
 //login
     public void efetuaLogin(String email, String senha){
         try{
             String sql = "select email_func, senha_func, nome_func from funcionario where"
                     + " email_func = ? and senha_func = ?";
             PreparedStatement stmt = con.prepareStatement(sql);
             stmt.setString(1, email);
             stmt.setString(2, senha);
             
              ResultSet rs = stmt.executeQuery();
             
             if(rs.next()){
                 JOptionPane.showMessageDialog(null, "Usuário logado com sucesso!");
                 TelaPrincipal tela = new TelaPrincipal();
                 tela.usuario = rs.getString("nome_func");
                 tela.setVisible(true);
                 TelaLogin login = new TelaLogin();
                 login.dispose();
                 
             }else{
                 JOptionPane.showMessageDialog(null, "Erro! Senha ou email inválidos!");
             }
                     
         }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de SQL!"+e); 
         }
     }
}