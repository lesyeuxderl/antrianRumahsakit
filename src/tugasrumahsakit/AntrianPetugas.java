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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class AntrianPetugas extends JFrame {

    private static final int FRAME_WIDTH = 700;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 100;
    private static final int BUTTON_HEIGHT = 40;
    private static final int TXT_WIDTH = 400;
    private static final int TXT_HEIGHT = 40;
    private static final int TXXT_WIDTH = 300;
    private static final int TXXT_HEIGHT = 100;
    private static final int CB_WIDTH = 90;
    private static final int CB_HEIGHT = 20;
    private JButton cancel;
    private JButton ok,next;
    private JTextField txtfld;
    private JLabel LabelNama, LabelKet, keluhan, antri;
    private JCheckBox cb1, cb2, cb3;

    public static void main(String[] args) {
        AntrianPetugas frame = new AntrianPetugas();
        frame.setVisible(true);
    }

    public AntrianPetugas() {
        Container contentpane = getContentPane();
        JButton button1;
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setTitle("Data Pasien");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentpane.setLayout(null);
        contentpane.setBackground(Color.white);

        LabelNama = new JLabel("Nama ");
        LabelNama.setBounds(100, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(LabelNama);

        txtfld = new JTextField();
        txtfld.setBounds(200, 30, TXT_WIDTH, TXT_HEIGHT);
        contentpane.add(txtfld);
        keluhan = new JLabel("Keluhan");
        keluhan.setBounds(100, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(keluhan);

        txtfld = new JTextField();
        txtfld.setBounds(200, 100, TXXT_WIDTH, TXXT_HEIGHT);
        contentpane.add(txtfld);

        LabelKet = new JLabel("Check Up ");
        LabelKet.setBounds(100, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(LabelKet);

        cb1 = new JCheckBox("Umum");
        cb1.setBounds(200, 210, CB_WIDTH, CB_HEIGHT);
        contentpane.add(cb1);

        cb2 = new JCheckBox("UGD");
        cb2.setBounds(300, 210, CB_WIDTH, CB_HEIGHT);
        contentpane.add(cb2);

        cb3 = new JCheckBox("Lab");
        cb3.setBounds(400, 210, CB_WIDTH, CB_HEIGHT);
        contentpane.add(cb3);

        antri = new JLabel("Nomor antrian ");
        antri.setBounds(100, 230, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(antri);

        button1 = new JButton("45");
        contentpane.add(button1);
        button1.setBounds(200, 240,100,100);
        button1.setFont(new Font("Times New Roman", Font.BOLD, 60));
        
        ok = new JButton("ok");
        ok.setBounds(200, 350, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(ok);
        
         next = new JButton("next");
        next.setBounds(350, 350, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(next);
        
         cancel = new JButton("cancel");
        cancel.setBounds(500, 350, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(cancel);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
