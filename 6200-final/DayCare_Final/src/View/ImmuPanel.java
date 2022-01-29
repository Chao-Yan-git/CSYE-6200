/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import daycare.Immu;
import daycare.Student;
import daycare.StudentFactory;
import daycare.StudentImmu;
import daycare.StudentImmuFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chenyifan
 */
public class ImmuPanel extends javax.swing.JPanel {

    /**
     * Creates new form ImmuPanel
     */
    private Student student;
    JPanel panel1;
   public List<StudentImmu> studentimmus;
    public ImmuPanel(JPanel a,Student student) throws IOException {
        initComponents();
        this.panel1=a;
        this.student = student;
        btnImage();
        StudentImmuFactory studentimmuFactory = new StudentImmuFactory();
	   studentimmus = studentimmuFactory.createPerson("StuImmu1.csv");
             
	        for(StudentImmu immu: studentimmus) {
	            StudentImmu curstudent = immu;
	            System.out.println(curstudent);

	        } 
        //List<Immu> immus =student.getStudentImmu();
        populateTable();
        int i1 =0;
        int i2=0;
        int i3=0;
        int i4 =0;
        int i5=0;
        int i6=0;
       
        if(student.getAge()<=24 && student.getAge()>=0){
            List<String> s = new ArrayList<>();
        s.add("Hib");
        s.add("DTaP");
        s.add("Polio");
        s.add("Hepatitis B");
        s.add("MMR");
        s.add("Varicella");
             for(StudentImmu immu:studentimmus){
                 if(immu.getStuName().equals(student.getName())){
                 if(immu.getName().equals("Hib")){
                     s.remove("Hib");
                 }
                      if(immu.getName().equals( "DTaP")){
                          i1+=1;
                       if(i1>=4){
                     
                        s.remove("DTap");
                       }
                     }
                    if(immu.getName().equals( "Polio" )){
                        i2+=1;
                        System.out.println(i2);
                        if(i2>=3){
                        s.remove("Polio");
                        }
                     } 
                      if(immu.getName().equals( "Hepatitis B") ){
                          i3+=1;
                          if(i3>=3){
                        s.remove("Hepatitis B");
                          }
                     }
                      if(immu.getName().equals( "MMR")){
                          
                        s.remove("MMR");
                     }
                      if(immu.getName().equals("Varicella") ){
                        s.remove("Varicella");
                     }
                 }
             }
             for(String ss:s){
                  JOptionPane.showMessageDialog(null,"you need to take "+ss);
             }
             
        }
        if(student.getAge()<=72 && student.getAge()>24){
            List<String> s = new ArrayList<>();
        //s.add("Hib");
        s.add("DTaP");
        s.add("Polio");
        s.add("Hepatitis B");
        s.add("MMR");
        s.add("Varicella");
             for(StudentImmu immu:studentimmus){
                 if(immu.getStuName().equals(student.getName())){
//                 if(immu.getName().equals("Hib")){
//                     s.remove("Hib");
//                 }
                      if(immu.getName().equals( "DTaP")){
                          i1+=1;
                       if(i1>=5){
                     
                        s.remove("DTap");
                       }
                     }
                    if(immu.getName().equals( "Polio" )){
                        i2+=1;
                        System.out.println(i2);
                        if(i2>=4){
                        s.remove("Polio");
                        }
                     } 
                      if(immu.getName().equals( "Hepatitis B") ){
                          i3+=1;
                          if(i3>=3){
                        s.remove("Hepatitis B");
                          }
                     }
                      if(immu.getName().equals( "MMR")){
                          i4+=1;
                          if(i4>=2){
                        s.remove("MMR");
                          }
                     }
                      if(immu.getName().equals("Varicella") ){
                          i5+=1;
                          if(i5>=2){
                                
                        s.remove("Varicella");
                          }
                     }
                 }
             }
             for(String ss:s){
                  JOptionPane.showMessageDialog(null,"you need to take "+ss);
             }
             
        }
    }
private void btnImage(){
    ImageIcon imageIcon = new ImageIcon("./image/immunization.jpg");
    jButton2.setIcon(imageIcon);
}
    
