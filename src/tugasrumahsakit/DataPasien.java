/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasrumahsakit;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class DataPasien extends JFrame {

    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 800;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 40;
    private static final int TXT_WIDTH = 400;
    private static final int TXT_HEIGHT = 40;
    private static final int TXXT_WIDTH = 300;
    private static final int TXXT_HEIGHT = 100;
    private static final int RADIO_WIDTH = 100;
    private static final int RADIO_HEIGHT = 30;
    private static final int COMBO_WIDTH = 60;
    private static final int COMBO_HEIGHT = 20;
    private static final int CB_WIDTH = 90;
    private static final int CB_HEIGHT = 20;
    private JButton cancelButton;
    private JButton okButton;
    private JTextField textfield;
    private JLabel LabelNama, LabelKet, keluhan;
    private JComboBox tanggal;
    private JComboBox bulan;
    private JComboBox tahun;
    private JLabel alamat, LabelJenis, LabelTanggal;
    private JRadioButton radio1, radio2;
    private JCheckBox cb1, cb2, cb3;
    private JTextField txtfld;

    public static void main(String[] args) {
        DataPasien frame = new DataPasien();
        frame.setVisible(true);
    }

    public DataPasien() {
        Container contentpane = getContentPane();

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

        LabelJenis = new JLabel("Jenis Kelamin");
        LabelJenis.setBounds(100, 80, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(LabelJenis);

        radio1 = new JRadioButton("Laki-laki");
        radio1.setBounds(200, 80, RADIO_WIDTH, RADIO_HEIGHT);
        contentpane.add(radio1);

        radio2 = new JRadioButton("Perempuan");
        radio2.setBounds(300, 80, RADIO_WIDTH, RADIO_HEIGHT);
        contentpane.add(radio2);

        LabelTanggal = new JLabel("Tanggal Lahir ");
        LabelTanggal.setBounds(100, 110, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(LabelTanggal);

        tanggal = new JComboBox();
        tanggal.setBounds(200, 120, COMBO_WIDTH, COMBO_HEIGHT);
        tanggal.addItem("1");
        tanggal.addItem("2");
        tanggal.addItem("3");
        contentpane.add(tanggal);

        bulan = new JComboBox();
        bulan.setBounds(270, 120, COMBO_WIDTH, COMBO_HEIGHT);
        bulan.addItem("January");
        bulan.addItem("February");
        contentpane.add(bulan);

        tahun = new JComboBox();
        tahun.setBounds(340, 120, COMBO_WIDTH, COMBO_HEIGHT);
        tahun.addItem("2018");
        tahun.addItem("2017");
        contentpane.add(tahun);

        alamat = new JLabel("Alamat");
        alamat.setBounds(100, 160, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(alamat);

        txtfld = new JTextField();
        txtfld.setBounds(200, 170, TXXT_WIDTH, TXXT_HEIGHT);
        contentpane.add(txtfld);

        keluhan = new JLabel("Keluhan");
        keluhan.setBounds(100, 280, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(keluhan);

        txtfld = new JTextField();
        txtfld.setBounds(200, 280, TXXT_WIDTH, TXXT_HEIGHT);
        contentpane.add(txtfld);

        LabelKet = new JLabel("Check Up ");
        LabelKet.setBounds(100, 380, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(LabelKet);

        cb1 = new JCheckBox("Umum");
        cb1.setBounds(200, 390, CB_WIDTH, CB_HEIGHT);
        contentpane.add(cb1);

        cb2 = new JCheckBox("UGD");
        cb2.setBounds(300, 390, CB_WIDTH, CB_HEIGHT);
        contentpane.add(cb2);

        cb3 = new JCheckBox("Lab");
        cb3.setBounds(400, 390, CB_WIDTH, CB_HEIGHT);
        contentpane.add(cb3);

        okButton = new JButton("oke");
        okButton.setBounds(200, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(okButton);

        cancelButton = new JButton("batal");
        cancelButton.setBounds(350, 420, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentpane.add(cancelButton);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
