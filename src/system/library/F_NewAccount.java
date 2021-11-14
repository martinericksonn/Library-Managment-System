/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.library;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

/**
 *
 * @author lapet
 */
public class F_NewAccount extends javax.swing.JFrame {

    /**
     * Creates new form F_NewAccount
     */
     private Connection conn;    
     private ResultSet resultSet;
     private PreparedStatement preparedStatement;
     private int mouseX, mouseY;
     private char gender;
    
    
    public F_NewAccount() {
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
        lastName = new javax.swing.JTextField();
        firstName = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        createAcc = new javax.swing.JButton();
        back = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yearLevel = new javax.swing.JComboBox<>();
        close = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

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

        library.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/basak.png"))); // NOI18N
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
        jLabel1.setText("Create Student ");

        lastName.setBackground(new java.awt.Color(236, 240, 241));
        lastName.setForeground(new java.awt.Color(16, 27, 30));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        firstName.setBackground(new java.awt.Color(236, 240, 241));
        firstName.setForeground(new java.awt.Color(16, 27, 30));
        firstName.setMinimumSize(new java.awt.Dimension(14, 22));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        female.setBackground(new java.awt.Color(255, 255, 255));
        female.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        female.setForeground(new java.awt.Color(16, 27, 30));
        female.setText("Female");
        female.setToolTipText("");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        male.setBackground(new java.awt.Color(255, 255, 255));
        male.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        male.setForeground(new java.awt.Color(16, 27, 30));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        createAcc.setBackground(new java.awt.Color(255, 255, 255));
        createAcc.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        createAcc.setForeground(new java.awt.Color(16, 27, 30));
        createAcc.setText("Create Account");
        createAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 27, 30)));
        createAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/back_26px.png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        label.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(16, 27, 30));
        label.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 27, 30));
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 27, 30));
        jLabel5.setText("Year Level");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 27, 30));
        jLabel6.setText("Gender");

        yearLevel.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        yearLevel.setForeground(new java.awt.Color(16, 27, 30));
        yearLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5+" }));

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
                                .addGap(88, 88, 88)
                                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(label)
                                        .addComponent(jLabel5)))
                                .addGap(42, 42, 42)
                                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(NewAccPanelLayout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 87, Short.MAX_VALUE))
                            .addGroup(NewAccPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(back)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close)))
                        .addContainerGap())
                    .addGroup(NewAccPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 127, Short.MAX_VALUE)
                        .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewAccPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(104, 104, 104))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NewAccPanelLayout.createSequentialGroup()
                                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(172, 172, 172))))))
        );
        NewAccPanelLayout.setVerticalGroup(
            NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewAccPanelLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(NewAccPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(62, 62, 62)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(NewAccPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(createAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
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

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(Boolean.FALSE);
        new F_NewLibraryAccount().setVisible(Boolean.TRUE);;
    }//GEN-LAST:event_backActionPerformed

    private void createAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccActionPerformed
        int studID = 0;
        if(!(lastName.getText().equalsIgnoreCase("") ||firstName.getText().equalsIgnoreCase("") ||
                male.isSelected() == false && female.isSelected() == false)){
                String text = "SELECT studID FROM student ORDER BY studID DESC LIMIT 1";
            try {
                preparedStatement = conn.prepareStatement(text);
                resultSet = preparedStatement.executeQuery();
                resultSet.next();
                studID = Integer.parseInt(resultSet.getString("studID"))+1;
                System.out.println(studID);
                
                text = "INSERT INTO student VALUE(?,?,?,?,?)";
                preparedStatement = conn.prepareStatement(text);
                preparedStatement.setString(1, Integer.toString(studID));
                preparedStatement.setString(2, WordUtils.capitalizeFully(lastName.getText()));
                preparedStatement.setString(3, WordUtils.capitalizeFully(firstName.getText()));
                preparedStatement.setString(4, Character.toString(gender));
                preparedStatement.setString(5, yearLevel.getItemAt(yearLevel.getSelectedIndex()));
                preparedStatement.execute();
                
                resultSet.close();
                preparedStatement.close();         
            } catch (SQLException ex) {
                Logger.getLogger(F_NewAccount.class.getName()).log(Level.SEVERE, null, ex);
                 Logger.getLogger(F_NewAccount.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Success!\nStudent ID is " + studID);
        }else 
            JOptionPane.showMessageDialog(null, "Please fill out the form completely");
    }//GEN-LAST:event_createAccActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
              if(male.isSelected()) {
                  female.setSelected(Boolean.FALSE);
                  gender = 'M';
               }
                 
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        if(female.isSelected()) {
                  male.setSelected(Boolean.FALSE);
                   gender = 'F';
           }
    }//GEN-LAST:event_femaleActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
 
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeActionPerformed

    private void NewAccPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccPanelMousePressed
         mouseX = evt.getX();
         mouseY = evt.getY();
    }//GEN-LAST:event_NewAccPanelMousePressed

    private void NewAccPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewAccPanelMouseDragged
       setLocation(getX()+ evt.getX() - mouseX, getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_NewAccPanelMouseDragged

 
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
                new F_NewAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NewAccPanel;
    private javax.swing.JButton back;
    private javax.swing.JButton close;
    private javax.swing.JButton createAcc;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel library;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> yearLevel;
    // End of variables declaration//GEN-END:variables
}
