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
    private double epf;
    private double etf;
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
    public double getEpf() {
        return epf;
    }

    /**
     * @param epf the epf to set
     */
    public void setEpf(double epf) {
        this.epf = epf;
    }

    /**
     * @return the etf
     */
    public double getEtf() {
        return etf;
    }

    /**
     * @param etf the etf to set
     */
    public void setEtf(double etf) {
        this.etf = etf;
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

        totalSalary = basicSalary - (epf + etf) * basicSalary + bonus;

        return totalSalary;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Basic Salary : " + this.basicSalary + "\n");
        builder.append("Bonus : " + this.bonus + "\n");
        builder.append("EPF : " + this.epf * this.basicSalary + "\n");
        builder.append("ETF : " + this.etf * this.basicSalary+ "\n");
        builder.append("Total Salary : " + this.calculateSalary()+ "\n");
        return builder.toString();
    }
}
