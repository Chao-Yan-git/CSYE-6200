/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import daycare.Classroom;
import daycare.Student;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenyifan
 */
public class DetailedClassroom extends javax.swing.JPanel {

    /**
     * Creates new form DetailedClassroom
     */
     private Classroom classroom;
    //private List<Student> students;
    JPanel panel1;
    
    public DetailedClassroom(JPanel a,Classroom classroom) throws IOException {
        initComponents();
        this.panel1 = a;
        this.classroom = classroom;
        jLabel1.setText(classroom.getTeacher().getName());
        btnImage();
        populateTable();
        
    }
    private void btnImage(){
    ImageIcon imageIcon = new ImageIcon("./image/classroom.jpg");
    jButton2.setIcon(imageIcon);
}
     public void populateTable() throws IOException
{
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
    dtm.setRowCount(0);
    List<Student> students = classroom.getStudents();
   for(Student student:students){
       //System.out.println(rule);
       Object row[] =new Object[4];
       row[0] =student;
       row[1] =student.getAge();
       row[2]= student.getGpa();
       row[3]= student.getDate();
       //row[3]= student.getClass();
       dtm.addRow(row);
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student", "Age", "GPA", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Teacher's Name");

        jButton1.setText("Check Student's Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Teacher");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(95, 95, 95)
                .addComponent(jButton2)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int selectedRow = jTable1.getSelectedRow();
         if(selectedRow>=0){
            Student c = (Student)jTable1.getValueAt(selectedRow, 0);
            
            DetailedStudent  panel2 = new DetailedStudent(panel1,c);
            
            panel1.add("StudentPanel", panel2);
            CardLayout layout = (CardLayout) panel1.getLayout();
            layout.next(panel1);    
         }else{
             JOptionPane.showMessageDialog(null,"please select any row");
         }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
