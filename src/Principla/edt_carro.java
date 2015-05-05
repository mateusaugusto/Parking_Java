/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principla;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class edt_carro extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model1 = new DefaultTableModel();
    String cliId = "";
    String IDcpf;
    Conexao c = new Conexao();

    public edt_carro() {

        initComponents();


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelVagas = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        PesquisCliente = new javax.swing.JTextField();
        PesquisaCliente = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Fabricante = new javax.swing.JTextField();
        Placa = new javax.swing.JTextField();
        Modelo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        SalvarCarro = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Carro");

        jPanelVagas.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pesquisa Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

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
                .addComponent(PesquisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanelVagasLayout.setVerticalGroup(
            jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVagasLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelVagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(PesquisCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Carro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Placa:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Modelo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Fabricante:");

        Placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlacaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Modelo)
                            .addComponent(Placa)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Fabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
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

        jScrollPane3.setBorder(null);

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
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanelVagas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SalvarCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlacaActionPerformed

    private void PesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisaClienteActionPerformed
        int j = 0;

        DefaultTableModel model = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        jTable2 = new javax.swing.JTable(model);
        String nome = PesquisCliente.getText();
        String cpf;
        String sentenca = "SELECT * FROM cliente where nome =" + " ('" + nome + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
            ResultSet rs1 = new Conexao().stmt.executeQuery(sentenca);
            if (rs1.next() == true) {
                model.addColumn("Nome");
                model.addColumn("Cpf");
                model.addColumn("Vaga");
                while (rs.next()) {
                    nome = rs.getString("nome");
                    cpf = rs.getString("cpf");
                    model.insertRow(j, new Object[]{nome, cpf});
                    j++;
                    jScrollPane2.setVisible(true);
                    jScrollPane2.setViewportView(jTable2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });

//JOptionPane.showMessageDialog(null, cliId); 
    }//GEN-LAST:event_PesquisaClienteActionPerformed

    private void SalvarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarCarroActionPerformed

        String id = "";
        int linha = jTable1.getSelectedRow();//pega a linha selecionada 
        String coluna1 = jTable1.getModel().getValueAt(linha, 0).toString(); // Primeira coluna da linha 

        String sentenca = "SELECT * FROM carro where placa =" + " ('" + coluna1 + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
            while (rs.next()) {
                id = rs.getString("id");

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

        String senteca;
        String placa = Placa.getText();
        String modelo = Modelo.getText();
        String fabricante = Fabricante.getText();

        String sentenca4 = "UPDATE carro set placa = '" + placa + "',modelo = '" + modelo + "',fabricante = '" + fabricante + "' WHERE id=" + id;
        try {
            new Conexao().stmt.execute(sentenca4);
        } catch (SQLException e) {
            e.printStackTrace();
        }



        JOptionPane.showMessageDialog(null, "Dados Inseridos");
        dispose();


    }//GEN-LAST:event_SalvarCarroActionPerformed

    private void PesquisClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesquisClienteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int linha = jTable1.getSelectedRow();//pega a linha selecionada
        Placa.setText(jTable1.getModel().getValueAt(linha, 0).toString());
        Modelo.setText(jTable1.getModel().getValueAt(linha, 1).toString());
        Fabricante.setText(jTable1.getModel().getValueAt(linha, 2).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel model1 = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };

        int linha = jTable2.getSelectedRow();//pega a linha selecionada
        String coluna1 = jTable2.getModel().getValueAt(linha, 1).toString(); // Primeira coluna da linha

        jTable1 = new javax.swing.JTable(model1);
        int jj = 0;

        String sentenca = "SELECT * FROM cliente where cpf =" + " ('" + coluna1 + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
            while (rs.next()) {
                cliId = rs.getString("id");

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        String placa;
        String modelo;
        String fabricante = "";

        String sentenca3 = "SELECT * FROM carro where cliente_id =" + " ('" + cliId + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca3);

            model1.addColumn("Placa");
            model1.addColumn("Modelo");
            model1.addColumn("Fabricante");
            while (rs.next()) {
                placa = rs.getString("placa");
                modelo = rs.getString("modelo");
                fabricante = rs.getString("fabricante");
                model1.insertRow(jj, new Object[]{placa, modelo, fabricante});
                jj++;
                jScrollPane3.setVisible(true);
                jScrollPane3.setViewportView(jTable1);
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fabricante;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField PesquisCliente;
    private javax.swing.JButton PesquisaCliente;
    private javax.swing.JTextField Placa;
    private javax.swing.JButton SalvarCarro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelVagas;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
