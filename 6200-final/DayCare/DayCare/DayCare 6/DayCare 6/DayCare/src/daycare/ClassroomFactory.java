/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenyifan
 */
public class ClassroomFactory {
    
    public List<Classroom> generateClassroom(List<Student> students,List<Teacher> teachers){
        List<Classroom> classrooms = new ArrayList<>();
        
        Classroom c1 = new Classroom();
        Classroom c2 = new Classroom();
        Classroom c3 = new Classroom();
        Classroom c4 = new Classroom();
        Classroom c5 = new Classroom();
        Classroom c6 = new Classroom();
        Classroom c7 = new Classroom();
        Classroom c8 = new Classroom();
        Classroom c9 = new Classroom();
        Classroom c10 = new Classroom();
        Classroom c11 = new Classroom();
        Classroom c12 = new Classroom();
        Classroom c13 = new Classroom();
        Classroom c14 = new Classroom();
        Classroom c15= new Classroom();
        Classroom c16 = new Classroom();
        c1.setName("c1");
         c2.setName("c2");
          c3.setName("c3");
           c4.setName("c4");
            c5.setName("c5");
             c6.setName("c6");
              c7.setName("c7");
               c8.setName("c8");
                c9.setName("c9");
                 c10.setName("c10");
                  c11.setName("c11");
                   c12.setName("c12");
                    c13.setName("c13");
                     c14.setName("c14");
                      c15.setName("c15");
                       c16.setName("c16");
        for(Student student:students){
            if(student.getAge()>0 && student.getAge()<=12){
                if(c1.getSize()<4){
                    c1.setSize(c1.getSize()+1);
                    System.out.println(c1.getStudents());
                    c1.getStudents().add(student);
                }else if(c2.getSize()<4){
                      c2.setSize(c2.getSize()+1);
                    c2.getStudents().add(student);
                }else if(c3.getSize()<4){
                      c3.setSize(c3.getSize()+1);
                    c3.getStudents().add(student);
                }
            }
             if(student.getAge()>12 && student.getAge()<=24){
                if(c4.getSize()<5){
                    c4.setSize(c4.getSize()+1);
                    c4.getStudents().add(student);
                }else if(c5.getSize()<5){
                      c5.setSize(c5.getSize()+1);
                    c5.getStudents().add(student);
                }else if(c6.getSize()<5){
                      c6.setSize(c6.getSize()+1);
                    c6.getStudents().add(student);
                }
             }
             if(student.getAge()>24 && student.getAge()<=36){
                if(c7.getSize()<6){
                    c7.setSize(c7.getSize()+1);
                    c7.getStudents().add(student);
                }else if(c8.getSize()<6){
                      c8.setSize(c8.getSize()+1);
                    c8.getStudents().add(student);
                }else if(c9.getSize()<6){
                      c9.setSize(c9.getSize()+1);
                    c9.getStudents().add(student);
                }
             }
if(student.getAge()>36 && student.getAge()<=48){
                if(c10.getSize()<8){
                    c10.setSize(c10.getSize()+1);
                    c10.getStudents().add(student);
                }else if(c11.getSize()<8){
                      c11.setSize(c11.getSize()+1);
                    c11.getStudents().add(student);
                }else if(c12.getSize()<8){
                      c12.setSize(c12.getSize()+1);
                    c12.getStudents().add(student);
                }
}
if(student.getAge()>48 && student.getAge()<=60){
                if(c13.getSize()<12){
                    c13.setSize(c13.getSize()+1);
                    c13.getStudents().add(student);
                }else if(c14.getSize()<12){
                      c14.setSize(c14.getSize()+1);
                    c14.getStudents().add(student);
                }

            }
        if(student.getAge()>60 && student.getAge()<=72){
                if(c15.getSize()<15){
                    c15.setSize(c15.getSize()+1);
                    c15.getStudents().add(student);
                }else if(c16.getSize()<15){
                      c16.setSize(c16.getSize()+1);
                    c16.getStudents().add(student);
                }

        
     
    }
    }
        classrooms.add(c1);
        classrooms.add(c2);
        classrooms.add(c3);
        classrooms.add(c4);
        classrooms.add(c5);
        classrooms.add(c6);
        classrooms.add(c7);
        classrooms.add(c8);
        classrooms.add(c9);
        classrooms.add(c10);
        classrooms.add(c11);
        classrooms.add(c12);
        classrooms.add(c13);
        classrooms.add(c14);
        classrooms.add(c15);
classrooms.add(c16);    
int n =0;
       for(Classroom classroom: classrooms){
           if(classroom.getTeacher()==null){
               classroom.setTeacher(teachers.get(n));
               n+=1;
         
    }
       }
        
        return classrooms;
    }
}
    

