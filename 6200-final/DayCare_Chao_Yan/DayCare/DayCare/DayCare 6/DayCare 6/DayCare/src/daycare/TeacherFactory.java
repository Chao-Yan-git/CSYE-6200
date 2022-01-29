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
public class TeacherFactory {
      public List<Teacher> createPerson(String csvFile) throws FileNotFoundException, IOException {
              List<Teacher> teachers = new ArrayList<>();
	            BufferedReader br = new BufferedReader(new FileReader(csvFile));
	              String line="";
	            while ((line=br.readLine())!=null) {
              
	        String[] parts = line.split(",");

	        Teacher teacher = new Teacher();
	        teacher.setName(parts[0]);
	        try {
				teacher.setAge(Integer.parseInt(parts[1]));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				teacher.setCredits(Integer.parseInt(parts[2]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                 teacher.setTime(new Date());
	        teachers.add(teacher);
	    }
                    br.close();
                    return teachers;
     }
     
     public void writeCSV(List<Teacher> teachers) throws IOException{
         BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"));
		    for(int i=0;i<teachers.size();i++) {
		    	
		    	bw.write(teachers.get(i).getName()+","+teachers.get(i).getAge()+","+teachers.get(i).getCredits());
		    	bw.newLine();
		    	
		    }
			
		    bw.flush();
		    bw.close();
     }
    
}
