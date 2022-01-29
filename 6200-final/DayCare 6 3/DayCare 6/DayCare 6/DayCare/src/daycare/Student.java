/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author chenyifan
 */
public class Student extends Person{
    	 private double gpa;
         private List<Immu> studentImmu;
         private Date date;
         
	 public Student() {
		    //this.studentImmu=new ArrayList<>();
	    }
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return this.getName();
	}
	 
        
//         public void setimmu(String csvFile) {
//	       List<Immu> Immus = new ArrayList<>();
//	        try {
//	            BufferedReader br = new BufferedReader(new FileReader(csvFile));
//	              String line="";
//               // line=br.readLine();
//                //System.out.println(line);
//	            while ((line=br.readLine())!=null) {
//                          String[] parts = line.split(",");
//                        if(parts[0]==this.getName()){
//	                Immu immu = new Immu();
//                         immu.setMinage(Integer.parseInt(parts[0]));
//	        try {
//				  immu.setMaxage(Integer.parseInt(parts[1]));
//			} catch (NumberFormatException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//	        try {
//				immu.setName(parts[2]);
//			} catch (NumberFormatException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//                   try {
//				immu.setDose(Integer.parseInt(parts[3]));
//			} catch (NumberFormatException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//         
//
//	                if(immu!=null) {
//	                   this.studentImmu.add(immu);
//	                }
//                        }
//	              br.close();
//	    
//	            }
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        
//	    }
//                  
//         }
//    public List<Immu> getStudentImmu() {
//        return studentImmu;
//    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
         
         

}
