
package login_register_design;


import java.text.SimpleDateFormat;
import java.util.Date;
import Project.ConnectionProvider;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;


public class studentDetails extends javax.swing.JFrame {

    
    public studentDetails() {
        initComponents();
        jTextArea1.setEditable(false);
        SimpleDateFormat dFormate = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        jLabel4.setText(dFormate.format(date));
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 13, 51, 56));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Fill Up this form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 13, 301, 56));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Date :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 92, 45));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 140, 45));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/Back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1189, 13, -1, 69));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/Close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1291, 13, 63, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 89, 1366, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Roll number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 124, 130, 27));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 165, 108, 26));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Father Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 212, 108, 24));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Mother Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 256, -1, 28));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 302, 108, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Contact Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 350, -1, 29));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 406, 61, 27));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("10th");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 446, 61, 34));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("12th");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 488, 90, 27));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Graduation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 535, -1, 25));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 584, 86, 29));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 123, 300, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 164, 300, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 210, 300, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 256, 300, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Othors" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 303, 300, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 350, 300, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 405, 300, -1));

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(153, 153, 153));
        jTextField7.setText("Enter University Name");
        jTextField7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField7FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField7FocusLost(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 449, 300, -1));

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(153, 153, 153));
        jTextField8.setText("Enter Percentage");
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 446, 300, -1));

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(153, 153, 153));
        jTextField9.setText("Enter Passout Year");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 446, 300, -1));

        jTextField10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(153, 153, 153));
        jTextField10.setText("Enter University Name");
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 487, 300, -1));

        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(153, 153, 153));
        jTextField11.setText("Enter Percentage");
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 487, 300, -1));

        jTextField12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(153, 153, 153));
        jTextField12.setText("Enter Passout Year");
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 492, 300, -1));

        jTextField13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(153, 153, 153));
        jTextField13.setText("Enter University Name");
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 533, 300, -1));

        jTextField14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(153, 153, 153));
        jTextField14.setText("Enter Percentage");
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 533, 300, -1));

        jTextField15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(153, 153, 153));
        jTextField15.setText("Enter Passout Year");
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 538, 300, -1));

        jTextField16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 584, 1110, 50));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/save.png"))); // NOI18N
        jButton3.setText("Save & Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 677, 603, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Created By:\n   \n   Sakshi jadhao\n   Sayali Gahine \n   Pratiksha Bankar\n   Mahesh Kumar Gupta(Team leading)\n\nunder the guidance of:Utkarsh Upadhyay");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 123, 742, 310));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Employeee/icons/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1370, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to exit Application","Select", JOptionPane.YES_NO_OPTION);
        
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField7FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusGained
        // TODO add your handling code here:
        if(jTextField7.getText().equals("Enter University Name"))
        {
            jTextField7.setText("");
            jTextField7.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField7FocusGained

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        // TODO add your handling code here:\
        if(jTextField10.getText().equals("Enter University Name"))
        {
            jTextField10.setText("");
            jTextField10.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        // TODO add your handling code here:
        if(jTextField13.getText().equals("Enter University Name"))
        {
            jTextField13.setText("");
            jTextField13.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        // TODO add your handling code here:
         if(jTextField8.getText().equals("Enter Percentage"))
        {
            jTextField8.setText("");
            jTextField8.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        // TODO add your handling code here:
         if(jTextField11.getText().equals("Enter Percentage"))
        {
            jTextField11.setText("");
            jTextField11.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        // TODO add your handling code here:
         if(jTextField14.getText().equals("Enter Percentage"))
        {
            jTextField14.setText("");
            jTextField14.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        // TODO add your handling code here:
        if(jTextField9.getText().equals("Enter Passout Year"))
        {
            jTextField9.setText("");
            jTextField9.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        // TODO add your handling code here:
        if(jTextField12.getText().equals("Enter Passout Year"))
        {
            jTextField12.setText("");
            jTextField12.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField12FocusGained

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
        // TODO add your handling code here:
        if(jTextField15.getText().equals("Enter Passout Year"))
        {
            jTextField15.setText("");
            jTextField15.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField7FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField7FocusLost
        // TODO add your handling code here:
        if(jTextField7.getText().equals(""))
        {
            jTextField7.setText("Enter University Name");
            jTextField7.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField7FocusLost

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        // TODO add your handling code here:
        if(jTextField10.getText().equals(""))
        {
            jTextField10.setText("Enter University Name");
            jTextField10.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        // TODO add your handling code here:
        if(jTextField13.getText().equals(""))
        {
            jTextField13.setText("Enter University Name");
            jTextField13.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField13FocusLost

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        // TODO add your handling code here:
         if(jTextField8.getText().equals(""))
        {
            jTextField8.setText("Enter Percentage");
            jTextField8.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField8FocusLost

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        // TODO add your handling code here:
         if(jTextField11.getText().equals(""))
        {
            jTextField11.setText("Enter Percentage");
            jTextField11.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        // TODO add your handling code here:
         if(jTextField14.getText().equals(""))
        {
            jTextField14.setText("Enter Percentage");
            jTextField14.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        // TODO add your handling code here:
        if(jTextField9.getText().equals(""))
        {
            jTextField9.setText("Enter Passout Year");
            jTextField9.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
        // TODO add your handling code here:
        if(jTextField12.getText().equals(""))
        {
            jTextField12.setText("Enter Passout Year");
            jTextField12.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        // TODO add your handling code here:
        if(jTextField15.getText().equals(""))
        {
            jTextField15.setText("Enter Passout Year");
            jTextField15.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField15FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String rollNo = jTextField1.getText();
        String name = jTextField2.getText();
        String fatherName = jTextField3.getText();
        String motherName= jTextField4.getText();
        String gender = (String)jComboBox1.getSelectedItem();
        String contactNo = jTextField5.getText();
        String email = jTextField6.getText();
        String tenthUniversityName = jTextField7.getText();
        String tenthPercentage = jTextField8.getText();
        String tenthPassoutYear = jTextField9.getText();
        String twelveUniversityName = jTextField10.getText();
        String twelvePercentage = jTextField11.getText();
        String twelvePassoutYear = jTextField12.getText();
        String graduationUniversityName = jTextField13.getText();
        String graduationPercentage = jTextField14.getText();
        String graduationPassoutYear= jTextField15.getText();
        String address = jTextField16.getText();
        String marks= ("0");
        
        
        try
        {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?, ?,?, ?, ?, ?,?, ?, ?, ?,?, ?, ?, ?,?, ?)");
            
            ps.setString(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, fatherName);
            ps.setString(4, motherName);
            ps.setString(5, gender);
            ps.setString(6, contactNo);
            ps.setString(7, email);
            ps.setString(8, tenthUniversityName);
            ps.setString(9, tenthPercentage);
            ps.setString(10, tenthPassoutYear);
            ps.setString(11, twelveUniversityName);
            ps.setString(12, twelvePercentage);
            ps.setString(13, twelvePassoutYear);
            ps.setString(14, graduationUniversityName);
            ps.setString(15, graduationPercentage);
            ps.setString(16,graduationPassoutYear);
            ps.setString(17, address);
            ps.setString(18, marks);
            
            ps.executeUpdate();
            
            setVisible(false);
            new instructionStudent(rollNo).setVisible(true);
            
            
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}