/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principla;

import javax.swing.JFrame;

/**
 *
 * @author Mateus
 */
public class Principal extends javax.swing.JFrame {
 Conexao c = new Conexao();
 
   
    public Principal() {
        
         
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

        principal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCadastroEstacionamento = new javax.swing.JMenuItem();
        jMenuCadastroCliente = new javax.swing.JMenuItem();
        jMenuCadastroCarro = new javax.swing.JMenuItem();
        jMenuClieVaga = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuEdtEstacionamento = new javax.swing.JMenuItem();
        jMenuEdtCliente = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuBaixaPagamento = new javax.swing.JMenuItem();
        jMenuExcluirPagamento = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jMenuInativarCliente = new javax.swing.JMenuItem();
        jMenuAtivaCliente = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuConsultaCliente = new javax.swing.JMenuItem();
        jMenuCliVaga = new javax.swing.JMenuItem();
        jMenuPagamentos = new javax.swing.JMenuItem();
        jMenuVagas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jReportEsta = new javax.swing.JMenuItem();
        jReportClie = new javax.swing.JMenuItem();
        jReportCliVaga = new javax.swing.JMenuItem();
        jReportPagClie = new javax.swing.JMenuItem();
        jReportCarCli = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estaciona Aqui!");
        setBounds(new java.awt.Rectangle(500, 500, 0, 0));
        setResizable(false);

        principal.setBackground(new java.awt.Color(255, 255, 255));
        principal.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Cadastro");

        jMenuCadastroEstacionamento.setText("Estacionamento");
        jMenuCadastroEstacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroEstacionamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastroEstacionamento);

