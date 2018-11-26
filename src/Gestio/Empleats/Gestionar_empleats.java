package Gestio.Empleats;

import Biblioteques.Arrays;
import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Iterator;

public class Gestionar_empleats {
    private JPanel LlistarPanel;
    private JList llistaEmpleats;
    private JButton llimpiarButton;
    private JTextField textBusqueda;
    private JButton CARREGARButton;
    private JButton ELIMINARButton;
    private JButton ENREREButton;
    private static JFrame frame_llistaEmpleats = new JFrame("LlistarPanel");

    public Gestionar_empleats() {
        llimpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cerca = textBusqueda.getText();
                DefaultListModel d1m = new DefaultListModel();
                String titol_columna = String.format("%s %71s %69s %71s", "NOM", "COGNOM", "DNI", "NOMINA");
                String divisor = "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
                d1m.addElement(titol_columna);
                d1m.addElement(divisor);
                Iterator<Persona> iteradorPersones = Arrays.arrayPersones.iterator();
                while (iteradorPersones.hasNext()){
                    Persona p = iteradorPersones.next();
                    if (p instanceof Empleat && p.toString().toLowerCase().contains(cerca.toLowerCase())){
                        d1m.addElement(p);
                    }
                }
                llistaEmpleats.setModel(d1m);
            }
        });
        LlistarPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
        ENREREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_llistaEmpleats.setVisible(false);
                Menu_empleats.mostar_menu_empleats();
            }
        });
    }

    public static void Menu_llista_empleats(){
        frame_llistaEmpleats.setContentPane(new Gestionar_empleats().LlistarPanel);
        frame_llistaEmpleats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_llistaEmpleats.pack();
        frame_llistaEmpleats.setVisible(true);
        frame_llistaEmpleats.setLocationRelativeTo(null);

    }
}
