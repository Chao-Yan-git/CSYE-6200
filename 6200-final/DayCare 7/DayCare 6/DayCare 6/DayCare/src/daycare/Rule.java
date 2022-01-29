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
public class Rule {
    
    private int minage;
    private int maxage;
    private int size;
    private int ratio;
    private int maxgroup;

    public int getMinage() {
        return minage;
    }

    public int getMaxage() {
        return maxage;
    }

    public int getSize() {
        return size;
    }

    public int getRatio() {
        return ratio;
    }

    public int getMaxgroup() {
        return maxgroup;
    }

    public void setMinage(int minage) {
        this.minage = minage;
    }

    public void setMaxage(int maxage) {
        this.maxage = maxage;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setRatio(int ratio) {
        this.ratio = ratio;
    }

    public void setMaxgroup(int maxgroup) {
        this.maxgroup = maxgroup;
    }

    @Override
    public String toString() {
        return "Rule{" + "minage=" + minage + ", maxage=" + maxage + ", size=" + size + ", ratio=" + ratio + ", maxgroup=" + maxgroup + '}';
    }

    public Rule() {
    }
    
    
}
