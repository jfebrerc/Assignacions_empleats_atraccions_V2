package Biblioteques;

import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Arrays {
    /** PERSONES */
    private static int contador = 0;
    private static int MAXIM_PERSONES = 1000;
    public static int getContador(){
        return contador;
    }
    public static int getMaximPersones(){
        return MAXIM_PERSONES;
    }
    //public static Persona[] arrayPersones = new Persona[MAXIM_PERSONES];
    public static ArrayList<Persona> arrayPersones = new ArrayList<Persona>();
    public static void augmentarPersona(){
        contador = contador +1;
    }

    public static void eliminarPersona(){
        contador = contador -1;
    }
}
