/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.SobremesaDAO;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SobremesaModel;


import javax.swing.table.DefaultTableModel;
import model.Utilitarios;
/**
 *
 * @author Rosany
 */
public class TelaCadastroSobremesa extends javax.swing.JFrame {
    
    public void listar(){
        SobremesaDAO dao = new SobremesaDAO();
        List<SobremesaModel> lista = dao.listarSobremesas();
        DefaultTableModel dados = (DefaultTableModel)jTablePesquisar.getModel();
        dados.setNumRows(0) ;
        
        for(SobremesaModel c : lista){
            dados.addRow(new Object[]{
            c.getCodigo(),
            c.getNome(),
            c.getSabor(),
            c.getQtd(),
            c.getPreco()
            });
        }
        
    }

    /**
     * Creates new form TelaCadastroSobremesa
     */
    public TelaCadastroSobremesa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelCadastro = new javax.swing.JPanel();
        jButtonCadastrarSobremesa = new javax.swing.JButton();
        jButtonAtualizarSobremesa = new javax.swing.JButton();
        jButtonApagarSobremesa = new javax.swing.JButton();
        jButtonExcluirSobremesa = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jButtonPesquisarEntregador = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jTextFieldSabor = new javax.swing.JTextField();
        jTextFieldQtd = new javax.swing.JTextField();
        jTextFieldPreco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelNomePesquisar = new javax.swing.JLabel();
        jTextFieldPesquisarNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePesquisar = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonPesquisarSalvar = new javax.swing.JButton();
        jButtonPesquisarEditar = new javax.swing.JButton();
        jButtonExcluirFuncionario = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel13.setText("UF:");

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 153, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jButtonCadastrarSobremesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCadastrarSobremesa.setForeground(new java.awt.Color(0, 0, 153));
        jButtonCadastrarSobremesa.setText("SALVAR");
        jButtonCadastrarSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarSobremesaActionPerformed(evt);
            }
        });

        jButtonAtualizarSobremesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAtualizarSobremesa.setForeground(new java.awt.Color(0, 0, 153));
        jButtonAtualizarSobremesa.setText("ATUALIZAR");
        jButtonAtualizarSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarSobremesaActionPerformed(evt);
            }
        });

        jButtonApagarSobremesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonApagarSobremesa.setForeground(new java.awt.Color(0, 0, 153));
        jButtonApagarSobremesa.setText("APAGAR");
        jButtonApagarSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarSobremesaActionPerformed(evt);
            }
        });

        jButtonExcluirSobremesa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonExcluirSobremesa.setForeground(new java.awt.Color(0, 0, 153));
        jButtonExcluirSobremesa.setText("EXCLUIR");
        jButtonExcluirSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSobremesaActionPerformed(evt);
            }
        });

        jLabel56.setText("Código:");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabel57.setText("Nome:");

        jLabel63.setText("Quantidade:");

        jLabel54.setText("Sabor:");

        jButtonPesquisarEntregador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonPesquisarEntregador.setForeground(new java.awt.Color(0, 0, 153));
        jButtonPesquisarEntregador.setText("PESQUISAR");
        jButtonPesquisarEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarEntregadorActionPerformed(evt);
            }
        });

        jLabel55.setText("Preço");

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(jLabel56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPesquisarEntregador))
                    .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelCadastroLayout.createSequentialGroup()
                            .addComponent(jLabel55)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(304, 304, 304))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelCadastroLayout.createSequentialGroup()
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel54)
                                .addComponent(jLabel57))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldNome)
                                .addGroup(jPanelCadastroLayout.createSequentialGroup()
                                    .addComponent(jTextFieldSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel63)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldQtd)))))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButtonCadastrarSobremesa)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAtualizarSobremesa)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonApagarSobremesa)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExcluirSobremesa)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCadastroLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisarEntregador))
                .addGap(32, 32, 32)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel63)
                    .addComponent(jTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addGap(37, 37, 37)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarSobremesa)
                    .addComponent(jButtonAtualizarSobremesa)
                    .addComponent(jButtonApagarSobremesa)
                    .addComponent(jButtonExcluirSobremesa))
                .addContainerGap(286, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanelCadastro);

        jLabelNomePesquisar.setText("Nome:");

        jTextFieldPesquisarNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarNomeKeyPressed(evt);
            }
        });

        jTablePesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Sabor", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(jTablePesquisar);

        jButtonNovo.setText("Novo");

        jButtonPesquisarSalvar.setText("Salvar");

        jButtonPesquisarEditar.setText("Editar");
        jButtonPesquisarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarEditarActionPerformed(evt);
            }
        });

        jButtonExcluirFuncionario.setText("Excluir");
        jButtonExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirFuncionarioActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jButtonNovo)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisarSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisarEditar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluirFuncionario))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelNomePesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar)))
                        .addGap(0, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomePesquisar)
                    .addComponent(jTextFieldPesquisarNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonPesquisarSalvar)
                    .addComponent(jButtonPesquisarEditar)
                    .addComponent(jButtonExcluirFuncionario))
                .addGap(9, 9, 9))
        );

        jTabbedPane1.addTab("Pesquisar", jPanel2);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("CADASTRAR SOBREMESAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButtonCadastrarSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarSobremesaActionPerformed
        SobremesaModel obj = new SobremesaModel(); // TODO add your handling code here:
        obj.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
        obj.setNome(jTextFieldNome.getText());
        obj.setSabor(jTextFieldSabor.getText());
        obj.setQtd(jTextFieldQtd.getText());
        obj.setPreco(jTextFieldPreco.getText());
        SobremesaDAO dao = new SobremesaDAO();
        dao.cadastrarSobremesa(obj);
        
        new Utilitarios().LimpaTela(jPanelCadastro);
    }//GEN-LAST:event_jButtonCadastrarSobremesaActionPerformed

    private void jButtonAtualizarSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarSobremesaActionPerformed
        SobremesaModel obj = new SobremesaModel(); 
         obj.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
        obj.setNome(jTextFieldNome.getText());
        obj.setSabor(jTextFieldSabor.getText());
        obj.setQtd(jTextFieldQtd.getText());
        obj.setPreco(jTextFieldPreco.getText());
        SobremesaDAO dao = new SobremesaDAO();
        dao.atualizarSobremesa(obj);
        
        new Utilitarios().LimpaTela(jPanelCadastro);
    }//GEN-LAST:event_jButtonAtualizarSobremesaActionPerformed

    private void jButtonApagarSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarSobremesaActionPerformed
        new Utilitarios().LimpaTela(jPanelCadastro);
    }//GEN-LAST:event_jButtonApagarSobremesaActionPerformed

    private void jButtonExcluirSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSobremesaActionPerformed
        SobremesaModel obj = new SobremesaModel();
        obj.setCodigo(Integer.parseInt(jTextFieldCodigo.getText()));
        
        SobremesaDAO dao = new SobremesaDAO();
        dao.excluirSobremesa(obj);
         new Utilitarios().LimpaTela(jPanelCadastro);
    }//GEN-LAST:event_jButtonExcluirSobremesaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
        //events - window - WindowActivated
    }//GEN-LAST:event_formWindowActivated

    private void jButtonExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExcluirFuncionarioActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
       //jTabbedPane1.setSelectedIndex(0);
       jTextFieldCodigo.setText(jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(),0).toString());
       jTextFieldNome.setText(jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(),1).toString());
       jTextFieldSabor.setText(jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(),2).toString());
       jTextFieldQtd.setText(jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(),3).toString());
       jTextFieldPreco.setText(jTablePesquisar.getValueAt(jTablePesquisar.getSelectedRow(),4).toString());
       
// TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButtonPesquisarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarEditarActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPesquisarEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        String nome = "%"+jTextFieldPesquisarNome.getText()+"%";
        SobremesaDAO dao = new SobremesaDAO();
        List<SobremesaModel> lista = dao.buscaSobremesaNome(nome);
        DefaultTableModel dados = (DefaultTableModel)jTablePesquisar.getModel();
        dados.setNumRows(0) ;
        
        for(SobremesaModel c : lista){
            dados.addRow(new Object[]{
            c.getCodigo(),
            c.getNome(),
            c.getSabor(),
            c.getQtd(),
            c.getPreco()
            });
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldPesquisarNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarNomeKeyPressed
        String nome = "%"+jTextFieldPesquisarNome.getText()+"%";
        SobremesaDAO dao = new SobremesaDAO();
        List<SobremesaModel> lista = dao.buscaSobremesaNome(nome);
        DefaultTableModel dados = (DefaultTableModel)jTablePesquisar.getModel();
        dados.setNumRows(0) ;
        
        for(SobremesaModel c : lista){
            dados.addRow(new Object[]{
            c.getCodigo(),
            c.getNome(),
            c.getSabor(),
            c.getQtd(),
            c.getPreco()
            });
        }
    }//GEN-LAST:event_jTextFieldPesquisarNomeKeyPressed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonPesquisarEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarEntregadorActionPerformed
       try {
            int cod = Integer.parseInt(jTextFieldCodigo.getText());
            SobremesaModel obj = new SobremesaModel();
            SobremesaDAO dao = new SobremesaDAO();
            obj = dao.consultaPorCodigo(cod);
            
       jTextFieldCodigo.setText(String.valueOf(obj.getCodigo()));
       jTextFieldNome.setText(obj.getNome());
       jTextFieldSabor.setText(obj.getSabor());
       jTextFieldQtd.setText(obj.getQtd());
       jTextFieldPreco.setText(obj.getPreco());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao mostrar os dados na tela cadastro."+e);
     
        }
    }//GEN-LAST:event_jButtonPesquisarEntregadorActionPerformed
 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroSobremesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroSobremesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApagarSobremesa;
    private javax.swing.JButton jButtonAtualizarSobremesa;
    private javax.swing.JButton jButtonCadastrarSobremesa;
    private javax.swing.JButton jButtonExcluirFuncionario;
    private javax.swing.JButton jButtonExcluirSobremesa;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonPesquisarEditar;
    private javax.swing.JButton jButtonPesquisarEntregador;
    private javax.swing.JButton jButtonPesquisarSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabelNomePesquisar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTablePesquisar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPesquisarNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldQtd;
    private javax.swing.JTextField jTextFieldSabor;
    // End of variables declaration//GEN-END:variables
}
