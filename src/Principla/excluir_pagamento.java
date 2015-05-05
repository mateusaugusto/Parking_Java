/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principla;


import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class excluir_pagamento extends javax.swing.JInternalFrame {
    DefaultTableModel model = new DefaultTableModel () ;
    DefaultTableModel model1 = new DefaultTableModel () ;
    String id = "";
    String val ="";
    String DataPag ="";
    String idPagamento ="";
    Conexao c = new Conexao();

   public excluir_pagamento() {

        initComponents();

    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVagas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PesquisCliente = new javax.swing.JTextField();
        PesquisaCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        SalvarCarro = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Excluir Pagamento");

        jPanelVagas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pesquisa Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Digite o nome do Cliente:");

        PesquisCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisClienteActionPerformed(evt);
            }
        });

        PesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        PesquisaCliente.setContentAreaFilled(false);
        PesquisaCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        PesquisaCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        PesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisaClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelVagasLayout = new javax.swing.GroupLayout(jPanelVagas);
        jPanelVagas.setLayout(jPanelVagasLayout);
        jPanelVagasLayout.setHorizontalGroup(
            jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVagasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PesquisaCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelVagasLayout.setVerticalGroup(
            jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVagasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PesquisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesquisaCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        SalvarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        SalvarCarro.setContentAreaFilled(false);
        SalvarCarro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCarro.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarCarroActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanelVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaClienteActionPerformed
      int j=0; 
      
      
       DefaultTableModel model = new DefaultTableModel () { 
       public boolean isCellEditable ( int rowIndex, int mColIndex ) { 
         return false ; 
       } 
     } ;
              
      jTable2 = new javax.swing.JTable(model);
      String nome = PesquisCliente.getText();
      String cpf;
       
 
        String sentenca = "SELECT * FROM cliente where nome =" + " ('" + nome + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
           
            // model.addColumn ( "Id" ) ;
             model.addColumn ( "Nome" ) ; 
             model.addColumn ( "Cpf" ) ; 
             model.addColumn ( "Vaga" ) ;
             
            while (rs.next()) {
                //System.out.print(rs.getString("nome"));
               // System.out.println(rs.getString("cpf"));
                nome = rs.getString("nome");
                cpf = rs.getString("cpf"); 
                //int id = rs.getInt("id");
                model.insertRow ( j , new Object [] {nome, cpf }) ; 
                
     j++;
     
     jScrollPane2.setVisible(true);
     jScrollPane2.setViewportView(jTable2);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable2MouseClicked(evt);
    }
});
    }//GEN-LAST:event_PesquisaClienteActionPerformed

    private void SalvarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarCarroActionPerformed
      System.out.print(idPagamento);
      
     	String sentenca = "DELETE FROM pagamento WHERE id="+idPagamento;
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}      
        JOptionPane.showMessageDialog(null, "Pagamento Excluido");  
        dispose();
    }//GEN-LAST:event_SalvarCarroActionPerformed

    private void PesquisClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisClienteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int x=0;
        String datavencimento="";
        int linha = jTable2.getSelectedRow();//pega a linha selecionada 
        String coluna1 = jTable2.getModel().getValueAt(linha, 1).toString(); // Primeira coluna da linha 
  
     
        String sentenca = "SELECT * FROM cliente where cpf =" + " ('" + coluna1 + "')";
        try {
            
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
               
                 while (rs.next()) {
                 id = rs.getString("id");
                 val = rs.getString("valor_vaga");
                 
        }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        
        
        DefaultTableModel model1 = new DefaultTableModel () { 
       public boolean isCellEditable ( int rowIndex, int mColIndex ) { 
         return false ; 
       } 
     } ;
              
      jTable1 = new javax.swing.JTable(model1);
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String sentenca6 = "SELECT * FROM pagamento where cliente_id =" + " ('" + id + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca6);
             model1.addColumn ( "Vencimentos" ) ; 
             while (rs.next()) {
                  if ( rs.getInt("baixa") == 0){
                    Date d = rs.getDate("vencimento");                  
                    idPagamento = rs.getString("id");
                    model1.insertRow ( x , new Object [] { sdf.format(d) }) ; 
                  }
     jScrollPane1.setVisible(true);
     jScrollPane1.setViewportView(jTable1);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
    }
});
        
    }//GEN-LAST:event_jTable2MouseClicked
 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            
    }//GEN-LAST:event_jTable1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PesquisCliente;
    private javax.swing.JButton PesquisaCliente;
    private javax.swing.JButton SalvarCarro;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelVagas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
