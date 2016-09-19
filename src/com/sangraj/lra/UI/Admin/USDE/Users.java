/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.lra.UI.Admin.USDE;


/**
 *
 * @author Song Grudge Ranjit
 */
public class Users {
    public String username;
    public String firstname;
    public String middlename;
    public String lastname;
    public String email;
    public int user_id;

    public Users(String username,String firstname, String middlename, String lastname, String email, int user_id){
        this.username=username;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.email = email;
        this.user_id = user_id;
    }

   public String getUsername() {
        return username;
    }
        
    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "Users{" + "username=" + username + ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", email=" + email + ", user_id=" + user_id + '}';
    }
    
}
