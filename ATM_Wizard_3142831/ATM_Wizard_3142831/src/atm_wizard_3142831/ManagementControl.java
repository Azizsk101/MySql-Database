/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm_wizard_3142831;
import java.awt.Desktop;
import javax.swing.table.DefaultTableModel;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;  
import java.util.logging.Logger;
import java.lang.ClassNotFoundException;
import java.lang.NoClassDefFoundError;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author Abdul Aziz Kalsekar
 */
public class ManagementControl extends javax.swing.JFrame {

    /**
     * Creates new form ManagementControl
     */
    
    public ManagementControl() 
    {
        initComponents();

        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atm", "root","0000");

            Statement st = con.createStatement();
            String query = "SELECT * FROM atm.atm_data2;";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                while(rs.next())
                {
                    String AccountNo, Name, WithDrawnAmount, Balance;
                    
                    AccountNo = String.valueOf(rs.getString("AccountNo"));
                    Name = String.valueOf(rs.getString("Name"));
                    WithDrawnAmount = String.valueOf(rs.getString("WithdrawAmount"));
                    Balance = String.valueOf(rs.getString("Balance"));

                    String DatabaseData[] = {AccountNo, Name, WithDrawnAmount, Balance};
                    DefaultTableModel model = (DefaultTableModel) manageTable.getModel();
                    
                    model.addRow(DatabaseData);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error!");
            }
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(UserDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Workbook wb = new XSSFWorkbook();
                Sheet sheet = wb.createSheet("Details");
                Row rowCol = sheet.createRow(0);
                for (int i=0; i<manageTable.getColumnCount(); i++)
                {
                    Cell cell = rowCol.createCell(i);
                    cell.setCellValue(manageTable.getColumnName(i));
                }
                for(int j=0; j<manageTable.getRowCount(); j++)
                {
                    Row row = sheet.createRow(j+1);
                    for (int k=0; k<manageTable.getColumnCount();k++)
                    {
                        Cell cell;
                        cell = row.createCell(k);
                        if (manageTable.getValueAt(j,k)!=null)
                        {
                            cell.setCellValue(manageTable.getValueAt(j, k).toString());
                        }
                    }
                }
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(new File("AtmDetail.xlsx"));
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(ManagementControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    wb.write(out);
                } catch (IOException ex) {
                    Logger.getLogger(ManagementControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    wb.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManagementControl.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    out.close();
                } catch (IOException ex) {
                    Logger.getLogger(ManagementControl.class.getName()).log(Level.SEVERE, null, ex);
                }

                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        manageTable = new javax.swing.JTable();
        sDBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        manageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account No", "Account Name", "Withdraw Amount (€)", "New Balance (£)"
            }
        ));
        jScrollPane1.setViewportView(manageTable);

        sDBtn.setBackground(new java.awt.Color(255, 0, 51));
        sDBtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        sDBtn.setText("Shut down");
        sDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sDBtn)
                .addGap(206, 206, 206))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(sDBtn)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDBtnActionPerformed
        // TODO add your handling code here:
        try {
                    Desktop.getDesktop().open(new File("AtmDetail.xlsx"));
                } catch (IOException ex) {
                    Logger.getLogger(ManagementControl.class.getName()).log(Level.SEVERE, null, ex);
                } 
        
        System.exit(0);
    }//GEN-LAST:event_sDBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagementControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manageTable;
    private javax.swing.JButton sDBtn;
    // End of variables declaration//GEN-END:variables
}
