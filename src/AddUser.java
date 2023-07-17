
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class AddUser extends javax.swing.JFrame {
    String loguserid;
        public AddUser(String loginuserid) {
        initComponents();
        this.loguserid=loginuserid;
    } 
    public AddUser() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        useridlable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressfield = new javax.swing.JTextArea();
        passwordlabel = new javax.swing.JLabel();
        namefield = new javax.swing.JTextField();
        pincodelabel = new javax.swing.JLabel();
        phonenofield = new javax.swing.JTextField();
        pincodefield = new javax.swing.JTextField();
        useridfield = new javax.swing.JTextField();
        cancelbutton = new javax.swing.JButton();
        submitbutton = new javax.swing.JButton();
        agelabel = new javax.swing.JLabel();
        agetextfield = new javax.swing.JTextField();
        reenterpasswordlabel = new javax.swing.JLabel();
        genderlabel = new javax.swing.JLabel();
        addresslabel = new javax.swing.JLabel();
        gendercombobox = new javax.swing.JComboBox();
        namelabel = new javax.swing.JLabel();
        rePasswordField = new javax.swing.JPasswordField();
        mailfield1 = new javax.swing.JTextField();
        phonenolabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        emaillabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        detaillabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 25, 112));

        useridlable.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        useridlable.setForeground(new java.awt.Color(240, 240, 240));
        useridlable.setText("                   USERID");

        addressfield.setColumns(20);
        addressfield.setRows(5);
        jScrollPane1.setViewportView(addressfield);

        passwordlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        passwordlabel.setForeground(new java.awt.Color(240, 240, 240));
        passwordlabel.setText("              PASSWORD");

        pincodelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        pincodelabel.setForeground(new java.awt.Color(240, 240, 240));
        pincodelabel.setText("                 PINCODE");

        cancelbutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        cancelbutton.setText("CANCEL");
        cancelbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        submitbutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        submitbutton.setText("SUBMIT");
        submitbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        agelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        agelabel.setForeground(new java.awt.Color(240, 240, 240));
        agelabel.setText("                        AGE");

        reenterpasswordlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        reenterpasswordlabel.setForeground(new java.awt.Color(240, 240, 240));
        reenterpasswordlabel.setText(" RE-ENTER PASSWORD");

        genderlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        genderlabel.setForeground(new java.awt.Color(240, 240, 240));
        genderlabel.setText("                GENDER");

        addresslabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        addresslabel.setForeground(new java.awt.Color(240, 240, 240));
        addresslabel.setText("                 ADDRESS");

        gendercombobox.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Female", "Male" }));

        namelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(240, 240, 240));
        namelabel.setText("                      NAME");

        phonenolabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        phonenolabel.setForeground(new java.awt.Color(240, 240, 240));
        phonenolabel.setText("        PHONE NUMBER");

        emaillabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        emaillabel.setForeground(new java.awt.Color(240, 240, 240));
        emaillabel.setText("                   E-MAIL");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 862, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        detaillabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        detaillabel.setForeground(new java.awt.Color(240, 240, 240));
        detaillabel.setText("ENTER USER DETAILS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(detaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 95, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(pincodelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addresslabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(14, 14, 14))
                                        .addComponent(emaillabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reenterpasswordlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(useridlable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(agelabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(namelabel)
                                        .addComponent(phonenolabel))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(genderlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(useridfield)
                                    .addComponent(PasswordField)
                                    .addComponent(rePasswordField)
                                    .addComponent(phonenofield)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                    .addComponent(pincodefield)
                                    .addComponent(agetextfield)
                                    .addComponent(mailfield1)
                                    .addComponent(gendercombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namefield, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(108, 108, 108)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(detaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namefield, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phonenofield, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(useridfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(agetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reenterpasswordlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mailfield1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emaillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(phonenolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(useridlable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passwordlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(154, 154, 154))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addresslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pincodefield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pincodelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
            dispose();
            menuform menuformobj=new menuform(loguserid);
            menuformobj.setVisible(true);
    }//GEN-LAST:event_cancelbuttonActionPerformed
    private void clearField()
    {
        namefield.setText(null);
        useridfield.setText(null);
        addressfield.setText(null);
        agetextfield.setText(null);
        phonenofield.setText(null);
        mailfield1.setText(null);
        PasswordField.setText(null);
        pincodefield.setText(null);
        rePasswordField.setText(null);
    }
    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed
        if(evt.getSource()==submitbutton)
        {
            try {
                String pnostr=phonenofield.getText();
                String mailstr=mailfield1.getText();
                String namestr=namefield.getText();
                String useridstr=useridfield.getText();
                String addstr=addressfield.getText();
                String agestr=agetextfield.getText();
                String passtr=PasswordField.getText();
                String cpasstr=rePasswordField.getText();
                String pincode=pincodefield.getText();
                //Creating Connection Object
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");

                PreparedStatement Pstatement=conn.prepareStatement("insert into userinfo values(?,?,?,?,?,?,?,?,?)");
                //Specifying the values of it's parameter
                Pstatement.setString(1,namefield.getText());
                Pstatement.setString(2,useridfield.getText());
                Pstatement.setString(3,addressfield.getText());
                Pstatement.setString(4, agetextfield.getText());
                Pstatement.setString(5,(String) gendercombobox.getSelectedItem());
                Pstatement.setString(6,phonenofield.getText());
                Pstatement.setString(7,mailfield1.getText());
                Pstatement.setString(8,PasswordField.getText());
                Pstatement.setString(9,pincodefield.getText());
                Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");
                PreparedStatement ps1 = conn1.prepareStatement("select * from userinfo where userid=? ");
                ps1.setString(1,useridstr);
                ResultSet rs = ps1.executeQuery();
                if(rs.next())      
                {
                    JOptionPane.showMessageDialog(null,"THIS USERID IS ALREADY REGISTERED"+"\nSELECT ANOTHER USERID ");
                    useridfield.setText(null);
                }
                else
                {
                    if(!(pnostr.isEmpty() || mailstr.isEmpty() || useridstr.isEmpty() || addstr.isEmpty() || agestr.isEmpty() || passtr.isEmpty() ||cpasstr.isEmpty() || pincode.isEmpty() ))
                    {
                        if(PasswordField.getText().equalsIgnoreCase(rePasswordField.getText()))
                        {
                            if (pnostr.length()==10) 
                            {
                                if(mailstr.contains("@"))
                                {
                                    if(pincode.length()==6)
                                    {
                                        Pstatement.executeUpdate();
                                        JOptionPane.showMessageDialog(null,"REGISTERED SUCCESSFULL");
                                        clearField();
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null,"ENTER A VALID PINCODE","Failed",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null,"ENTER A VALID EMAIL ID","Failed",JOptionPane.ERROR_MESSAGE);
                                }
                            }   
                            else
                            {
                                JOptionPane.showMessageDialog(null,"ENTER A VALID PHONE NUMBER","Failed",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"PASSWORD DOSEN'T MATCH");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"ONE OR MORE FIELD IS EMPTY","Failed",JOptionPane.ERROR_MESSAGE);
                    }
                }
                

            } catch (SQLException e1) {
                JOptionPane.showMessageDialog(null,"CANT REGISTER ","Failed",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_submitbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextArea addressfield;
    private javax.swing.JLabel addresslabel;
    private javax.swing.JLabel agelabel;
    private javax.swing.JTextField agetextfield;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel detaillabel;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JComboBox gendercombobox;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mailfield1;
    private javax.swing.JTextField namefield;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JTextField phonenofield;
    private javax.swing.JLabel phonenolabel;
    private javax.swing.JTextField pincodefield;
    private javax.swing.JLabel pincodelabel;
    private javax.swing.JPasswordField rePasswordField;
    private javax.swing.JLabel reenterpasswordlabel;
    private javax.swing.JButton submitbutton;
    private javax.swing.JTextField useridfield;
    private javax.swing.JLabel useridlable;
    // End of variables declaration//GEN-END:variables
}
