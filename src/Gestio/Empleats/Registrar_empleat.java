package Gestio.Empleats;

import Biblioteques.Arrays;
import Biblioteques.IO;
import Classes.Empleat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registrar_empleat {
    private static JFrame frame_menuAltaEmpleats = new JFrame("panelAltaEmpleats");
    private JPanel panelAltaEmpleats;
    private JTextField nominaText;
    private JTextField nomText;
    private JTextField cognomnsText;
    private JTextField dniText;
    private JButton REGISTRARButton;
    private JButton ENREREButton;
    private JButton buidarButton;

    public Registrar_empleat() {
        REGISTRARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (nomText.getText().isEmpty() || cognomnsText.getText().isEmpty() || dniText.getText().isEmpty() || nominaText.getText().isEmpty()){
                    JOptionPane.showMessageDialog(frame_menuAltaEmpleats, "Error: Hi ha algun camp per a omplir");
                    IO.imprimirTI("Se ha intentat registrar un empleat en algun camp buit");
                }else {
                    try {
                        Arrays.arrayPersones.add(new Empleat(nomText.getText(), cognomnsText.getText(),dniText.getText(),nominaText.getText()));
                        IO.imprimirTI(((Empleat) Arrays.arrayPersones.get(Arrays.arrayPersones.size()-1)).toString());
                        IO.imprimirTI("Se ha registrat un empleat");
                        JOptionPane.showMessageDialog(frame_menuAltaEmpleats, "Empleat donat de alta correctament");
                        frame_menuAltaEmpleats.setVisible(false);
                        Gestio.Empleats.Menu_empleats.mostar_menu_empleats();
                        IO.imprimirTI("-------------------------------------------------------------------------");
                    } catch (Exception error) {
                        IO.imprimirTI("Error: "+error);
                    }
                }
            }
        });
        ENREREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_menuAltaEmpleats.setVisible(false);
                Menu_empleats.mostar_menu_empleats();
            }
        });
        buidarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nomText.setText("");
                cognomnsText.setText("");
                dniText.setText("");
                nominaText.setText("");
            }
        });
    }

    public static void Menu_alta_empleats(){
        frame_menuAltaEmpleats.setContentPane(new Registrar_empleat().panelAltaEmpleats);
        frame_menuAltaEmpleats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_menuAltaEmpleats.pack();
        frame_menuAltaEmpleats.setVisible(true);
        frame_menuAltaEmpleats.setLocationRelativeTo(null);

    }

    public static void mostar_menu_alta_empleats(){
        Menu_alta_empleats();
    }

}
