/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principla;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class edt_cliente extends javax.swing.JInternalFrame {

    int idCli;
    Conexao c = new Conexao();
    DefaultTableModel model = new DefaultTableModel() {
        public boolean isCellEditable(int rowIndex, int mColIndex) {
            return false;
        }
    };

    /**
     * Creates new form cliente
     */
    public edt_cliente() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabeNome = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelQtd_vagas = new javax.swing.JLabel();
        NomeCli = new javax.swing.JTextField();
        ValorVagaCli = new javax.swing.JTextField();
        CpfCLi = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelRua = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        RuaCli = new javax.swing.JTextField();
        BairroCli = new javax.swing.JTextField();
        CidCli = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        EstadoCli = new javax.swing.JComboBox();
        jLabelNumero = new javax.swing.JLabel();
        NumCli = new javax.swing.JTextField();
        SalvarCli = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PesqEdtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonEdtCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Estacionamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabeNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNome.setText("Nome:");

        jLabelCnpj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCnpj.setText("CPF:");

        jLabelQtd_vagas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtd_vagas.setText("Valor Vaga:");

        NomeCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeCliActionPerformed(evt);
            }
        });

        ValorVagaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorVagaCliActionPerformed(evt);
            }
        });

        CpfCLi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelQtd_vagas)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCnpj)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NomeCli, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(ValorVagaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfCLi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNome)
                    .addComponent(NomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCnpj)
                    .addComponent(CpfCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtd_vagas)
                    .addComponent(ValorVagaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabelRua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRua.setText("Rua:");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCidade.setText("Cidade:");

        RuaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaCliActionPerformed(evt);
            }
        });

        CidCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidCliActionPerformed(evt);
            }
        });

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEstado.setText("Estado:");

        EstadoCli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MG", "SP", "RJ", " " }));
        EstadoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoCliActionPerformed(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNumero.setText("Nº:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelCidade)
                            .addComponent(jLabelBairro))
                        .addGap(2, 2, 2))
                    .addComponent(jLabelRua, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CidCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RuaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NumCli))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EstadoCli, 0, 67, Short.MAX_VALUE)))
                        .addGap(26, 26, 26))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(RuaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(EstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(BairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero)
                    .addComponent(NumCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(CidCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        SalvarCli.setContentAreaFilled(false);
        SalvarCli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCli.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarCliActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pesquisa Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jButtonEdtCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButtonEdtCliente.setContentAreaFilled(false);
        jButtonEdtCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jButtonEdtCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search2.png"))); // NOI18N
        jButtonEdtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEdtClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesqEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PesqEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(null);

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
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(SalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getQtdVagasEst() {
        return ValorVagaCli;
    }

    public void setQtdVagasEst(JTextField QtdVagasEst) {
        this.ValorVagaCli = QtdVagasEst;
    }

    private void ValorVagaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorVagaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorVagaCliActionPerformed

    private void NomeCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeCliActionPerformed

    private void RuaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuaCliActionPerformed

    private void CidCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidCliActionPerformed

    private void SalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarCliActionPerformed
        int ativo = 1;
        String senteca;
        String nome = NomeCli.getText();
        String cpf = CpfCLi.getText();
        int valorVaga = Integer.parseInt(ValorVagaCli.getText());
        String rua = RuaCli.getText();
        String bairro = BairroCli.getText();
        String num = NumCli.getText();
        String cidade = CidCli.getText();
        String estado = (String) EstadoCli.getSelectedItem();


        String sentenca4 = "UPDATE cliente set nome = '" + nome + "',CPF = '" + cpf + "',valor_vaga = '" + valorVaga + "',rua = '" + rua + "',"
                + "bairro = '" + bairro + "',numero = '" + num + "',estado = '" + estado + "',cidade = '" + cidade + "' WHERE id=" + idCli;
        try {
            new Conexao().stmt.execute(sentenca4);
        } catch (SQLException e) {
            e.printStackTrace();
        }



        JOptionPane.showMessageDialog(null, "Dados Inseridos");
        dispose();
    }//GEN-LAST:event_SalvarCliActionPerformed

    private void EstadoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoCliActionPerformed
    }//GEN-LAST:event_EstadoCliActionPerformed

    private void jButtonEdtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdtClienteActionPerformed
        int j = 0;
        jTable2 = new javax.swing.JTable(model);
        String nome = PesqEdtCliente.getText();
        String cpf;

        String sentenca = "SELECT * FROM cliente where nome =" + " ('" + nome + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
            ResultSet rs1 = new Conexao().stmt.executeQuery(sentenca);
            if (rs1.next() == true) {
                model.addColumn("Nome");
                model.addColumn("Cpf");
                // model.addColumn ( "Vaga" ) ;
                while (rs.next()) {
                    nome = rs.getString("nome");
                    cpf = rs.getString("cpf");
                    idCli = rs.getInt("id");
                    model.insertRow(j, new Object[]{nome, cpf});
                    j++;
                    jScrollPane1.setVisible(true);
                    jScrollPane1.setViewportView(jTable2);
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
    }//GEN-LAST:event_jButtonEdtClienteActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int linha = jTable2.getSelectedRow();//pega a linha selecionada 
        NomeCli.setText(jTable2.getModel().getValueAt(linha, 0).toString());
        CpfCLi.setText(jTable2.getModel().getValueAt(linha, 1).toString());

        String sentenca = "SELECT * FROM cliente WHERE id=" + idCli;
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
            while (rs.next()) {
                ValorVagaCli.setText(rs.getString("valor_vaga"));
                RuaCli.setText(rs.getString("rua"));
                BairroCli.setText(rs.getString("bairro"));
                CidCli.setText(rs.getString("cidade"));
                NumCli.setText(rs.getString("numero"));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_jTable2MouseClicked
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroCli;
    private javax.swing.JTextField CidCli;
    private javax.swing.JFormattedTextField CpfCLi;
    private javax.swing.JComboBox EstadoCli;
    private javax.swing.JTextField NomeCli;
    private javax.swing.JTextField NumCli;
    private javax.swing.JTextField PesqEdtCliente;
    private javax.swing.JTextField RuaCli;
    private javax.swing.JButton SalvarCli;
    private javax.swing.JTextField ValorVagaCli;
    private javax.swing.JButton jButtonEdtCliente;
    private javax.swing.JLabel jLabeNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelQtd_vagas;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
