/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.library;

import com.mysql.cj.x.protobuf.MysqlxNotice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lapet
 */
public class FrameSearch extends javax.swing.JFrame {
    private final Connection conn;    
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private int mouseX, mouseY;
    /**
     * Creates new form F_Home
     */
    public FrameSearch() {
        initComponents();
        conn = ConnectSQL.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        tab1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        searchBookSubject = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSubject = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchBookName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableName = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        searchBookID = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        booktitle = new javax.swing.JTextField();
        label4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1260, 774));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 27, 30), 5));
        homePanel.setForeground(new java.awt.Color(16, 27, 30));
        homePanel.setPreferredSize(new java.awt.Dimension(1255, 750));
        homePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                homePanelMouseDragged(evt);
            }
        });
        homePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homePanelMousePressed(evt);
            }
        });
        homePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 161));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/ST. MARTIN_3.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/multiply_26px2.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/search_104px.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(217, 65, 65));
        jLabel2.setText("Search Book");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 56, 314, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/header1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 150));

        homePanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 1230, 152));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/library/images/back_26px.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        homePanel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 175, -1, -1));

        tab1.setForeground(new java.awt.Color(16, 27, 30));
        tab1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 27, 30));
        jLabel6.setText("Subject:");

        searchBookSubject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        searchBookSubject.setForeground(new java.awt.Color(16, 27, 30));
        searchBookSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookSubjectActionPerformed(evt);
            }
        });
        searchBookSubject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBookSubjectKeyReleased(evt);
            }
        });

        jTableSubject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableSubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", null, null},
                {"", "", null, null, null, null, null, null},
                {"", "", null, null, null, null, null, null},
                {"", "", null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Copyrights", "Contributors", "Publisher", "ISBN", "Subject", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableSubject);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(searchBookSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBookSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
        );

        tab1.addTab("Search By Subject", jPanel6);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 27, 30));
        jLabel3.setText("Book Name: ");

        searchBookName.setForeground(new java.awt.Color(16, 27, 30));
        searchBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookNameActionPerformed(evt);
            }
        });
        searchBookName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBookNameKeyReleased(evt);
            }
        });

        jTableName.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", "", "", "", "", null, null},
                {"", "", null, null, null, null, null, null},
                {"", "", null, null, null, null, null, null},
                {"", "", null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "Book Title", "Copyright", "Contributors", "Publisher", "ISBN", "Subject", "Stocks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableName);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(searchBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        tab1.addTab("Search By Name", jPanel2);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 27, 30));
        jLabel7.setText("Book ID: ");

        searchBookID.setForeground(new java.awt.Color(16, 27, 30));
        searchBookID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchBookIDMouseReleased(evt);
            }
        });
        searchBookID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookIDActionPerformed(evt);
            }
        });
        searchBookID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBookIDKeyReleased(evt);
            }
        });

        desc.setEditable(false);
        desc.setForeground(new java.awt.Color(16, 27, 30));
        desc.setLineWrap(true);
        desc.setWrapStyleWord(true);
        jScrollPane3.setViewportView(desc);

        booktitle.setEditable(false);
        booktitle.setForeground(new java.awt.Color(16, 27, 30));
        booktitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booktitleActionPerformed(evt);
            }
        });

        label4.setForeground(new java.awt.Color(16, 27, 30));
        label4.setText("Book Title:");

        jLabel8.setForeground(new java.awt.Color(16, 27, 30));
        jLabel8.setText("Subject:");

        subject.setEditable(false);
        subject.setForeground(new java.awt.Color(16, 27, 30));
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(16, 27, 30));
        jLabel11.setText("Book Description:");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(searchBookID, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel11)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(booktitle)
                            .addComponent(subject))))
                .addGap(207, 207, 207))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label4)
                    .addComponent(booktitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        tab1.addTab("View Book Description", jPanel8);

        homePanel.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 1160, 500));
        tab1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
       System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void homePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_homePanelMousePressed

    private void homePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homePanelMouseDragged
       setLocation(getX()+ evt.getX() - mouseX, getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_homePanelMouseDragged

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         setVisible(false);
        F_Home ob = new F_Home();
        ob.setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void searchBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookNameActionPerformed

    private void searchBookIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookIDActionPerformed
         try{
          String text="SELECT bookID, title, copyright, contributors,\n" +
                " publisher, ISBN, subject , stocks\n" +
                " FROM Books WHERE subject like ?;" ; 
          preparedStatement =conn.prepareStatement(text);
          preparedStatement.setString(1, "%"+ searchBookSubject.getText() + "%");
          resultSet = preparedStatement.executeQuery();
          jTableSubject.setModel(DbUtils.resultSetToTableModel(resultSet));

         preparedStatement.close();
         resultSet.close();
          }
        catch(Exception ex){ex.printStackTrace();} 
                                           
    }//GEN-LAST:event_searchBookIDActionPerformed

    private void searchBookSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookSubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookSubjectActionPerformed

    private void booktitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booktitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booktitleActionPerformed

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectActionPerformed

    private void searchBookSubjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBookSubjectKeyReleased
        try{
          String text="SELECT bookID \"Book ID\", title \"Book Title\", copyright \"Copyrights\", contributors \"Contributors\" ,\n" +
           " publisher \"Publisher\", ISBN , subject \"Subject\" , stocks  \"Quantity\"\n" +
           " FROM Books WHERE subject like ?;" ; 
       preparedStatement =conn.prepareStatement(text);
       preparedStatement.setString(1, "%"+ searchBookSubject.getText() + "%");
       resultSet = preparedStatement.executeQuery();
       jTableSubject.setModel(DbUtils.resultSetToTableModel(resultSet));

        preparedStatement.close();
        resultSet.close();
    }
        catch(Exception ex){ex.printStackTrace();} 
    }//GEN-LAST:event_searchBookSubjectKeyReleased

    private void searchBookNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBookNameKeyReleased
        try{
          String text="SELECT bookID \"Book ID\", title \"Book Title\", copyright \"Copyrights\", contributors \"Contributors\" ,\n" +
            " publisher \"Publisher\", ISBN , subject \"Subject\" , stocks  \"Quantity\"\n" +
            " FROM Books WHERE title like ?;" ; 
         preparedStatement =conn.prepareStatement(text);
         preparedStatement.setString(1, "%"+ searchBookName.getText() + "%");
         resultSet = preparedStatement.executeQuery();
         jTableName.setModel(DbUtils.resultSetToTableModel(resultSet));

         preparedStatement.close();
         resultSet.close();
        }
        catch(Exception ex){ex.printStackTrace();} 
    
    }//GEN-LAST:event_searchBookNameKeyReleased

    private void searchBookIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBookIDMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBookIDMouseReleased

    private void searchBookIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBookIDKeyReleased
        try{
          String text="SELECT bookID \"Book ID\", title \"Book Title\", copyright \"Copyrights\",\n" +
            " subject \"Subject\" , stocks  \"Stocks\" ,description\n" +
            " FROM Books WHERE bookID = ? "; 
         preparedStatement =conn.prepareStatement(text);
         preparedStatement.setString(1, searchBookID.getText());
         resultSet = preparedStatement.executeQuery();
          
         if(resultSet.next()){
            booktitle.setText(resultSet.getString("Book Title"));
            subject.setText(resultSet.getString("Subject"));
            desc.setText(resultSet.getString("description"));

            preparedStatement.close();
            resultSet.close();
         }else {
            booktitle.setText("");
            subject.setText("");
            desc.setText("");
         }
        }
        catch(Exception ex){ex.printStackTrace();} 
    }//GEN-LAST:event_searchBookIDKeyReleased

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
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField booktitle;
    private javax.swing.JLabel close;
    private javax.swing.JTextArea desc;
    private javax.swing.JPanel homePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableName;
    private javax.swing.JTable jTableSubject;
    private javax.swing.JLabel label4;
    private javax.swing.JTextField searchBookID;
    private javax.swing.JTextField searchBookName;
    private javax.swing.JTextField searchBookSubject;
    private javax.swing.JTextField subject;
    private javax.swing.JTabbedPane tab1;
    // End of variables declaration//GEN-END:variables
}
