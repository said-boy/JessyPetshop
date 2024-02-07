/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.UserDao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import main.App;
import models.User;
import view.AdminView;
import view.KasirView;
import view.LoginView;
import view.OwnerView;

/**
 *
 * @author asus
 */
public class UserController {
    
    private final LoginView loginView;
    private User user;
    private UserDao userDao;
    
    public UserController(LoginView loginView){
        this.loginView = loginView;
        user = new User();
        userDao = new UserDao();
    }
    
    public void clearForm(){
        loginView.getText_username().setText(null);
        loginView.getText_password().setText(null);
    }
    
    public void authorization(User result) {
        if (null != result)
            switch (result.getKdUser().getJenisUser()) {
            case "owner":
                OwnerView ov = new OwnerView();
                ov.setText_nama_owner(result.getUsername());
                ov.setExtendedState(JFrame.MAXIMIZED_BOTH);
                ov.setVisible(true);
                this.loginView.dispose();
                break;
            case "admin":
                AdminView av = new AdminView();
                av.setText_nama_admin(result.getUsername());
                av.setExtendedState(JFrame.MAXIMIZED_BOTH);
                av.setVisible(true);
                this.loginView.dispose();
                break;
            case "kasir":
                KasirView kv = new KasirView();
                kv.setText_nama_kasir(result.getUsername());
                kv.getIdUser().setText(result.getIdUser());
                kv.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                kv.setVisible(true);
                this.loginView.dispose();
                break;
            default:
                break;
        }else{
            JOptionPane.showMessageDialog(this.loginView, "Username dan password salah!");
            clearForm();
        }
    }
            
}
