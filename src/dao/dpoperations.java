/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author MoNasr
 */
public class dpoperations {
    public static void setdataordelete(String query,String msg)
    {
        try{
            Connection con= connectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate(query);
            if(!msg.equals(""))
            {
                JOptionPane.showMessageDialog(null, msg);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
        }
    }
    public static ResultSet getdata(String query)
    {
        try{
            Connection con= connectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            return rs;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"Message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
