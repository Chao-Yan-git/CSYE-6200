/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chenyifan
 */
public class StudentFactory {
     public List<Student> createPerson(String csvFile) throws FileNotFoundException, IOException {
              List<Student> students = new ArrayList<>();
	            BufferedReader br = new BufferedReader(new FileReader(csvFile));
	            //String line = br.readLine();
                    //System.out.println(line);
                    String line="";
	            while ((line=br.readLine())!=null) {
              String a =",";
              //System.out.println(line);
               Student student = new Student();
	        String[] parts = line.split(a);

	       
	        student.setName(parts[0]);
	        try {
				student.setAge(Integer.parseInt(parts[1]));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				student.setGpa(Double.parseDouble(parts[2]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                student.setDate(new Date());
                
               // student.setimmu("StuImmu.csv");
	        students.add(student);
	    }
                    br.close();
                 
                    return students;
     }
     
     public void writeCSV(List<Student> students) throws IOException{
         BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));
		    for(int i=0;i<students.size();i++) {
		    	
		        bw.write(students.get(i).getName()+","+students.get(i).getAge()+","+students.get(i).getGpa());
		    	bw.newLine();
		    	
		    }
			
		    bw.flush();
		    bw.close();
     }
    
}
