package Gestio.Assignacio_EA;

import Biblioteques.Auxiliar;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Registrar_assignacio {
    private JList llistaEmpleats;
    private JList llistaAtraccions;
    private JTextField dataText;
    private JButton modificarButton;
    private JButton cancelarButton;
    private JTextField buscarEmpleats;
    private JButton buscarEButton;
    private JTextField buscarAtraccions;
    private JButton buscarAButton;
    private JPanel registrarAssignacio;
    private static JFrame frame_menuRegistrarAssignacio = new JFrame("registrarAssignacio");

    public Registrar_assignacio() {
        llistaAtraccions.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                Auxiliar.llistar_Atraccions(buscarAtraccions, llistaAtraccions);
            }
        });
    }

    public static void Menu_assignacio(){
        frame_menuRegistrarAssignacio.setContentPane(new Registrar_assignacio().registrarAssignacio);
        frame_menuRegistrarAssignacio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_menuRegistrarAssignacio.pack();
        frame_menuRegistrarAssignacio.setVisible(true);
        frame_menuRegistrarAssignacio.setLocationRelativeTo(null);

    }

}
