/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tik_tak_toe;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Tik_Tak_Toe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameFrame c = new GameFrame();
        c.setSize(500,500);
       c.setLocationRelativeTo(null);
       c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       c.setVisible(true);

    }
    
}
