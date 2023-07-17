
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
public class bookticketform extends javax.swing.JFrame {
    public bookticketform() {
        initComponents();
    }
    Connection conn=null;
    String loguserid;
    String busno;
     public bookticketform(String loginuserid,String busnumber) {
        initComponents();
        this.loguserid=loginuserid;
        this.busno=busnumber;
         try
            {   
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");
                PreparedStatement ps = conn.prepareStatement("select * from businfo1 where busno=?");
                ps.setString(1,busno);
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {
                   busnofield.setText(rs.getString(1));
                  busnamefield.setText(rs.getString(2));
                  destinationfield.setText(rs.getString(6));
                  sourcefield.setText(rs.getString(5));
                  busmodefield.setText(rs.getString(7));
                  busfairtextfield.setText(rs.getString(8));
                  departuretimefield.setText(rs.getString(9));
                }
                
            }
        catch(SQLException ex)
        {
            dispose();
            System.err.println ("error");
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bookticketlabel = new javax.swing.JLabel();
        busnolabel = new javax.swing.JLabel();
        agelabel = new javax.swing.JLabel();
        genderlabel = new javax.swing.JLabel();
        gendercombobox = new javax.swing.JComboBox();
        phnolabel = new javax.swing.JLabel();
        phnotextfield = new javax.swing.JTextField();
        jfromlabel = new javax.swing.JLabel();
        jtolabel = new javax.swing.JLabel();
        busmodelabel = new javax.swing.JLabel();
        ticketfairlabel = new javax.swing.JLabel();
        busfairtextfield = new javax.swing.JTextField();
        paybutton = new javax.swing.JButton();
        cancelbutton = new javax.swing.JButton();
        busnofield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        busnamefield = new javax.swing.JTextField();
        sourcefield = new javax.swing.JTextField();
        busnofield3 = new javax.swing.JTextField();
        destinationfield = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        busmodefield = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        passengernamefield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        seatcombo = new javax.swing.JComboBox();
        timelable = new javax.swing.JLabel();
        departuretimefield = new javax.swing.JTextField();
        datelable = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 25, 112));

        jPanel1.setBackground(new java.awt.Color(25, 25, 112));

        bookticketlabel.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        bookticketlabel.setForeground(new java.awt.Color(240, 240, 240));
        bookticketlabel.setText("BOOK TICKET");

        busnolabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        busnolabel.setForeground(new java.awt.Color(240, 240, 240));
        busnolabel.setText("BUS NUMBER");

        agelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        agelabel.setForeground(new java.awt.Color(240, 240, 240));
        agelabel.setText("PASSENGER NAME");
        agelabel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                agelabelComponentHidden(evt);
            }
        });

        genderlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        genderlabel.setForeground(new java.awt.Color(240, 240, 240));
        genderlabel.setText("GENDER");

        gendercombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        phnolabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        phnolabel.setForeground(new java.awt.Color(240, 240, 240));
        phnolabel.setText("PHONE NUMBER");

        jfromlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jfromlabel.setForeground(new java.awt.Color(240, 240, 240));
        jfromlabel.setText("JOURNEY FROM");

        jtolabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jtolabel.setForeground(new java.awt.Color(240, 240, 240));
        jtolabel.setText("JOURNEY TO");

        busmodelabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        busmodelabel.setForeground(new java.awt.Color(240, 240, 240));
        busmodelabel.setText("BUS MODE");

        ticketfairlabel.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        ticketfairlabel.setForeground(new java.awt.Color(240, 240, 240));
        ticketfairlabel.setText("BUS FAIR");

        busfairtextfield.setEditable(false);

        paybutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        paybutton.setText("GO TO PAYMENT");
        paybutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybuttonActionPerformed(evt);
            }
        });

        cancelbutton.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        cancelbutton.setText("CANCEL");
        cancelbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbuttonActionPerformed(evt);
            }
        });

        busnofield.setEditable(false);

        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() | java.awt.Font.ITALIC), jLabel1.getFont().getSize()+5));
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("BUS NAME");

        busnamefield.setEditable(false);

        sourcefield.setEditable(false);

        busnofield3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busnofield3ActionPerformed(evt);
            }
        });

        destinationfield.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        busmodefield.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("SELECT SEAT");

        seatcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        timelable.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        timelable.setForeground(new java.awt.Color(240, 240, 240));
        timelable.setText("DEPARTURE TIME");

        departuretimefield.setEditable(false);

        datelable.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        datelable.setForeground(new java.awt.Color(240, 240, 240));
        datelable.setText("JOURNEY DATE(dd-mm-yyyy)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(busnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jfromlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketfairlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timelable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sourcefield, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(busnofield, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(busfairtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(140, 140, 140)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(busmodelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jtolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(busnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busnofield3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(destinationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(busmodefield, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(departuretimefield, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(172, 172, 172))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(bookticketlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passengernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(562, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(paybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191)
                                .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(datelable, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bookticketlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(busnofield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(busnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(busnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jfromlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sourcefield, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinationfield, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(busnofield3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busfairtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticketfairlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(busmodelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(busmodefield, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(departuretimefield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timelable, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengernamefield, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phnotextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phnolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(datelable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paybutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static boolean validateJavaDate(String strDate)
   {
	/* Check if date is 'null' */
	if (strDate.trim().equals(""))
	{
	    return true;
	}
	else
	{
	    SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy-mm-dd");
	    sdfrmt.setLenient(false);
	    try
	    {
	        Date javaDate = sdfrmt.parse(strDate); 
	        System.out.println(strDate+" is valid date format");
	    }
	    catch (ParseException e)
	    {
	        System.out.println(strDate+" is Invalid Date format");
	        return false;
	    }
	    return true;
	}
   }
   private String getTicketid()
   {
       int num1;
                String q1="";
                num1=1234+(int)(Math.random()*36+55);
                q1+=num1+1234;
                String ticketid=q1;
                return ticketid;
   }
    private void busnofield3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busnofield3ActionPerformed
        
    }//GEN-LAST:event_busnofield3ActionPerformed
    private void clearField()
    {
        passengernamefield.setText(null);
        phnotextfield.setText(null);
    }
    
    private void agelabelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_agelabelComponentHidden
        
    }//GEN-LAST:event_agelabelComponentHidden

    private void cancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbuttonActionPerformed
            dispose();
            SearchBus SearchBusobj=new SearchBus(loguserid);
            SearchBusobj.setVisible(true);
    }//GEN-LAST:event_cancelbuttonActionPerformed

    private void paybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybuttonActionPerformed
                String busno=busnofield.getText();
                String busname=busnamefield.getText();
                String destination=destinationfield.getText();
                String source=sourcefield.getText();
                String busmode=busmodefield.getText();
                int busfair = Integer.parseInt(busfairtextfield.getText());
                String departuretime= departuretimefield.getText();
                String ticketid1=getTicketid();
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                String date1=sdf.format(jCalendar1.getDate());
                String passname=passengernamefield.getText();
                String seatno= (String) seatcombo.getSelectedItem();
                String phoneno=phnotextfield.getText();
                String gender=(String) gendercombobox.getSelectedItem();
                try
                {
                        if(!(passname.isEmpty()||phoneno.isEmpty()))
                        {
                            if(phoneno.length()==10)
                            {
                                if(validateJavaDate(date1))
                                {
                                    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");
                                    PreparedStatement ps = conn.prepareStatement("select * from ticketinfo3 where busno=? and seatno=? and journeydate=?");
                                    ps.setString(1,busno);
                                    ps.setString(2,seatno);
                                    ps.setString(3,date1);
                                    ResultSet rs = ps.executeQuery();
                                    if(rs.next())
                                    {
                                        JOptionPane.showMessageDialog(null,"THIS SEAT IS ALREADY BOOKED"+"\nSELECT ANOTHER SEAT ");
                                    }
                                    else
                                    {
                                        Connection conn1=DriverManager.getConnection("jdbc:mysql://localhost:3306/busapp","root", "root123");
                                        PreparedStatement ps1 = conn1.prepareStatement("select * from ticketinfo3 where ticketid=?");
                                        ps1.setString(1,ticketid1);
                                        ResultSet rs1 = ps1.executeQuery();
                                        while(rs1.next())
                                        {
                                            ticketid1=ticketid1+1;
                                            System.out.println(ticketid1);
                                        }
                                        dispose();
                                        BillingFrame BillingFrameobj= new BillingFrame(ticketid1,loguserid,busname,busno,passname,source,destination
                                        ,busmode,departuretime,seatno,phoneno,gender,date1,busfair);
                                        BillingFrameobj.setVisible(true);
                                    }
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(null,"INVALID DATE","Failed",JOptionPane.ERROR_MESSAGE);
                                }
                            
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"ENTER A VALID PHONE NUMBER","Failed",JOptionPane.ERROR_MESSAGE);
                            } 
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"ONE OR MORE FIELD IS EMPTY","Failed",JOptionPane.ERROR_MESSAGE);
                        }   
                }
                catch(SQLException ex)
                { 
                    JOptionPane.showMessageDialog(null,"ENTER VALID DATA ","Failed",JOptionPane.ERROR_MESSAGE);
                    System.err.println ("error");
                }           
    }//GEN-LAST:event_paybuttonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bookticketform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookticketform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookticketform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookticketform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookticketform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agelabel;
    private javax.swing.JLabel bookticketlabel;
    private javax.swing.JTextField busfairtextfield;
    private javax.swing.JTextField busmodefield;
    private javax.swing.JLabel busmodelabel;
    private javax.swing.JTextField busnamefield;
    private javax.swing.JTextField busnofield;
    private javax.swing.JTextField busnofield3;
    private javax.swing.JLabel busnolabel;
    private javax.swing.JButton cancelbutton;
    private javax.swing.JLabel datelable;
    private javax.swing.JTextField departuretimefield;
    private javax.swing.JTextField destinationfield;
    private javax.swing.JComboBox gendercombobox;
    private javax.swing.JLabel genderlabel;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jfromlabel;
    private javax.swing.JLabel jtolabel;
    private javax.swing.JTextField passengernamefield;
    private javax.swing.JButton paybutton;
    private javax.swing.JLabel phnolabel;
    private javax.swing.JTextField phnotextfield;
    private javax.swing.JComboBox seatcombo;
    private javax.swing.JTextField sourcefield;
    private javax.swing.JLabel ticketfairlabel;
    private javax.swing.JLabel timelable;
    // End of variables declaration//GEN-END:variables
}
