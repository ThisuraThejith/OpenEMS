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
public class Role {

    private int roleID;
    private String roleName;

    public Role(int roleID, String roleName) {
        this.roleID = roleID;
        this.roleName = roleName;
    }

    /**
     * @return the RoleID
     */

    public int getRoleID() {
        return roleID;
    }

    /**
     * @param RoleID the RoleID to set
     */
    public void setRoleID(int RoleID) {
        this.roleID = RoleID;
    }

    /**
     * @return the RoleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param RoleName the RoleName to set
     */
    public void setRoleName(String RoleName) {
        this.roleName = RoleName;
    }

    @Override
    public String toString(){
        return this.getRoleName();
    }
}
