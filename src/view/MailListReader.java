/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

/**
 *
 * @author Usuario
 */
public class MailListReader {
    
    public List<Mail> read(String fileName) throws IOException{
        List<Mail> mails = new ArrayList<>();
        String cadena;
        FileReader f = new FileReader(fileName);
        BufferedReader b = new BufferedReader(f);
        while((cadena = b.readLine())!=null) {
            int arroba = cadena.indexOf('@');
            if ( arroba != -1){
                mails.add(new Mail(cadena));
            }  
          
        }
        b.close();
        return mails;
    }
}
