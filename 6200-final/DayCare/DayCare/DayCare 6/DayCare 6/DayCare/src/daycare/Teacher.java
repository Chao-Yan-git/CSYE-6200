/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

import java.util.Date;

/**
 *
 * @author chenyifan
 */
public class Teacher extends Person {
    
    	private int credits;
        private Date time;
        
	public Teacher(){
		super();
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String toString() {
		return this.getName();
	}

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
        
    
}
