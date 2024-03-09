package connection;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class TestaConexao {
    public static void main(String[] args) {
        try{
            new Conexao().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch (HeadlessException e){
           
                        JOptionPane.showMessageDialog(null, "Erro.");
        }
    } 
}
