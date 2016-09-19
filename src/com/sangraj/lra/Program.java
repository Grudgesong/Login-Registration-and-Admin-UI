/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sangraj.lra;

import com.sangraj.lra.UI.Admin.AdministratorUI;
import com.sangraj.lra.UI.Admin.USDE.EditUI;
import com.sangraj.lra.UI.LoginUI;

/**
 *
 * @author Song Grudge Ranjit
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoginUI ui=new LoginUI();
//        AdministratorUI ui=new AdministratorUI();
//          EditUI ui=new EditUI();
          ui.setVisible(true);

    }
    
}
