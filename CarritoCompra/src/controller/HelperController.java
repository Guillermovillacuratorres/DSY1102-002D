/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Cetecom
 */
public class HelperController {
    
    public void ShowError(String msg){
        JOptionPane.showMessageDialog(
                null,
                msg, "Error",
                JOptionPane.ERROR_MESSAGE);
    }
    
    
    public void ShowWarning(String msg){
        JOptionPane.showMessageDialog(
                null,
                msg, "Advertencia",
                JOptionPane.WARNING_MESSAGE);
    }
        
    public void ShowInformation(String msg){
        JOptionPane.showMessageDialog(
                null,
                msg, "Infromación",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
        
}
