/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import daycare.Student;
import daycare.Teacher;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenyifan
 */
public class TeacherPanel extends javax.swing.JPanel {

    /**
     * Creates new form TeacherPanel
     */
    private List<Teacher> teachers;
    JPanel panel1;
    
    public TeacherPanel(JPanel a,List<Teacher> teachers) throws IOException {
        initComponents();
        this.teachers = teachers;
        this.panel1=a;
        
        populateTable();    
    }
    
     public void populateTable() throws IOException
{
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
    dtm.setRowCount(0);
   for(Teacher teacher:teachers){
       //System.out.println(rule);
       Object row[] =new Object[4];
       row[0] =teacher;
       row[1] = teacher.getAge();
       row[2]= teacher.getCredits();
       row[3]=teacher.getTime();
       //row[3]= student.getClass();
       dtm.addRow(row);
   }
}
//    public void paintComponent(Graphics g){
//    ImageIcon icon;
//    Image image;
//    icon = new ImageIcon(getClass().getResource("./image/teacher.jpg"));
//    
//    image = icon.getImage();
//    super.paintComponent(g);
//    g.drawImage(image, 0, 0,this.getWidth(), this.getHeight(), this);
//    
//}

   
       



 
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
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Teacher", "Age", "Credit", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add teacher");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jButton1)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 AddTeacherPanel  panel2 = new AddTeacherPanel(panel1,teachers);
            
            panel1.add("StudentPanel", panel2);
            CardLayout layout = (CardLayout) panel1.getLayout();
            layout.next(panel1);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
