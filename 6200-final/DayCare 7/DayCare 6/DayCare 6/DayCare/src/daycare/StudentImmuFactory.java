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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chenyifan
 */
public class StudentImmuFactory {
    
         public List<StudentImmu> createPerson(String csvFile) throws FileNotFoundException, IOException {
              List<StudentImmu> studentimmus = new ArrayList<>();
	            BufferedReader br = new BufferedReader(new FileReader(csvFile));
	            //String line = br.readLine();
                    //System.out.println(line);
                    String line="";
	            while ((line=br.readLine())!=null) {
              String a =",";
              //System.out.println(line);
               StudentImmu studentimmu = new StudentImmu();
	        String[] parts = line.split(a);

	       
	        studentimmu.setStuName(parts[0]);
	        try {
				studentimmu.setMinage(Integer.parseInt(parts[1]));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				studentimmu.setMaxage(Integer.parseInt(parts[2]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                studentimmu.setName(parts[3]);
                 try {
				studentimmu.setDose(Integer.parseInt(parts[4]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                 studentimmu.setDate(new Date());
                
               // student.setimmu("StuImmu.csv");
	        studentimmus.add(studentimmu);
	    }
                    br.close();
                 
                    return studentimmus;
     }
         
           public void writeCSV(List<StudentImmu> students) throws IOException{
         BufferedWriter bw = new BufferedWriter(new FileWriter("StuImmu1.csv"));
		    for(int i=0;i<students.size();i++) {
		    	
		        bw.write(students.get(i).getStuName()+","+students.get(i).getMinage()+","+students.get(i).getMaxage()+","+students.get(i).getName()+","+students.get(i).getDose());
		    	bw.newLine();
		    	
		    }
			
		    bw.flush();
		    bw.close();
     }
    
}
