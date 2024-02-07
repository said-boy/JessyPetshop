/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import view.AddMemberView;

/**
 *
 * @author asus
 */


public class AddMemberController {
    
    private final AddMemberView addMemberView;

    public AddMemberController(AddMemberView addMemberView){
        this.addMemberView = addMemberView;
    }
    
    public void clearForm(){
        addMemberView.getText_id_member().setText(null);
        addMemberView.getText_nama_member().setText(null);
        addMemberView.getText_nomor_hp().setText(null);
    }
        
        
}
