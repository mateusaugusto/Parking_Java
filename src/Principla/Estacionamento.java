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

/**
 *
 * @author Mateus
 */
public class Estacionamento extends javax.swing.JInternalFrame {

    Conexao c = new Conexao();
    int id = 0;

    public Estacionamento() {

        initComponents();

        String sentenca3 = "SELECT * FROM estacionamento";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca3);
            ResultSet rs1 = new Conexao().stmt.executeQuery(sentenca3);
            if (rs1.next() == true) {
                while (rs.next()) {
                    //System.out.println(rs.getString("nome"));
                    NomeEst.setText(rs.getString("nome"));
                    CnpjEst.setText(rs.getString("cnpj"));
                    RuaEst.setText(rs.getString("rua"));
                    BairroEst.setText(rs.getString("bairro"));
                    CidEst.setText(rs.getString("cidade"));
                    NumEst.setText(rs.getString("numero"));
                    QtdVagasEst.setText(rs.getString("qtd_vaga"));
                }

                NomeEst.setEnabled(false);
                CnpjEst.setEnabled(false);
                QtdVagasEst.setEnabled(false);
                RuaEst.setEnabled(false);
                BairroEst.setEnabled(false);
                NumEst.setEnabled(false);
                CidEst.setEnabled(false);
                EstadoEst.setEnabled(false);
                SalvarEst.setEnabled(false);

            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabeNome = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelQtd_vagas = new javax.swing.JLabel();
        NomeEst = new javax.swing.JTextField();
        QtdVagasEst = new javax.swing.JTextField();
        CnpjEst = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabelRua = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        RuaEst = new javax.swing.JTextField();
        BairroEst = new javax.swing.JTextField();
        CidEst = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        EstadoEst = new javax.swing.JComboBox();
        jLabelNumero = new javax.swing.JLabel();
        NumEst = new javax.swing.JTextField();
        SalvarEst = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Estacionamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N

        jLabeNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabeNome.setText("Nome:");

        jLabelCnpj.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCnpj.setText("CNPJ:");

        jLabelQtd_vagas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQtd_vagas.setText("Qtd Vaga:");

        NomeEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        NomeEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeEstActionPerformed(evt);
            }
        });

        QtdVagasEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        QtdVagasEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtdVagasEstActionPerformed(evt);
            }
        });

        try {
            CnpjEst.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CnpjEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));

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
                    .addComponent(NomeEst)
                    .addComponent(QtdVagasEst, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CnpjEst, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNome)
                    .addComponent(NomeEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCnpj)
                    .addComponent(CnpjEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtd_vagas)
                    .addComponent(QtdVagasEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 204));

        jLabelRua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRua.setText("Rua:");

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCidade.setText("Cidade:");

        RuaEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        RuaEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RuaEstActionPerformed(evt);
            }
        });

        BairroEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));

        CidEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        CidEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CidEstActionPerformed(evt);
            }
        });

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelEstado.setText("Estado:");

        EstadoEst.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MG", "SP", "RJ", " " }));
        EstadoEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoEstActionPerformed(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelNumero.setText("Nº:");

        NumEst.setDisabledTextColor(new java.awt.Color(51, 51, 51));

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
                        .addComponent(CidEst, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RuaEst, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BairroEst, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNumero)
                            .addComponent(jLabelEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumEst, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EstadoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(RuaEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBairro)
                            .addComponent(BairroEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCidade)
                            .addComponent(CidEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEstado)
                            .addComponent(EstadoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(NumEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        SalvarEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        SalvarEst.setBorder(null);
        SalvarEst.setContentAreaFilled(false);
        SalvarEst.setDefaultCapable(false);
        SalvarEst.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarEst.setRequestFocusEnabled(false);
        SalvarEst.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarEst.setVerifyInputWhenFocusTarget(false);
        SalvarEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarEstActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(SalvarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(SalvarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getQtdVagasEst() {
        return QtdVagasEst;
    }

    public void setQtdVagasEst(JTextField QtdVagasEst) {
        this.QtdVagasEst = QtdVagasEst;
    }

    private void QtdVagasEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtdVagasEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtdVagasEstActionPerformed

    private void NomeEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeEstActionPerformed

    private void RuaEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RuaEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RuaEstActionPerformed

    private void CidEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CidEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CidEstActionPerformed

    private void SalvarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarEstActionPerformed

        int maxid = 0;
        String senteca;
        String set;
        String nome = NomeEst.getText();
        String cnpj = CnpjEst.getText();
        int qtdVagas = Integer.parseInt(QtdVagasEst.getText());
        String rua = RuaEst.getText();
        String bairro = BairroEst.getText();
        String num = NumEst.getText();
        String cidade = CidEst.getText();
        String estado = (String) EstadoEst.getSelectedItem();

        senteca = "insert into estacionamento " + "(nome,cnpj,qtd_vaga,rua,bairro,numero,cidade,estado)" + " values"
                + " ('" + nome + "','" + cnpj + "','" + qtdVagas + "','" + rua + "','" + bairro + "','" + num + "','" + cidade + "','" + estado + "')";
        try {
            c.stmt.execute(senteca);
        } catch (SQLException ex) {
            Logger.getLogger(Estacionamento.class.getName()).log(Level.SEVERE, null, ex);
        }

        String str = "select max(id) from estacionamento";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(str);
            while (rs.next()) {
                 maxid = rs.getInt("max(id)");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        for (int i = 1; i <= qtdVagas; i++) {
            set = "insert into vagas" + " (estacionamento_id,ativo)" + " values"
                    + " ('" + maxid + "','" + 0 + "')";
            try {
                c.stmt.execute(set);
            } catch (SQLException ex) {
                Logger.getLogger(Estacionamento.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


        // System.out.println(cnpj);
        JOptionPane.showMessageDialog(null, "Dados Inseridos");
        dispose();
    }//GEN-LAST:event_SalvarEstActionPerformed

    private void EstadoEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoEstActionPerformed
    }//GEN-LAST:event_EstadoEstActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroEst;
    private javax.swing.JTextField CidEst;
    private javax.swing.JFormattedTextField CnpjEst;
    private javax.swing.JComboBox EstadoEst;
    private javax.swing.JTextField NomeEst;
    private javax.swing.JTextField NumEst;
    private javax.swing.JTextField QtdVagasEst;
    private javax.swing.JTextField RuaEst;
    private javax.swing.JButton SalvarEst;
    private javax.swing.JLabel jLabeNome;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelCnpj;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelQtd_vagas;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
