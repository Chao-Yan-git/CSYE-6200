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
public class RuleFactory {
      public List<Rule> createRule(String csvFile) throws FileNotFoundException, IOException {
           List<Rule> rules = new ArrayList<>();
	            BufferedReader br = new BufferedReader(new FileReader(csvFile));
	               String line="";
	            while ((line=br.readLine())!=null) {
	        String[] parts = line.split(",");
 System.out.println(parts[0]);

	        Rule rule = new Rule();
	        rule.setMinage(Integer.parseInt(parts[0]));
	        try {
				  rule.setMaxage(Integer.parseInt(parts[1]));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				rule.setSize(Integer.parseInt(parts[2]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                   try {
				rule.setRatio(Integer.parseInt(parts[3]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          try {
				rule.setMaxgroup(Integer.parseInt(parts[4]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	        rules.add(rule);
	    }
                    br.close();
                    return rules;
      }
    
}
