package Gestio.Empleats;

import Biblioteques.Arrays;
import Biblioteques.IO;
import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_empleats {
    private static JFrame frame_menuEmpleats = new JFrame("Menu_empleats");
    private JPanel menu_empleats;
    private JButton enrereButton;
    private JButton testButton;
    private JButton eliminarEmpleatButton;
    private JButton registrarEmpleatButton;
    private JButton modificarEmpleatsButton;
    private JButton llistarEmpleatsButton;

    public Menu_empleats() {
        registrarEmpleatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_menuEmpleats.setVisible(false);
                Registrar_empleat.mostar_menu_alta_empleats();
            }
        });
        llistarEmpleatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Arrays.arrayPersones.isEmpty()){
                    JOptionPane.showMessageDialog(frame_menuEmpleats, "No hi han empleats registrats");
                }else{
                    frame_menuEmpleats.setVisible(false);
                    Gestionar_empleats.Menu_llista_empleats();
                }
            }
        });
        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i=0; i<100;i++){
                    Arrays.arrayPersones.add(new Empleat("nom"+(i+1), "cognom"+(i+1),"dni"+(i+1),"nomina"+(i+1)));
                }
                for (Persona p : Arrays.arrayPersones){
                    System.out.println(p);
                }
                JOptionPane.showMessageDialog(frame_menuEmpleats, "Empleats de prova carregats correctament");
            }
        });
    }

    public static void Menu_empleats(){
        frame_menuEmpleats.setContentPane(new Menu_empleats().menu_empleats);
        frame_menuEmpleats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_menuEmpleats.pack();
        frame_menuEmpleats.setVisible(true);
        frame_menuEmpleats.setLocationRelativeTo(null);

    }

    public static void mostar_menu_empleats(){
        frame_menuEmpleats.setVisible(true);
    }
}
