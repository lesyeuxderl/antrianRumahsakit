/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrumahsakit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class NomorAntrian extends JFrame {
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    //private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 40;
    
    public static void main(String[] args) {
        NomorAntrian frame = new NomorAntrian();
        frame.setVisible(true);
    }
    
    public NomorAntrian() {
        Container contentpane;
        JButton button1, button2, button3;
        JLabel label;
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Nomor Antrian");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentpane = getContentPane();
        contentpane.setBackground(Color.yellow);
        //contentpane.setFont(new Font("Consolas", Font.BOLD, 24));
        contentpane.setLayout(new BorderLayout());
        
        button1 = new JButton("nomor antrian anda: ");
        button3 = new JButton("45");
        button2 = new JButton("Terimakasih sudah menunggu");
        contentpane.add(button1, BorderLayout.NORTH);
        contentpane.add(button2, BorderLayout.SOUTH);
        contentpane.add(button3, BorderLayout.CENTER);
        button3.setFont(new Font("Times New Roman", Font.BOLD, 120));
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
