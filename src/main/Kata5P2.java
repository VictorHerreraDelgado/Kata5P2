/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.util.List;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;
import model.Histogram;

/**
 *
 * @author Asus
 */
public class Kata5P2 {

    /**
     * @param args the command line arguments
     */
     String fileName = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Kata4\\email.txt";
        List<Mail> mailList;
        Histogram<String> histogram;
        HistogramDisplay histoDisplay;
        
    public static void main(String[] args) throws IOException{
        Kata5P2 k5 = new Kata5P2();
        k5.execute();
        
        
    }

    private void execute() throws IOException {
        input();
        process();
        output();
    }

    private void input() throws IOException {
       mailList = new MailListReader().read(fileName); 
    }

    private void process() {
        histogram = new MailHistogramBuilder().build(mailList);
        histoDisplay = new HistogramDisplay(histogram);
    }

    private void output() {
        new HistogramDisplay(histogram).execute();
    }
    
}
