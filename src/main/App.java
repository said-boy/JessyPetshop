/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import service.MasterInterface;
import service.impl.MasterServiceImpl;
import view.LoginView;

/**
 *
 * @author asus
 */
public class App {

    /**
     * @param args the command line arguments
     */
    
    public static LoginView loginView;
    
    public static MasterInterface masterInterface;
    
    public static void main(String[] args) {
        // TODO code application logic here
        masterInterface = new MasterServiceImpl();
        loginView = new LoginView();
        loginView.setVisible(true);
    }
    
}
