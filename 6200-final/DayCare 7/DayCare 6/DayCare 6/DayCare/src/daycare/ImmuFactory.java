/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chenyifan
 */
public class ImmuFactory { 
      public List<Immu> createImmu(String csvFile) throws FileNotFoundException, IOException {
          List<Immu> immus = new ArrayList<>();
	            BufferedReader br = new BufferedReader(new FileReader(csvFile));
	                String line="";
	            while ((line=br.readLine())!=null) {
	        String[] parts = line.split(",");
               	        Immu immu = new Immu();
                      System.out.println(parts[0]);
                      System.out.println(parts[0].trim());
	        immu.setMinage(Integer.parseInt(parts[0]));
	        try {
				  immu.setMaxage(Integer.parseInt(parts[1]));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				immu.setName(parts[2]);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                   try {
				immu.setDose(Integer.parseInt(parts[3]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         

	       immus.add(immu);
	    }
                    br.close();
                    return immus;
      }
      
   
}
