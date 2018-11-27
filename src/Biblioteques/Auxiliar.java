package Biblioteques;

import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import java.util.Iterator;

public class Auxiliar {
    public static void llistar_empleats(JTextField textBusqueda, JList llistaEmpleats){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %18s %71s %69s %71s", "ID", "NOM", "COGNOM", "DNI", "NOMINA");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
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
}
