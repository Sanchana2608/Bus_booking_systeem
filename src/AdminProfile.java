
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class AdminProfile extends javax.swing.JFrame {
    Connection conn=null;
    String loguserid;
    public AdminProfile() {initComponents();}
    public AdminProfile(String loginuserid) {
        initComponents();
        this.loguserid=loginuserid;
        try
        {
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");
               PreparedStatement ps = conn.prepareStatement("select * from admininfo where userid=?");
               ps.setString(1,loguserid);
               ResultSet rs = ps.executeQuery();
               while(rs.next())
               {
                  nametextfield.setText(rs.getString(1));
                  useridfield.setText(rs.getString(2));
                  addresstextfield.setText(rs.getString(3));
                  agetextfield.setText(rs.getString(4));
                  gendertextfield.setText(rs.getString(5));
                  phnotextfield.setText(rs.getString(6));
                  emailtextfield.setText(rs.getString(7));
                  pincodetextfield.setText(rs.getString(9));
                }
               
        }
        catch(SQLException ex)
        {
            dispose();
            System.err.println ("Cannot connect to database server");
        } 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        profilelabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        nametextfield = new javax.swing.JTextField();
        agelabel = new javax.swing.JLabel();
        agetextfield = new javax.swing.JTextField();
        useridlable = new javax.swing.JLabel();
        useridfield = new javax.swing.JTextField();
        gendertextfield = new javax.swing.JTextField();
        genderlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresstextfield = new javax.swing.JTextArea();
        addresslabel = new javax.swing.JLabel();
        pincodetextfield = new javax.swing.JTextField();
        pincodelabel = new javax.swing.JLabel();
        phnolabel = new javax.swing.JLabel();
        phnotextfield = new javax.swing.JTextField();
        emailidlabel = new javax.swing.JLabel();
        emailtextfield = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(25, 25, 112));

        profilelabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        profilelabel.setForeground(new java.awt.Color(240, 240, 240));
        profilelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilelabel.setText("PROFILE");
        profilelabel.setToolTipText("");
        profilelabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        namelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(240, 240, 240));
        namelabel.setText("NAME");

        nametextfield.setEditable(false);

        agelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        agelabel.setForeground(new java.awt.Color(240, 240, 240));
        agelabel.setText("AGE");

        agetextfield.setEditable(false);

        useridlable.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        useridlable.setForeground(new java.awt.Color(240, 240, 240));
        useridlable.setText("USER ID");

        useridfield.setEditable(false);

        gendertextfield.setEditable(false);

        genderlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        genderlabel.setForeground(new java.awt.Color(240, 240, 240));
        genderlabel.setText("GENDER");

        addresstextfield.setEditable(false);
        addresstextfield.setColumns(20);
        addresstextfield.setRows(5);
        jScrollPane1.setViewportView(addresstextfield);

        addresslabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addresslabel.setForeground(new java.awt.Color(240, 240, 240));
        addresslabel.setText("ADDRESS");

        pincodetextfield.setEditable(false);

        pincodelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pincodelabel.setForeground(new java.awt.Color(240, 240, 240));
        pincodelabel.setText("PINCODE");

        phnolabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        phnolabel.setForeground(new java.awt.Color(240, 240, 240));
        phnolabel.setText("PHONE NUMBER");

        phnotextfield.setEditable(false);

        emailidlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        emailidlabel.setForeground(new java.awt.Color(240, 240, 240));
        emailidlabel.setText("E-MAIL ID");

        emailtextfield.setEditable(false);

        backbutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        backbutton.setText("BACK");
        backbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phnolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(namelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(useridlable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genderlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addresslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pincodelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailidlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(useridfield)
                            .addComponent(gendertextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(agetextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nametextfield, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pincodetextfield)
                            .addComponent(phnotextfield)
                            .addComponent(emailtextfield)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(profilelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profilelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(nametextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useridlable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(useridfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(gendertextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pincodelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pincodetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailidlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        dispose();
        menuform menuformobj=new menuform(loguserid);
        menuformobj.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslabel;
    private javax.swing.JTextArea addresstextfield;
    private javax.swing.JLabel agelabel;
    private javax.swing.JTextField agetextfield;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel emailidlabel;
    private javax.swing.JTextField emailtextfield;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JTextField gendertextfield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametextfield;
    private javax.swing.JLabel phnolabel;
    private javax.swing.JTextField phnotextfield;
    private javax.swing.JLabel pincodelabel;
    private javax.swing.JTextField pincodetextfield;
    private javax.swing.JLabel profilelabel;
    private javax.swing.JTextField useridfield;
    private javax.swing.JLabel useridlable;
    // End of variables declaration//GEN-END:variables
}
