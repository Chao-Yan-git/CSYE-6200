/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daycare;

/**
 *
 * @author chenyifan
 */
public class Immu {
    private int minage;
    private int maxage;
    private String name;
    private int dose;

    public int getMinage() {
        return minage;
    }

    public void setMinage(int minage) {
        this.minage = minage;
    }

    public int getMaxage() {
        return maxage;
    }

    public void setMaxage(int maxage) {
        this.maxage = maxage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public Immu() {
    }

    @Override
    public String toString() {
        return "Immu{" + "minage=" + minage + ", maxage=" + maxage + ", name=" + name + ", dose=" + dose + '}';
    }
    
}
