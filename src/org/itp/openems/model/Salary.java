/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.itp.openems.model;

/**
 *
 * @author THISURA THEJITH
 */
public class Salary {

    private int roleID;
    private int absentCount;
    private int halfDayCount;
    private int maxLeaves;
    private double bonus;
    private double epfRate;
    private double etfRate;
    private double basicSalary;

    /**
     * @return the roleID
     */
    public int getRoleID() {
        return roleID;
    }

    /**
     * @param roleID the roleID to set
     */
    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    /**
     * @return the absentCount
     */
    public int getAbsentCount() {
        return absentCount;
    }

    /**
     * @param absentCount the absentCount to set
     */
    public void setAbsentCount(int absentCount) {
        this.absentCount = absentCount;
    }

    /**
     * @return the halfDayCount
     */
    public int getHalfDayCount() {
        return halfDayCount;
    }

    /**
     * @param halfDayCount the halfDayCount to set
     */
    public void setHalfDayCount(int halfDayCount) {
        this.halfDayCount = halfDayCount;
    }

    /**
     * @return the maxLeaves
     */
    public int getMaxLeaves() {
        return maxLeaves;
    }

    /**
     * @param maxLeaves the maxLeaves to set
     */
    public void setMaxLeaves(int maxLeaves) {
        this.maxLeaves = maxLeaves;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the epf
     */
    public double getEpfRate() {
        return epfRate;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpfRate(double epf) {
        this.epfRate = epf;
    }

    /**
     * @return the etf
     */
    public double getEtfRate() {
        return etfRate;
    }

    /**
     * @param etf the etf to set
     */
    public void setEtfRate(double etf) {
        this.etfRate = etf;
    }
    
    /**
     * 
     * @return the epf amount
     */
    public double getEpf() {
        return this.epfRate * this.basicSalary / 100;
    }
    
    public double getEtf(){
        return this.etfRate * this.basicSalary / 100;
    }

    /**
     * @return the basicSalary
     */
    public double getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    
    public double calculateSalary() {
        double totalSalary;
        totalSalary = basicSalary - ((epfRate + etfRate)/100) * basicSalary + bonus;
        return totalSalary;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Basic Salary : " + this.basicSalary + "\n");
        builder.append("Bonus : " + this.bonus + "\n");
        builder.append("EPF : " + this.epfRate/100 * this.basicSalary + "\n");
        builder.append("ETF : " + this.etfRate/100 * this.basicSalary+ "\n");
        builder.append("Total Salary : " + this.calculateSalary()+ "\n");
        return builder.toString();
    }
}
