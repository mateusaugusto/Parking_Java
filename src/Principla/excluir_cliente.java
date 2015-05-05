/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principla;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mateus
 */
public class excluir_cliente extends javax.swing.JInternalFrame {
    int idcliente;
    Conexao c = new Conexao();
    DefaultTableModel model = new DefaultTableModel () { 
       public boolean isCellEditable ( int rowIndex, int mColIndex ) { 
         return false ; 
       } 
     } ;
    /**
     * Creates new form cliente
     */
    public excluir_cliente() {
        initComponents();
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        SalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        SalvarCli.setContentAreaFilled(false);
        SalvarCli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCli.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salvar.png"))); // NOI18N
        SalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarCliActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Pesquisa Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N

        PesqEdtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesqEdtClienteActionPerformed(evt);
            }
        });

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
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesqEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PesqEdtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
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
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(SalvarCli)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(SalvarCli)
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void SalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarCliActionPerformed
        int id = 0; 
        String sentenca1 = "SELECT * FROM pagamento where cliente_id =" + " ('" + idcliente + "')";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca1);
                 while (rs.next()) {
                  id = rs.getInt("baixa");   
                  if(id == 1) {
           JOptionPane.showMessageDialog(null, "Cliente possui pagamentos baixados. Impossivel excluir"); 
           return;
        }
                                
        }
        } catch (SQLException e) {
            e.printStackTrace();

        }
       
       // else{      
        String sentenca = "DELETE FROM cliente WHERE id="+idcliente;
    	try {
			new Conexao().stmt.execute(sentenca);
		} catch (SQLException e) {
			e.printStackTrace();
		}
        JOptionPane.showMessageDialog(null, "Cliente Excluido");
        dispose();
   
         
    }//GEN-LAST:event_SalvarCliActionPerformed

    private void jButtonEdtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEdtClienteActionPerformed
             int j=0;    
              
      jTable2 = new javax.swing.JTable(model);
         String nome = PesqEdtCliente.getText();
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
                idcliente = rs.getInt("id");
                model.insertRow ( j , new Object [] { nome, cpf }) ; 
     j++;
     jScrollPane1.setVisible(true);
     jScrollPane1.setViewportView(jTable2);
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
       
          
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void PesqEdtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesqEdtClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PesqEdtClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PesqEdtCliente;
    private javax.swing.JButton SalvarCli;
    private javax.swing.JButton jButtonEdtCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
