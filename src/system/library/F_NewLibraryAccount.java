/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.library;

import system.library.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.security.rsa.RSACore;

/**
 *[16,27,30]
 * @author lapet
 */
public class F_NewLibraryAccount extends javax.swing.JFrame {

    /**
     * Creates new form F_NewAccount
     */
     private final Connection conn;    
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private int mouseX, mouseY;
    
    
    public F_NewLibraryAccount() {
        initComponents();
        conn=ConnectSQL.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewAccPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        library = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        createAcc1 = new javax.swing.JButton();
        noSchoolAcc = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        passConf = new javax.swing.JPasswordField();
        studentID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        NewAccPanel.setBackground(new java.awt.Color(255, 255, 255));
        NewAccPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                NewAccPanelMouseDragged(evt);
            }
        });
        NewAccPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewAccPanelMousePressed(evt);
            }
        });

        library.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/Library.png"))); // NOI18N
        library.setLabelFor(this);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(library, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(library, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(217, 65, 65));
        jLabel1.setText("Create Library");

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/back_26px.png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 27, 30));
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 27, 30));
        jLabel3.setText("Confirm Password");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 27, 30));
        jLabel4.setText("Password");

        close.setBackground(new java.awt.Color(255, 255, 255));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/multiply_26px.png"))); // NOI18N
        close.setBorder(null);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(217, 65, 65));
        jLabel7.setText("Account");

        createAcc1.setBackground(new java.awt.Color(255, 255, 255));
        createAcc1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        createAcc1.setForeground(new java.awt.Color(16, 27, 30));
        createAcc1.setText("Create Account");
        createAcc1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 27, 30)));
        createAcc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAcc1ActionPerformed(evt);
            }
        });

        noSchoolAcc.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        noSchoolAcc.setForeground(new java.awt.Color(16, 27, 30));
        noSchoolAcc.setText("No School Account?");
        noSchoolAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noSchoolAccMouseClicked(evt);
            }
        });

        pass.setBackground(new java.awt.Color(236, 240, 241));
        pass.setForeground(new java.awt.Color(16, 27, 30));

        passConf.setBackground(new java.awt.Color(236, 240, 241));
        passConf.setForeground(new java.awt.Color(16, 27, 30));

        studentID.setBackground(new java.awt.Color(236, 240, 241));
        studentID.setForeground(new java.awt.Color(16, 27, 30));
        studentID.setMinimumSize(new java.awt.Dimension(14, 22));

        javax.swing.GroupLayout NewAccPanelLayout = new javax.swing.GroupLayout(NewAccPanel);
        NewAccPanel.setLayout(NewAccPanelLayout);
        NewAccPanelLayout.setHorizontalGroup(
            NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewAccPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NewAccPanelLayout.createSequentialGroup()
                        .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(NewAccPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                                .addComponent(close))
                            .addGroup(NewAccPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pass)
                                    .addComponent(passConf, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(studentID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewAccPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewAccPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewAccPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(164, 164, 164))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewAccPanelLayout.createSequentialGroup()
                                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(createAcc1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noSchoolAcc))
                                .addGap(178, 178, 178))))))
        );
        NewAccPanelLayout.setVerticalGroup(
            NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewAccPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(NewAccPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(close))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(78, 78, 78)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(NewAccPanelLayout.createSequentialGroup()
                        .addComponent(passConf, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addGap(46, 46, 46)
                .addComponent(createAcc1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(noSchoolAcc)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewAccPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewAccPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NewAccPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_NewAccPanelMousePressed

    private void NewAccPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccPanelMouseDragged
        setLocation(getX()+ evt.getX() - mouseX, getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_NewAccPanelMouseDragged

    private void createAcc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAcc1ActionPerformed
      String text = "SELECT studID FROM student WHERE studID =? ";
         try {
             preparedStatement = conn.prepareStatement(text);
             preparedStatement.setString(1, studentID.getText());
             resultSet = preparedStatement.executeQuery();
             if(resultSet.next()){
                 if (!((pass.getText().equalsIgnoreCase("") || passConf.getText().equalsIgnoreCase("")))) {
                     if(pass.getText().equalsIgnoreCase(passConf.getText())){
                        text = "SELECT COUNT(1) FROM studentsAccounts WHERE studID = ?;";
                        preparedStatement = conn.prepareStatement(text);
                        preparedStatement.setString(1, studentID.getText());
                        resultSet = preparedStatement.executeQuery();
                        resultSet.next();
                           System.out.println(Integer.parseInt(resultSet.getString("COUNT(1)")));
                        if(Integer.parseInt(resultSet.getString("COUNT(1)")) == 0){

                           resultSet = preparedStatement.executeQuery();
                           text = "SELECT accountID FROM studentsAccounts ORDER BY accountID DESC LIMIT 1;";
                           preparedStatement = conn.prepareStatement(text);
                           resultSet = preparedStatement.executeQuery();
                           //int accID = Integer.parseInt(resultSet.next().getString(1));
                           int acc = 0;
                           while(resultSet.next())
                               acc = Integer.parseInt(resultSet.getString("accountID"));

                          text = "INSERT INTO studentsAccounts VALUE(?,?,?)";
                          preparedStatement = conn.prepareStatement(text);
                          preparedStatement.setString(1,Integer.toString(acc+1));
                          preparedStatement.setString(2,studentID.getText());
                          preparedStatement.setString(3,pass.getText());
                          preparedStatement.execute();
                          
                          JOptionPane.showMessageDialog( null,"Account Sucssfuly created!");
                          resultSet.close();
                          preparedStatement.close();
                        }else 
                          JOptionPane.showMessageDialog( null,"You already have an account!");
                     }else 
                         JOptionPane.showMessageDialog( null,"Passwords do not much!");
                 }else
                    JOptionPane.showMessageDialog( null,"Password is empty");
             }else
                 JOptionPane.showMessageDialog( null,"Student ID not found! Create an account first!");
        
         } catch (SQLException ex) {
             Logger.getLogger(F_NewLibraryAccount.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_createAcc1ActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(Boolean.FALSE);
        F_Login ob = new F_Login();
        ob.setVisible(Boolean.TRUE);
    }//GEN-LAST:event_backActionPerformed

    private void noSchoolAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noSchoolAccMouseClicked
        setVisible(false);
        F_NewAccount ob=new F_NewAccount();
        ob.setVisible(true);
    }//GEN-LAST:event_noSchoolAccMouseClicked

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
            java.util.logging.Logger.getLogger(FrameNewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameNewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameNewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameNewAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F_NewLibraryAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NewAccPanel;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JButton createAcc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel library;
    private javax.swing.JLabel noSchoolAcc;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField passConf;
    private javax.swing.JTextField studentID;
    // End of variables declaration//GEN-END:variables
}
