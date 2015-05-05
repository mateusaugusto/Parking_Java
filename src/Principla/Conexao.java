package Principla;

import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Conexao {

    public Connection con;
    public Statement stmt;

   

    public void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.print("Erro" + ex.getMessage());
        }
        String url = "jdbc:mysql://localhost/estacionamento";
        String user = "root";
        String password = "admin";

        try {
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
        } catch (Exception e) {
        }
    }

    public void geraRelatorio(String caminho, String param, String param2) {
        HashMap parametros = new HashMap();
        parametros.put(param2, param);
        File arquivo = new File(caminho);

        if (arquivo.exists()) {
            if (con != null) {
                JasperPrint jp = null;
                try {
                    jp = JasperFillManager.fillReport(arquivo.getAbsolutePath(), parametros, con);
                } catch (JRException ex) {
                    Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
                }
               JasperViewer.viewReport(jp, false);

            } else {
                JOptionPane.showMessageDialog(null, "Conexao Nula");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Arquivo Inexistente");
        }
        

    }
     public Conexao() {
        conectar();
    }
}
