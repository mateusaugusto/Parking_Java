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
public class consulta_vagas extends javax.swing.JInternalFrame {
    int IDcpf;
    Conexao c = new Conexao();
    DefaultTableModel model = new DefaultTableModel () { 
       public boolean isCellEditable ( int rowIndex, int mColIndex ) { 
         return false ; 
       } 
     } ;
  
    public consulta_vagas() {
        initComponents();
        int j=0;
        String id;
        String a;
        String l;
       jTable2 = new javax.swing.JTable(model);
     
        String sentenca = "SELECT * FROM vagas";
        try {
            ResultSet rs = new Conexao().stmt.executeQuery(sentenca);
            model.addColumn ( "Vaga" ) ;
            model.addColumn ( "Status" ) ;
            while (rs.next()) {
                id = rs.getString("id");
                //System.out.println(rs.getString("id"));
                if ( (rs.getInt("ativo")) == 0 ){
                    a ="Livre";

                }else{
                    a = "Ocupada";
                }
                model.insertRow ( j , new Object [] { id, a }) ;
                j++;
                jScrollPane1.setVisible(true);
                jScrollPane1.setViewportView(jTable2);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vagas");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vagas"));

        jTable2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Vagas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 16), new java.awt.Color(0, 102, 204))); // NOI18N
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
                .addGap(140, 140, 140)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
      
        
        
    }//GEN-LAST:event_jTable2MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
