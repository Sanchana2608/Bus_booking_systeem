
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
public class DisplayAvailableBus extends javax.swing.JFrame {
    String loguserid;
    String journeyfrom1;
    String journeyto1;
    Connection conn=null;
    public DisplayAvailableBus(String loginuserid,String from,String to) 
    {
        initComponents();
        this.loguserid=loginuserid;
        this.journeyfrom1=from;
        this.journeyto1=to;
         try
            {   
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");
                PreparedStatement ps = conn.prepareStatement("select * from businfo1 where journeyfrom=? and journeyto=?");
                ps.setString(1,journeyfrom1);
                ps.setString(2,journeyto1);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                    String busno=String.valueOf(rs.getInt("busno"));
                    String busname=rs.getString("busname");
                    String driver=rs.getString("driver");
                    String capacity=rs.getString("capacity");
                    String journeyfrom=rs.getString("journeyfrom");
                    String journeyto=rs.getString("journeyto"); 
                    String busmode=rs.getString("busmode");
                    String busfair=rs.getString("busfair");
                    String departuretime=rs.getString("departuretime");
                    String tbData[]={busno,busname,driver,capacity,journeyfrom,journeyto,busmode,busfair,departuretime};
                    DefaultTableModel tblModel = (DefaultTableModel)bustable.getModel();
                    tblModel.addRow(tbData);
                }
                PreparedStatement ps1 = conn.prepareStatement("select busno from businfo1");
                ResultSet rs1 = ps.executeQuery();
                while(rs1.next())
                {
                        busnocombo.addItem(rs1.getString("busno"));
                }
                
            }
        catch(SQLException ex)
        {
            dispose();
            System.err.println ("error");
        } 
    }
    public DisplayAvailableBus() {initComponents(); }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bustable = new javax.swing.JTable();
        selectlable = new javax.swing.JLabel();
        busnocombo = new javax.swing.JComboBox();
        continuebutton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 25, 112));

        jPanel2.setBackground(new java.awt.Color(25, 25, 112));

        bustable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "busno", "busname", "driver", "capacity", "journeyfrom", "journeyto", "busmode", "busfair", "departuretime"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bustable);

        selectlable.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        selectlable.setForeground(new java.awt.Color(240, 240, 240));
        selectlable.setText("SELECT BUS NUMBER");

        busnocombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busnocomboActionPerformed(evt);
            }
        });

        continuebutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        continuebutton.setText("CONTINUE");
        continuebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuebuttonActionPerformed(evt);
            }
        });

        backbutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(selectlable, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(busnocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(continuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 269, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectlable, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(busnocombo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void continuebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuebuttonActionPerformed
             dispose();
             String busno=(String)busnocombo.getSelectedItem();
            bookticketform bookticketformobj=new bookticketform(loguserid,busno);
            bookticketformobj.setVisible(true);
    }//GEN-LAST:event_continuebuttonActionPerformed
    private void busnocomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busnocomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busnocomboActionPerformed
    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
              dispose();
              
            SearchBus SearchBusobj=new SearchBus(loguserid);
            SearchBusobj.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayAvailableBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAvailableBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAvailableBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAvailableBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAvailableBus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox busnocombo;
    private javax.swing.JTable bustable;
    private javax.swing.JButton continuebutton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel selectlable;
    // End of variables declaration//GEN-END:variables
}