    public void populateTable() throws IOException
{
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
    dtm.setRowCount(0);
   for(StudentImmu immu:studentimmus){
       //System.out.println(rule);
       //System.out.println(immu.getStuName());
      // System.out.println(student.getName());
       if(immu.getStuName().equals(student.getName())){
       Object row[] =new Object[4];
       row[0] =immu.getName();
       row[1] = immu.getDose();
       row[2]= immu.getDate();
       //row[3]= immu.getMinage();
       row[3]= student.getClass();
       dtm.addRow(row);
   }
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
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Dose", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCheckBox1.setText("Hib");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("DTaP");

        jCheckBox3.setText("Polio");

        jCheckBox4.setText("Hepatitis B");

        jCheckBox5.setText("MMR");

        jCheckBox6.setText("Varicella");

        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6))
                        .addGap(123, 123, 123)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2)))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox6)
                .addContainerGap(73, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           
            if(student.getAge()<=24 && student.getAge()>=0){
                 if(jCheckBox1.isSelected()){
                     List<StudentImmu> b = new ArrayList<>();
                    StudentImmu a= new StudentImmu();
                    a.setStuName(student.getName());
                    a.setDose(1);
                    a.setName("Hib");
                    a.setDate(new Date());
                    
                    studentimmus.add(a);
                    //List<StudentImmu> b = new ArrayList<>();
                    for(StudentImmu immu:studentimmus){
                        if(immu.getStuName().equals(student.getName())){
                            if(immu.getName().equals("Hib")){
                                JOptionPane.showMessageDialog(null,"you can't take Hib anymore");
                                //studentimmus.remove(a);
                                b.add(a);
                            }
                        }
                    }
                    for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
                } 
               
                if(jCheckBox2.isSelected()){
                     List<StudentImmu> b = new ArrayList<>();
                    StudentImmu a= new StudentImmu();
                    int n=0;
                    a.setStuName(student.getName());
                    a.setDose(1);
                    a.setName("DTaP");
                     a.setDate(new Date());
                    studentimmus.add(a);
                    
                    for(StudentImmu immu:studentimmus){
                        if(immu.getStuName().equals(student.getName())){
                            if(immu.getName().equals("DTaP") ){
                                n+=1;
                                if(n>4){
                                JOptionPane.showMessageDialog(null,"you can't take DTaP anymore");
                                 b.add(a);
                                }
                            }
                       
                        }
                    }
                     for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
                    
                }
                
            
            if(jCheckBox3.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n = 0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("Polio");
                a.setDate(new Date());
                studentimmus.add(a);
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("Polio") ){
                            n+=1;
                            if(n>3){
                            JOptionPane.showMessageDialog(null,"you can't take Polio anymore");
                            b.add(a);
                        }
                        }
                    
                    }
                    
                    
                    
                }
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
            }
            
            
            if(jCheckBox4.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n =0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("Hepatitis B");
                 a.setDate(new Date());
                studentimmus.add(a);
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("Hepatitis B") ){
                            n+=1;
                            if(n>3){
                            JOptionPane.showMessageDialog(null,"you can't take Hepatitis B anymore");
                             b.add(a);
                        }
                        }
                      
                    }
                    
                    
                    
                }
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
            }
            if(jCheckBox5.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n = 0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("MMR");
                a.setDate(new Date());
                studentimmus.add(a);
                //System.out.println("1");
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("MMR") && immu.getDose()==1){
                            JOptionPane.showMessageDialog(null,"you can't take MMR anymore");
                             b.add(a);
                             System.out.println("2");
                        }
                                         }
                    
                    
                    
                }
               
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                      System.out.println("4");
                }
            }
            
            if(jCheckBox6.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("Varicella");
                 a.setDate(new Date());
                studentimmus.add(a);
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("Varicella") && immu.getDose()==1){
                            JOptionPane.showMessageDialog(null,"you can't take Varicella anymore");
                            b.add(a);
                        }
                  
                    }
                    
                    
                    
                }
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
            }
            
            }
            else if(student.getAge()>24){
                if(jCheckBox1.isSelected()){
                     List<StudentImmu> b = new ArrayList<>();
                    StudentImmu a= new StudentImmu();
                    int n =0;
                    a.setStuName(student.getName());
                    a.setDose(1);
                    a.setName("Hib");
                    a.setDate(new Date());
                    
                    studentimmus.add(a);
                    //List<StudentImmu> b = new ArrayList<>();
                    for(StudentImmu immu:studentimmus){
                        if(immu.getStuName().equals(student.getName())){
                            if(immu.getName().equals("Hib")){
                                JOptionPane.showMessageDialog(null,"you can't take Hib anymore");
                                //studentimmus.remove(a);
                                b.add(a);
                            }
                        }
                    }
                    for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
                } 
               
                if(jCheckBox2.isSelected()){
                     List<StudentImmu> b = new ArrayList<>();
                    StudentImmu a= new StudentImmu();
                    int n =0;
                    a.setStuName(student.getName());
                    a.setDose(1);
                    a.setName("DTaP");
                    // a.setMaxage(0);
                    a.setDate(new Date());
                    studentimmus.add(a);
                    
                    for(StudentImmu immu:studentimmus){
                        if(immu.getStuName().equals(student.getName())){
                            if(immu.getName().equals("DTaP") ){
                                n+=1;
                                if(n>5){      
                                JOptionPane.showMessageDialog(null,"you can't take DTaP anymore");
                                 b.add(a);
                                }
                            }
                       
                        }
                    }
                     for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
                    
                }
                
            
            if(jCheckBox3.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n=0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("Polio");
                 a.setDate(new Date());
                studentimmus.add(a);
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("Polio") ){
                           n+=1;
                           if(n>4){
                            JOptionPane.showMessageDialog(null,"you can't take Polio anymore");
                            b.add(a);
                           }
                        }
                     
                    }
                    
                    
                    
                }
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
            }
            
            
            if(jCheckBox4.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n =0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("Hepatitis B");
                 a.setDate(new Date());
                studentimmus.add(a);
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("Hepatitis B") ){
                            if(n>3){
                            JOptionPane.showMessageDialog(null,"you can't take Hepatitis B anymore");
                             b.add(a);
                            }
                        }
                      
                    }
                    
                    
                    
                }
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
            }
            if(jCheckBox5.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n=0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("MMR");
                //a.setMaxage(0);
                a.setDate(new Date());
                studentimmus.add(a);
                System.out.println("a");
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("MMR") ){
                           n+=1;
                           if(n>=4){
                                JOptionPane.showMessageDialog(null,"you can't take MMR anymore");
                                b.add(a);
                           }
                        }
                      
                    }
                    
                    
                    
                }
               
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                     // System.out.println("4");
                      System.out.println("d");
                }
            }
            
            if(jCheckBox6.isSelected()){
                 List<StudentImmu> b = new ArrayList<>();
                StudentImmu a= new StudentImmu();
                int n =0;
                a.setStuName(student.getName());
                a.setDose(1);
                a.setName("Varicella");
                 //a.setMaxage(0);
                a.setDate(new Date());
                studentimmus.add(a);
                for(StudentImmu immu:studentimmus){
                    if(immu.getStuName().equals(student.getName())){
                        if(immu.getName().equals("Varicella")){
                            n+=1;
                            if(n>2){
                            JOptionPane.showMessageDialog(null,"you can't take Varicella anymore");
                            b.add(a);
                            }
                        }
                    }
                    
                    
                    
                }
                 for(StudentImmu c:b){
                    studentimmus.remove(c);
                }
            }
            }
//            StudentImmu d=new StudentImmu();
//            d.setStuName(student.getName());
//            d.setName("ppp");
//            studentimmus.add(d);
            StudentImmuFactory sf = new StudentImmuFactory();
            sf.writeCSV(studentimmus);
            populateTable();
        } catch (IOException ex) {
            Logger.getLogger(ImmuPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
           


      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
