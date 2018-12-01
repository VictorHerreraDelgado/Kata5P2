/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.List;
import model.Histogram;
import model.Mail;

/**
 *
 * @author Usuario
 */
public class MailHistogramBuilder {
   public Histogram<String> build (List<Mail> lista){
       Histogram<String> hist = new Histogram<>();
       lista.forEach((email) -> {
           hist.increment(email.getDomain());
       });
       return hist;
   }
}
