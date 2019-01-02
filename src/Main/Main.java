package Main;

import Biblioteques.Arrays;
import Classes.Assignacio;
import Classes.Atraccio;
import Gestio.Atraccions.MenuAtraccioForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    private JPanel frameMain;
    private JButton GESTIOEMPLEATSButton;
    private JButton GESTIOZONESButton;
    private JButton SORTIRButton;
    private JButton GESTIOASIGGNACIONSButton;
    private static JFrame frame_main = new JFrame("main");


    public main() {
        GESTIOEMPLEATSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_main.setVisible(false);
                Gestio.Empleats.Menu_empleats.Menu_empleats();
            }
        });
        SORTIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_main.dispose();
            }
        });
        GESTIOZONESButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MenuAtraccioForm menu1 = new MenuAtraccioForm();
                menu1.setVisible(true);
                frame_main.setVisible(false);
            }
        });
        GESTIOASIGGNACIONSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Arrays.arrayPersones.isEmpty() || Atraccio.arrayAtraccio.isEmpty()){
                    JOptionPane.showMessageDialog(frame_main, "No es poden registrar assignacions sense empleats o atraccions");
                }else {
                    frame_main.setVisible(false);
                    Gestio.Assignacio_EA.Menu_assignacio.Menu_assignacio();
                }
            }
        });
    }

    public static void main(String[] args){
        frame_main.setContentPane(new main().frameMain);
        frame_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_main.pack();
        frame_main.setVisible(true);
        frame_main.setLocationRelativeTo(null);
    }
    public static void mostrar_menu_principal(){
        frame_main.setVisible(true);
    }
}
