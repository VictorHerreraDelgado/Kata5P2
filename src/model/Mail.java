/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Mail {
    private String mail;
    public Mail(String mail){
        this.mail = mail;
    }
    public String getDomain(){
        String sol = "";
        int x = mail.indexOf('@');
        
        return mail.substring(x+1);   
    }
}
