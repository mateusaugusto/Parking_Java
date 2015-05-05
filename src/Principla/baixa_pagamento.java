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
public class baixa_pagamento extends javax.swing.JInternalFrame {
    DefaultTableModel model = new DefaultTableModel () ;
    DefaultTableModel model1 = new DefaultTableModel () ;
    String id = "";
    String val ="";
    String DataPag ="";
    String idPagamento ="";
    Conexao c = new Conexao();

   public baixa_pagamento() {

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        valor = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        DataVencimento = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        dataPagamento = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Carro");

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
                .addComponent(PesquisCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanelVagasLayout.setVerticalGroup(
            jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVagasLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PesquisaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(PesquisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Baixa Pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Valor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Data Vencimento:");

        try {
            DataVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        DataVencimento.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        DataVencimento.setEnabled(false);
        DataVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataVencimentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Data Pagamento:");

        try {
            dataPagamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dataPagamento)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dataPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

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
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
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
             model.addColumn ( "Nome" ) ; 
             model.addColumn ( "Cpf" ) ; 
             model.addColumn ( "Vaga" ) ;
            while (rs.next()) {
                //System.out.print(rs.getString("nome"));
               // System.out.println(rs.getString("cpf"));
                nome = rs.getString("nome");
                cpf = rs.getString("cpf");   
                model.insertRow ( j , new Object [] { nome, cpf }) ; 
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
     java.sql.Date data = new java.sql.Date(System.currentTimeMillis());
      
    String sentenca4 = "UPDATE pagamento set data_pagamento = '"+ data +"',baixa = '"+ 1 +"' WHERE id=" + idPagamento;
    	try {
			new Conexao().stmt.execute(sentenca4);
		} catch (SQLException e) {
			e.printStackTrace();
                }
    
     
        
        JOptionPane.showMessageDialog(null, "Pagamento Liguidado");  
        
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
        int linha = jTable1.getSelectedRow();//pega a linha selecionada 
        String coluna1 = jTable1.getModel().getValueAt(linha, 0).toString(); // Primeira coluna da linha 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DataVencimento.setText(coluna1);
        valor.setText(val);
        java.sql.Date data = new java.sql.Date(System.currentTimeMillis()); 
        dataPagamento.setText(String.valueOf(sdf.format(data)));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void DataVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataVencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataVencimentoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField DataVencimento;
    private javax.swing.JTextField PesquisCliente;
    private javax.swing.JButton PesquisaCliente;
    private javax.swing.JButton SalvarCarro;
    private javax.swing.JFormattedTextField dataPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelVagas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JFormattedTextField valor;
    // End of variables declaration//GEN-END:variables
}
