/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Mail;

/**
 *
 * @author Asus
 */
public class MailListReaderBD {
    public List<Mail> read(String fileName) throws IOException{
        String url = "jdbc:sqlite:Kata5.db";
        String sql = "SELECT * FROM EMAIL";
        List<Mail> emails = new ArrayList<Mail>();
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            while (rs.next()) {
                emails.add(
                new Mail(rs.getString("Mail")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return emails;
    }
   
}
