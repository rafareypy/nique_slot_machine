/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import controller.interfaces.NiqueControl;
import controllers.NiqueController;
import java.awt.Button;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import service.Nique;
import service.ServiceNique;


public class Factory 
{

   
    

    public static ServiceNique getServiceNique()
    {
        return new Nique();
    }

    public NiqueControl getNiqueControl() 
    {
        return new NiqueController();
    }

    public JButton getButton(String button) {
        return new JButton(button);
    }

    public JPanel JPanel() {
        return new JPanel();
    }

    public ImageIcon ImageIcon(String imageschrispng) 
    {
        return new ImageIcon("images/chris.png");
    }

    public JLabel JLabel() 
    {
        return new JLabel();
    }
    
}
