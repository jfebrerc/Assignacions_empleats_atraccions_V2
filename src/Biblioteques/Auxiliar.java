/**
 * <h1>Auxiliar</h1>
 * Clase on es guarden les diferents funcions auxiliars que se utilitzen en diferents parts del programa
 * <p>
 *
 *
 * @author  Jose Febrer
 * @version 1.0
 * @since   2018-11-27
 */

package Biblioteques;

import Classes.Assignacio;
import Classes.Atraccio;
import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.TimeZone;

public class Auxiliar {
    /** FUNCIO PER A LLISTAR ELS EMPLEATS */
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

    /**FUNCIO PER A CARREGAR DADES ALS DIFERENTS CAMPS DE TEXT PER A MODIFICAR-LES*/
    public static int carregar_dades_empleats(JList llistaEmpleats, JFrame frame_llistaEmpleats, JTextField nomText, JTextField cognomsText, JTextField dniText, JTextField nominaText, int seleccio){
        Object indices2=llistaEmpleats.getSelectedValue();  //Es guarda la seleccio en un objecte
        IO.imprimirTI("Contingut: "+ (indices2));
        if (indices2 == null){  //Es comprova si hi ha algo seleccionat
            JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
        }else {
            try { //Si hi ha algo seleccionat, se intenten carregar les dades als diferents camps de text
                nomText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getNom());
                cognomsText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getCognom1());
                dniText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getDNI());
                nominaText.setText(((Empleat)Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2))).getNomina());
                seleccio = Arrays.arrayPersones.indexOf(indices2);
                IO.imprimirTI("Element seleccionat: " + seleccio);
            } catch (Exception error) { //Si retorna algun tipus de error, elimina qualsevol tipus de seleccio activa i buida 
                IO.imprimirTI("Error al carregar empleat: " + error);
                seleccio = -1;
                nomText.setText("");
                cognomsText.setText("");
                dniText.setText("");
                nominaText.setText("");
            }
        }
        return seleccio;
    }
    public static void llistar_Atraccions(JTextField textBusqueda, JList llistaAtraccions){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %30s %35s %30s %30s %30s %30s", "ID", "NOM", "TIPUS", "DATA INAUGURACIO", "ALTURA MIN", "ACCESSIBILITAT", "ACCES EXPRESS");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Atraccio> iteradorAtraccions = Atraccio.arrayAtraccio.iterator();
        while (iteradorAtraccions.hasNext()){
            Atraccio a = iteradorAtraccions.next();
            if (a.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(a);
            }
        }
        llistaAtraccions.setModel(d1m);
    }

    public static void llistar_Assignacio(JTextField textBusqueda, JList llistaAtraccions){
        String cerca = textBusqueda.getText();
        DefaultListModel d1m = new DefaultListModel();
        String titol_columna = String.format("%s %18s %71s %69s", "ID", "EMPLEAT", "ATRACCIO", "DATA");
        String divisor = "------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        d1m.addElement(titol_columna);
        d1m.addElement(divisor);
        Iterator<Assignacio> iteradorAssignacions = Arrays.arrayAssignacio.iterator();
        while (iteradorAssignacions.hasNext()){
            Assignacio assign = iteradorAssignacions.next();
            if (assign.toString().toLowerCase().contains(cerca.toLowerCase())){
                d1m.addElement(assign);
            }
        }
        llistaAtraccions.setModel(d1m);
    }

    public static void log(String s) throws IOException {
        TimeZone tz = TimeZone.getTimeZone("CET"); // or PST, MID, etc ...
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy.mm.dd hh:mm:ss a");
        df.setTimeZone(tz);
        String currentTime = df.format(now);
        FileWriter aWriter = new FileWriter("E:\\Carpetes\\log.txt", true);
        aWriter.write(currentTime + " - " + s + "\n");
        aWriter.flush();
        aWriter.close();
    }
}
