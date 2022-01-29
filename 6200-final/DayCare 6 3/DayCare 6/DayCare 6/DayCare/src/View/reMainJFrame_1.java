package View;

import daycare.Classroom;
import daycare.ClassroomFactory;
import daycare.Immu;
import daycare.ImmuFactory;
import daycare.Rule;
import daycare.RuleFactory;
import daycare.Student;
import daycare.StudentFactory;
import daycare.Teacher;
import daycare.TeacherFactory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class reMainJFrame_1 extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
   public List<Student> students;
    public List<Rule> rules;
    public List<Teacher> teachers;
    public List<Immu> immus;
    public List<Classroom> classrooms;
    //private OrderDir orderdir;
    //private ProductsDir productsdir;

     public void create() throws IOException{
       StudentFactory studentFactory = new StudentFactory();
	   students = studentFactory.createPerson("student1.csv");
             
	        for(Student student: students) {
	            Student curstudent = student;
	            System.out.println(curstudent);

	        } 

   TeacherFactory teacherFactory = new TeacherFactory();
	 teachers = teacherFactory.createPerson("Teacher.csv");
             
	        for(Teacher teacher: teachers) {
	            Teacher curteacher = teacher;
	            System.out.println(curteacher);

	        } 
                
           // RuleFactory rf =new RuleFactory();
            ImmuFactory imf =new ImmuFactory();
            immus = imf.createImmu("Immu1.csv");
            for(Immu immu:immus){
                Immu curi=immu;
                System.out.println(curi);
            }
            ClassroomFactory classroomFactory = new ClassroomFactory();
            classrooms = classroomFactory.generateClassroom(students, teachers);
   }
    public reMainJFrame_1() throws IOException {
       initComponents();
        create();
//            List<Rule> rules =rf.createRule("rule3.csv");
//            for(Rule rule:rules){
//                Rule currule = rule;
//                System.out.println(currule);           
//    }
           populateTable();
           System.out.println("1");
         
        

    }
    
     public void populateTable() throws IOException
{
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
    dtm.setRowCount(0);
     RuleFactory rf =new RuleFactory(); 
      List<Rule> rules =rf.createRule("rule3.csv");
   for(Rule rule:rules){
       System.out.println(rule);
       Object row[] =new Object[4];
       row[0] =rule.getMinage();
       row[1] = rule.getMaxage();
       row[2]= rule.getRatio();
       row[3]= rule.getMaxgroup();
       dtm.addRow(row);
   }
}
    

    
    /*private void browsepicJButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    /*JFileChooser jfilechooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("jpg","jpeg","png");
        jfilechooser.setFileFilter(filter);
        jfilechooser.showOpenDialog(browsepicJButton);
        String filepath = jfilechooser.getSelectedFile().getAbsolutePath();
        //image.setText(filepath);
        ImageIcon imageicon=new ImageIcon("/Users/wangjingyu/Desktop/final/final_project/EcoSystem/src/Image/black-friday-sales-red-tags-scaled.jpg");
        imageicon=new ImageIcon(imageicon.getImage().getScaledInstance(200,100, Image.SCALE_DEFAULT));
        image.setIcon(imageicon);
        image.setHorizontalAlignment(SwingConstants.CENTER);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        loginJLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        container.setLayout(new java.awt.CardLayout());

        jPanel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(1746, 1080));
        jPanel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Minage", "Maxage", "Ratio", "Max Group"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(140, 20, 452, 404);

        container.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(container);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(174, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(171, 1080));
        jPanel1.setLayout(null);
        jPanel1.add(loginJLabel);
        loginJLabel.setBounds(165, 307, 0, 0);

        jButton1.setText("Classroom");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 170, 90, 23);

        jButton2.setText("Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 90, 71, 23);

        jButton3.setText("Teacher");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 130, 71, 23);

        jSplitPane1.setLeftComponent(jPanel1);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             TeacherPanel panel1;
             
             panel1 = new TeacherPanel(container, teachers);
             
             container.add("StudentPanel", panel1);
             CardLayout layout = (CardLayout) container.getLayout();
             layout.next(container); 
         } catch (IOException ex) {
             Logger.getLogger(reMainJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         try {
             // TODO add your handling code here:
             StudentPanel panel1;
             
             panel1 = new StudentPanel(container, students);
             
             container.add("StudentPanel", panel1);
             CardLayout layout = (CardLayout) container.getLayout();
             layout.next(container); 
         } catch (IOException ex) {
             Logger.getLogger(reMainJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
            try {
             // TODO add your handling code here:
             ClassroomPanel panel1;
             
             panel1 = new ClassroomPanel(container, classrooms);
             
             container.add("StudentPanel", panel1);
             CardLayout layout = (CardLayout) container.getLayout();
             layout.next(container); 
         } catch (IOException ex) {
             Logger.getLogger(reMainJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(reMainJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reMainJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reMainJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reMainJFrame_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new reMainJFrame_1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(reMainJFrame_1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel loginJLabel;
    // End of variables declaration//GEN-END:variables
}