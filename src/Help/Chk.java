/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Help;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author baphuoc
 */
public class Chk {
    public static boolean chknull(JTextField txt, String sms){
        if(txt.getText().length() == 0){
            JOptionPane.showMessageDialog(null, sms);
            return true;
        }
        return false;
    }
    public static boolean chkCanNang(JTextField txt, String sms){
        if(Double.parseDouble(txt.getText()) < 0){
            JOptionPane.showMessageDialog(null, sms);
            return true;
        }
        return false;
    }
}
