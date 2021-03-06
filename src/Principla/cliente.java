/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principla;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mateus
 */
public class cliente extends javax.swing.JInternalFrame {
 Conexao c = new Conexao();
    /**
     * Creates new form cliente
     */
    public cliente() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabeNome = new javax.swing.JLabel();
        jLabelCnpj = new javax.swing.JLabel();
        jLabelQtd_vagas = new javax.swing.JLabel();
        NomeCli = new javax.swing.JTextField();
        CpfCLi = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        MesesCli = new javax.swing.JTextField();
        ValorVagaCli = new javax.swing.JFormattedTextField();
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

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

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

        try {
            CpfCLi.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Tempo Meses:");

        MesesCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesesCliActionPerformed(evt);
            }
        });

        try {
            ValorVagaCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelQtd_vagas)
                        .addComponent(jLabeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelCnpj)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ValorVagaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))
                            .addComponent(CpfCLi, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MesesCli, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeNome)
                    .addComponent(NomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCnpj)
                    .addComponent(CpfCLi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQtd_vagas)
                    .addComponent(jLabel1)
                    .addComponent(MesesCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValorVagaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Endereço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addGap(2, 2, 2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CidCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelBairro)
                                .addGap(2, 2, 2)
                                .addComponent(BairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabelRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RuaCli, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEstado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNumero, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumCli)
                            .addComponent(EstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEstado)
                            .addComponent(EstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNumero)
                            .addComponent(NumCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRua)
                            .addComponent(RuaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelBairro)
                            .addComponent(BairroCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(CidCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        SalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        SalvarCli.setContentAreaFilled(false);
        SalvarCli.setRequestFocusEnabled(false);
        SalvarCli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCli.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarCliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(SalvarCli)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(SalvarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getQtdVagasEst() {
        return ValorVagaCli;
    }

    public void setQtdVagasEst(JFormattedTextField QtdVagasEst) {
        this.ValorVagaCli = QtdVagasEst;
    }

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
       // cnpj = CnpjEst.getText();
        String cpf = CpfCLi.getText();
        int valorVaga = Integer.parseInt(ValorVagaCli.getText());
        int tempo = Integer.parseInt(MesesCli.getText());
        String rua = RuaCli.getText();
        String bairro = BairroCli.getText();
        String num = NumCli.getText();
        String cidade = CidCli.getText();
        String estado = (String) EstadoCli.getSelectedItem(); 
        
         senteca =  "insert into cliente " + "(nome,cpf,valor_vaga,rua,bairro,numero,cidade,estado,ativo,qtd_meses)" + " values"
        + " ('" + nome +"','" + cpf +"','" + valorVaga +"','" + rua +"','" + bairro +"','" + num +"','" + cidade +"','" + estado +"','" + ativo +"','" + tempo +"')";
         try {
            c.stmt.execute(senteca);
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
       int maxid=0;  
       String str = "select max(id) from cliente";
    	try {
			ResultSet rs = new Conexao().stmt.executeQuery(str);
                     
			while(rs.next()){
				maxid = rs.getInt("max(id)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        
        java.sql.Date data = new java.sql.Date(System.currentTimeMillis());
           
         for (int i=1;i<= tempo; i++){
         
         data.setDate(data.getDate() + 30);            
         String senteca2 =  "insert into pagamento " + "(cliente_id,vencimento,baixa)" + " values"
        + " ('" + maxid +"','" + data +"','" + 0 +"')";
         try {
            c.stmt.execute(senteca2);
        } catch (SQLException ex) {
            Logger.getLogger(cliente.class.getName()).log(Level.SEVERE, null, ex);
        }  
             
             
             
                         
         }
         
        JOptionPane.showMessageDialog(null, "Dados Inseridos"); 
        dispose();
    }//GEN-LAST:event_SalvarCliActionPerformed

    private void EstadoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoCliActionPerformed
        
        
        
    }//GEN-LAST:event_EstadoCliActionPerformed

    private void MesesCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesesCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MesesCliActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroCli;
    private javax.swing.JTextField CidCli;
    private javax.swing.JFormattedTextField CpfCLi;
    private javax.swing.JComboBox EstadoCli;
    private javax.swing.JTextField MesesCli;
    private javax.swing.JTextField NomeCli;
    private javax.swing.JTextField NumCli;
    private javax.swing.JTextField RuaCli;
    private javax.swing.JButton SalvarCli;
    private javax.swing.JFormattedTextField ValorVagaCli;
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
    // End of variables declaration//GEN-END:variables
}