        jMenuCadastroCliente.setText("Cliente");
        jMenuCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastroCliente);

        jMenuCadastroCarro.setText("Carro");
        jMenuCadastroCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroCarroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCadastroCarro);

        jMenuClieVaga.setText("Cliente - Vaga");
        jMenuClieVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClieVagaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuClieVaga);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        jMenuEdtEstacionamento.setText("Estacionamento");
        jMenuEdtEstacionamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdtEstacionamentoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEdtEstacionamento);

        jMenuEdtCliente.setText("Cliente");
        jMenuEdtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuEdtClienteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuEdtCliente);

        jMenuItem3.setText("Carro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Financeiro");

        jMenuBaixaPagamento.setText("Baixa Pagamento");
        jMenuBaixaPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBaixaPagamentoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuBaixaPagamento);

        jMenuExcluirPagamento.setText("Excluir Pagamento");
        jMenuExcluirPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExcluirPagamentoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuExcluirPagamento);

        jMenuBar1.add(jMenu3);

        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });

        jMenuInativarCliente.setText("Inativar Cliente");
        jMenuInativarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInativarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuInativarCliente);

        jMenuAtivaCliente.setText("Ativar Cliente");
        jMenuAtivaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAtivaClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jMenuAtivaCliente);

        jMenuBar1.add(jMenuCliente);
        jMenuBar1.add(jMenu5);

        jMenu4.setText("Consulta");

        jMenuConsultaCliente.setText("Clientes");
        jMenuConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuConsultaClienteActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuConsultaCliente);

        jMenuCliVaga.setText("Cliente Vaga");
        jMenuCliVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCliVagaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuCliVaga);

        jMenuPagamentos.setText("Pagamentos");
        jMenuPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPagamentosActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuPagamentos);

        jMenuVagas.setText("Vagas");
        jMenuVagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVagasActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuVagas);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Relatorios");

        jReportEsta.setText("Estacionamento");
        jReportEsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportEstaActionPerformed(evt);
            }
        });
        jMenu6.add(jReportEsta);

        jReportClie.setText("Clientes");
        jReportClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportClieActionPerformed(evt);
            }
        });
        jMenu6.add(jReportClie);

        jReportCliVaga.setText("Cliente Vagas");
        jReportCliVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportCliVagaActionPerformed(evt);
            }
        });
        jMenu6.add(jReportCliVaga);

        jReportPagClie.setText("Pagamentos Cliente");
        jReportPagClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportPagClieActionPerformed(evt);
            }
        });
        jMenu6.add(jReportPagClie);

        jReportCarCli.setText("Carro Cliente");
        jReportCarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReportCarCliActionPerformed(evt);
            }
        });
        jMenu6.add(jReportCarCli);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuEdtEstacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdtEstacionamentoActionPerformed
        edt_estacionamento edtE = new  edt_estacionamento();
        principal.add(edtE);
        edtE.setLocation((principal.size().width - edtE.size().width) / 2,(principal.size().height - edtE.size().height) / 2);
        edtE.show();
    }//GEN-LAST:event_jMenuEdtEstacionamentoActionPerformed

    private void jMenuEdtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuEdtClienteActionPerformed
        edt_cliente edtC = new  edt_cliente();
        principal.add(edtC );
        edtC .setLocation((principal.size().width - edtC .size().width) / 2,(principal.size().height - edtC .size().height) / 2);
        edtC .show();
    }//GEN-LAST:event_jMenuEdtClienteActionPerformed

    private void jMenuCadastroCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroCarroActionPerformed
        carro car = new carro();
        principal.add(car);
        car.setLocation((principal.size().width - car.size().width) / 2,(principal.size().height - car.size().height) / 2);
        car.show();
    }//GEN-LAST:event_jMenuCadastroCarroActionPerformed

    private void jMenuCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroClienteActionPerformed
        cliente c = new cliente();
        principal.add(c);
        c.setLocation((principal.size().width - c.size().width) / 2,(principal.size().height - c.size().height) / 2);
        c.show();
    }//GEN-LAST:event_jMenuCadastroClienteActionPerformed

    private void jMenuCadastroEstacionamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastroEstacionamentoActionPerformed
        Estacionamento e = new Estacionamento();
        principal.add(e);
        e.setLocation((principal.size().width - e.size().width) / 2,(principal.size().height - e.size().height) / 2);
        e.show();

    }//GEN-LAST:event_jMenuCadastroEstacionamentoActionPerformed

    private void jMenuClieVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClieVagaActionPerformed
        cliente_vaga car = new cliente_vaga();
        principal.add(car);
        car.setLocation((principal.size().width - car.size().width) / 2,(principal.size().height - car.size().height) / 2);
        car.show();
    }//GEN-LAST:event_jMenuClieVagaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        edt_carro edtCar = new edt_carro();
        principal.add(edtCar);
        edtCar.setLocation((principal.size().width - edtCar.size().width) / 2,(principal.size().height - edtCar.size().height) / 2);
        edtCar.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuBaixaPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBaixaPagamentoActionPerformed
        baixa_pagamento baixa = new  baixa_pagamento();
        principal.add(baixa );
        baixa .setLocation((principal.size().width - baixa .size().width) / 2,(principal.size().height - baixa .size().height) / 2);
        baixa .show();
    }//GEN-LAST:event_jMenuBaixaPagamentoActionPerformed

    private void jMenuExcluirPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExcluirPagamentoActionPerformed
        excluir_pagamento exP = new  excluir_pagamento();
        principal.add(exP );
        exP .setLocation((principal.size().width - exP .size().width) / 2,(principal.size().height - exP .size().height) / 2);
        exP .show();
    }//GEN-LAST:event_jMenuExcluirPagamentoActionPerformed

    private void jMenuInativarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInativarClienteActionPerformed
        inativar_cliente inC = new  inativar_cliente();
        principal.add(inC );
        inC .setLocation((principal.size().width - inC .size().width) / 2,(principal.size().height - inC .size().height) / 2);
        inC .show();
    }//GEN-LAST:event_jMenuInativarClienteActionPerformed

    private void jMenuAtivaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAtivaClienteActionPerformed
        ativar_cliente atC = new  ativar_cliente();
        principal.add(atC );
        atC .setLocation((principal.size().width - atC .size().width) / 2,(principal.size().height - atC .size().height) / 2);
        atC .show();
    }//GEN-LAST:event_jMenuAtivaClienteActionPerformed

    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
      
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuConsultaClienteActionPerformed
        consulta_cliente coC = new  consulta_cliente();
        principal.add(coC );
        coC .setLocation((principal.size().width - coC .size().width) / 2,(principal.size().height - coC .size().height) / 2);
        coC .show();
    }//GEN-LAST:event_jMenuConsultaClienteActionPerformed

    private void jMenuVagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVagasActionPerformed
        consulta_vagas coV = new  consulta_vagas();
        principal.add(coV);
        coV.setLocation((principal.size().width - coV.size().width) / 2,(principal.size().height - coV.size().height) / 2);
        coV.show();
    }//GEN-LAST:event_jMenuVagasActionPerformed

    private void jMenuPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPagamentosActionPerformed
        consulta_pagamentos coP = new  consulta_pagamentos();
        principal.add(coP);
        coP.setLocation((principal.size().width - coP.size().width) / 2,(principal.size().height - coP.size().height) / 2);
        coP.show();
    }//GEN-LAST:event_jMenuPagamentosActionPerformed

    private void jMenuCliVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCliVagaActionPerformed
        consulta_clienteVaga coP = new  consulta_clienteVaga();
        principal.add(coP);
        coP.setLocation((principal.size().width - coP.size().width) / 2,(principal.size().height - coP.size().height) / 2);
        coP.show();
    }//GEN-LAST:event_jMenuCliVagaActionPerformed

    private void jReportEstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportEstaActionPerformed
     c.geraRelatorio("C:/Users/Mateus/Documents/Facul/5º Periodo/Trabalho Cristina e Rodrigo/Estacioanmento/src/Principla/relatorios/reportEstacionamento.jasper",null,null);        
    }//GEN-LAST:event_jReportEstaActionPerformed

    private void jReportClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportClieActionPerformed
    c.geraRelatorio("C:/Users/Mateus/Documents/Facul/5º Periodo/Trabalho Cristina e Rodrigo/Estacioanmento/src/Principla/relatorios/reportClientes.jasper",null,null);        

    }//GEN-LAST:event_jReportClieActionPerformed

    private void jReportPagClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportPagClieActionPerformed
        report_pagamentos r = new report_pagamentos();
         principal.add(r);
        r.setLocation((principal.size().width - r.size().width) / 2,(principal.size().height - r.size().height) / 2);
        r.show();
        
    }//GEN-LAST:event_jReportPagClieActionPerformed
   
    private void jReportCarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportCarCliActionPerformed
       c.geraRelatorio("C:/Users/Mateus/Documents/Facul/5º Periodo/Trabalho Cristina e Rodrigo/Estacioanmento/src/Principla/relatorios/reportCarroCli.jasper",null,null);        

    }//GEN-LAST:event_jReportCarCliActionPerformed

    private void jReportCliVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReportCliVagaActionPerformed
       c.geraRelatorio("C:/Users/Mateus/Documents/Facul/5º Periodo/Trabalho Cristina e Rodrigo/Estacioanmento/src/Principla/relatorios/reportClienteVaga.jasper",null,null);        

    }//GEN-LAST:event_jReportCliVagaActionPerformed

  
    public static void main(String args[]) {
      
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Principal().setExtendedState(JFrame.MAXIMIZED_BOTH);
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuItem jMenuAtivaCliente;
    private javax.swing.JMenuItem jMenuBaixaPagamento;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroCarro;
    private javax.swing.JMenuItem jMenuCadastroCliente;
    private javax.swing.JMenuItem jMenuCadastroEstacionamento;
    private javax.swing.JMenuItem jMenuCliVaga;
    private javax.swing.JMenuItem jMenuClieVaga;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuConsultaCliente;
    private javax.swing.JMenuItem jMenuEdtCliente;
    private javax.swing.JMenuItem jMenuEdtEstacionamento;
    private javax.swing.JMenuItem jMenuExcluirPagamento;
    private javax.swing.JMenuItem jMenuInativarCliente;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuPagamentos;
    private javax.swing.JMenuItem jMenuVagas;
    private javax.swing.JMenuItem jReportCarCli;
    private javax.swing.JMenuItem jReportCliVaga;
    private javax.swing.JMenuItem jReportClie;
    private javax.swing.JMenuItem jReportEsta;
    private javax.swing.JMenuItem jReportPagClie;
    private javax.swing.JDesktopPane principal;
    // End of variables declaration//GEN-END:variables
}
