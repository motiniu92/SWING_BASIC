package com.coderbd.evidence;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class FormValidation extends javax.swing.JFrame {

    String ex;

    /**
     * Creates new form FormValidation
     */
    public FormValidation() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtE = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rM = new javax.swing.JRadioButton();
        rF = new javax.swing.JRadioButton();
        cH = new javax.swing.JCheckBox();
        cJ = new javax.swing.JCheckBox();
        cS = new javax.swing.JCheckBox();
        cmbR = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taMsg = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnCF = new javax.swing.JButton();
        btnCT = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnRFF = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDis = new javax.swing.JTable();
        lblMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Student Information");

        jLabel2.setText("Id");

        txtId.setText("0");

        jLabel3.setText("Name");

        jLabel4.setText("Age");

        txtA.setText("0");

        jLabel5.setText("Email");

        jLabel6.setText("Gender");

        jLabel7.setText("C.Course");

        jLabel8.setText("Round");

        jLabel9.setText("Comments");

        buttonGroup1.add(rM);
        rM.setText("Male");

        buttonGroup1.add(rF);
        rF.setText("Female");

        cH.setText("Html");

        cJ.setText("Java");

        cS.setText("Swing");

        cmbR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Round", "Round-37", "Round-39", "Round-40" }));

        taMsg.setColumns(20);
        taMsg.setRows(5);
        jScrollPane1.setViewportView(taMsg);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCF.setText("Clear Form");
        btnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFActionPerformed(evt);
            }
        });

        btnCT.setText("Clear Table");
        btnCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTActionPerformed(evt);
            }
        });

        btnE.setText("Exit");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnRFF.setText("Read From File");
        btnRFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRFFActionPerformed(evt);
            }
        });

        tblDis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Age", "Email", "Gender", "C.Course", "Round", "Comments"
            }
        ));
        jScrollPane2.setViewportView(tblDis);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnRFF)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCF))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cH, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cJ, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cmbR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rM, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rF, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cH)
                            .addComponent(cJ)
                            .addComponent(cS))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmbR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rM)
                            .addComponent(rF))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnCF))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCT)
                    .addComponent(btnE))
                .addGap(18, 18, 18)
                .addComponent(btnRFF)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public boolean cE(String email) {
        int atpos = email.indexOf("@");
        int dotpos = email.lastIndexOf(".");
        if (atpos > 1 && (dotpos - atpos) > 2 && dotpos < email.length()) {
            return true;
        } else {
            return false;
        }
    }


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        //id
        if (txtId.getText().trim().length() < 5) {
            JOptionPane.showMessageDialog(null, "Enter your Id number");
            //name
        } else if (txtN.getText().trim().length() < 4) {
            JOptionPane.showMessageDialog(null, "Enter your name");

            //age
        } else if (Integer.parseInt(txtA.getText()) < 18 || Integer.parseInt(txtA.getText()) > 100) {
            JOptionPane.showMessageDialog(null, "Enter your Age between 18 to 100");

            //email
        } else if (!cE(txtE.getText()) || txtE.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(null, "Enter your email");

            //gen
        } else if (rM.isSelected() == false && rF.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Select your Gender");

            //cour
        } else if (!cH.isSelected() && !cJ.isSelected() && !cS.isSelected()) {
            JOptionPane.showMessageDialog(null, "Select your course");

            //round
        } else if (cmbR.getItemAt(cmbR.getSelectedIndex()).trim().equalsIgnoreCase("Select A Round")) {
            JOptionPane.showMessageDialog(null, "Select your round");

            //comm 
        } else if (taMsg.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "At least 10 characters");

        } else {
            int id = Integer.parseInt(txtId.getText());
            String name = txtN.getText();
            int age = Integer.parseInt(txtA.getText());
            String email = txtE.getText();

            String gender = "";
            if (rM.isSelected()) {
                gender = rM.getText();
            }
            if (rF.isSelected()) {
                gender = rF.getText();
            }

            String course = "";
            if (cH.isSelected()) {
                course += " " + cH.getText();
            }
            if (cJ.isSelected()) {
                course += " " + cJ.getText();
            }
            if (cS.isSelected()) {
                course += " " + cS.getText();
            }

            String round = cmbR.getItemAt(cmbR.getSelectedIndex());
            String comments = taMsg.getText();

            String rs = id + "\n" + name + "\n" + age + "\n" + email + "\n" + gender + "\n" + course + "\n" + round + "\n" + comments;
            System.out.println(rs);

            DefaultTableModel model = (DefaultTableModel) tblDis.getModel();
            Object[] row = new Object[8];
            row[0] = id;
            row[1] = name;
            row[2] = age;
            row[3] = email;
            row[4] = gender;
            row[5] = course;
            row[6] = round;
            row[7] = comments;
            model.addRow(row);

           Student s = new Student(id, name, age, email, gender, course, round, comments);
        List<Student> list = new ArrayList<>();
        list.add(s);
        try {
            Utils.writeToFile("Abdul Motin", list);
        } catch (Exception e) {
            Logger.getLogger(FormValidation.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblMsg.setText("Successfully Added into Table and write to File");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCFActionPerformed
        // TODO add your handling code here:
        txtId.setText("0");
        txtN.setText("");
        txtA.setText("0");
        txtE.setText("");
        buttonGroup1.clearSelection();
        cH.setSelected(false);
        cJ.setSelected(false);
        cS.setSelected(false);
        cmbR.setSelectedIndex(0);
        taMsg.setText("");


    }//GEN-LAST:event_btnCFActionPerformed

    private void btnCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tblDis.getModel();
        model.setRowCount(0);

    }//GEN-LAST:event_btnCTActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnEActionPerformed

    private void btnRFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRFFActionPerformed
        // TODO add your handling code here:
        String columns[]={"Id","Name","Age","Email","Gender","Course","Round","Comment"};  
       DefaultTableModel tableModel;
       tableModel=new DefaultTableModel(0, 8);
       tableModel.setColumnIdentifiers(columns);
       tblDis.setModel(tableModel);
        Utils.displayStudentDataFromFile("Abdul Motin",tableModel);
    }//GEN-LAST:event_btnRFFActionPerformed

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
            java.util.logging.Logger.getLogger(FormValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormValidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormValidation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCF;
    private javax.swing.JButton btnCT;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnRFF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cH;
    private javax.swing.JCheckBox cJ;
    private javax.swing.JCheckBox cS;
    private javax.swing.JComboBox<String> cmbR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JRadioButton rF;
    private javax.swing.JRadioButton rM;
    private javax.swing.JTextArea taMsg;
    private javax.swing.JTable tblDis;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtE;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}
