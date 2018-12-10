package Gestio.Assignacio_EA;

import Biblioteques.Arrays;
import Gestio.Empleats.Menu_empleats;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_assignacio {
    private JPanel panelAssignacio;
    private JButton REGISTRARASSIGNACIOButton;
    private JButton GESTIONARASSIGNACIONSButton;
    private JButton ENREREButton;
    private static JFrame frame_menuAssignacio = new JFrame("panelAssignacio");

    public Menu_assignacio() {
        ENREREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_menuAssignacio.setVisible(false);
                Main.main.mostrar_menu_principal();
            }
        });
        REGISTRARASSIGNACIOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_menuAssignacio.setVisible(false);
                Registrar_assignacio.Menu_assignacio();

            }
        });
        GESTIONARASSIGNACIONSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Arrays.arrayAssignacio.isEmpty()){
                    JOptionPane.showMessageDialog(frame_menuAssignacio, "No hi han assignacions registrades");
                }else {
                    frame_menuAssignacio.setVisible(false);
                    Gestio_assignacio.Gestio_assignacio_main();
                }
            }
        });
    }

    public static void Menu_assignacio(){
        frame_menuAssignacio.setContentPane(new Menu_assignacio().panelAssignacio);
        frame_menuAssignacio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_menuAssignacio.pack();
        frame_menuAssignacio.setVisible(true);
        frame_menuAssignacio.setLocationRelativeTo(null);

    }
    public static void mostrar_menu_assignacio(){
        frame_menuAssignacio.setVisible(true);
    }
}
