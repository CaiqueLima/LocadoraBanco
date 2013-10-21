/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rosicleiafrasson.locadorabanco.view;

import br.com.rosicleiafrasson.locadorabanco.controller.UsuarioController;
import br.com.rosicleiafrasson.locadorabanco.model.Usuario;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rosicleia.souza
 */
public class UsuarioListaGUI extends javax.swing.JFrame {

    private JTable tabela;
    private DefaultTableModel modelo = 
            new DefaultTableModel();
    /**
     * Creates new form UsuarioListaGUI
     */
    public UsuarioListaGUI() {
        initComponents();
        criaJTable();
        painelRolagem.setViewportView(tabela);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txPesquisa = new javax.swing.JTextField();
        btRemover = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        painelRolagem = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFundo.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Pesquisar.:   ");

        txPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txPesquisaActionPerformed(evt);
            }
        });

        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btRemover.setToolTipText("Remover");
        btRemover.setBorderPainted(false);
        btRemover.setContentAreaFilled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btAtualizar.setToolTipText("Atualizar");
        btAtualizar.setBorderPainted(false);
        btAtualizar.setContentAreaFilled(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btInserir.setToolTipText("Inserir");
        btInserir.setBorderPainted(false);
        btInserir.setContentAreaFilled(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        painelRolagem.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelRolagem)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txPesquisa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addGap(0, 267, Short.MAX_VALUE)
                        .addComponent(btInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRemover)))
                .addContainerGap())
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRemover)
                    .addComponent(btAtualizar)
                    .addComponent(btInserir))
                .addGap(18, 18, 18)
                .addComponent(painelRolagem, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
       UsuarioInserirGUI ui = 
               new UsuarioInserirGUI
               (modelo);
       ui.setLocationRelativeTo(null);
       ui.setVisible(true);
       
    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
       int linhaSelecionada = -1;
       linhaSelecionada = 
               tabela.getSelectedRow();
       if (linhaSelecionada >= 0){
           int idUsuario = 
                   (int)tabela.getValueAt
                   (linhaSelecionada, 0);
           UsuarioController uc = 
                   new UsuarioController();
           if (uc.remove(idUsuario)){
               modelo.removeRow(linhaSelecionada);
           } 
       }else{
           JOptionPane.showMessageDialog(null,
                   "Nenhuma linha foi "
                   + "selecionada");
       }
       
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
       int linhaSelecionada = -1;
       linhaSelecionada = 
               tabela.getSelectedRow();
       if (linhaSelecionada >= 0){
           int idUsuario = (int)tabela.
                   getValueAt
                   (linhaSelecionada, 0);
           UsuarioInserirGUI ui =
                   new UsuarioInserirGUI
                   (modelo, linhaSelecionada,
                   idUsuario);
           ui.setVisible(true);
       }else{
           JOptionPane.showMessageDialog
                   (null, "Nenhuma linha foi"
                   + " selecionada.");
       }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void txPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txPesquisaActionPerformed
       String nome = txPesquisa.getText();
       UsuarioController uc =
               new UsuarioController();
       modelo.setNumRows(0);
      for(Usuario u: uc.listByNome(nome)){
          modelo.addRow(new Object[]{
              u.getCodigo(),
              u.getNome(),
              u.getCpf(),
              u.getLogin()
          });
      }
       
    }//GEN-LAST:event_txPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JScrollPane painelRolagem;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void criaJTable() {
        tabela = new JTable(modelo);
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("CPF");
        modelo.addColumn("Usuário");
        preencherJTable();
    }
    
    private void preencherJTable(){
        UsuarioController uc = new 
                UsuarioController();
        for(Usuario u :uc.listarTodos()){
            modelo.addRow(new Object[]
            {u.getCodigo(), u.getNome(),
            u.getCpf(), u.getLogin()
            });
        }
    }
}