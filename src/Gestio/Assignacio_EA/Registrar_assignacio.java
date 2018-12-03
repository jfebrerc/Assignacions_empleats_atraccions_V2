package Gestio.Assignacio_EA;

import Biblioteques.Arrays;
import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Classes.Assignacio;
import Classes.Atraccio;
import Classes.Empleat;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Registrar_assignacio {
    private JList llistaEmpleats;
    private JList llistaAtraccions;
    private JTextField dataText;
    private JButton assignarButton;
    private JButton cancelarButton;
    private JTextField buscarEmpleats;
    private JTextField buscarAtraccions;
    private JPanel registrarAssignacio;
    private JButton seleccionarEmpleat;
    private JButton seleccionarAtraccio;
    private JLabel empleatSeleccionat;
    private JLabel atraccioSeleccionada;
    private static JFrame frame_menuRegistrarAssignacio = new JFrame("registrarAssignacio");
    int seleccio_empleat = -1;
    int seleccio_atraccio = -1;

    public Registrar_assignacio() {
        llistaAtraccions.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                Auxiliar.llistar_Atraccions(buscarAtraccions, llistaAtraccions);
            }
        });
        llistaEmpleats.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                Auxiliar.llistar_empleats(buscarEmpleats, llistaEmpleats);
            }
        });
        seleccionarEmpleat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object indiceE=llistaEmpleats.getSelectedValue();
                IO.imprimirTI("Contingut: "+ (indiceE));
                if (indiceE == null){
                    JOptionPane.showMessageDialog(frame_menuRegistrarAssignacio, "Selecciona un empleat");
                }else {
                    try {
                        empleatSeleccionat.setText("Empleat seleccionat: " + Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indiceE)).getNom());
                        seleccio_empleat = Arrays.arrayPersones.indexOf(indiceE);
                    }catch (Exception error){
                        IO.imprimirTI("Error al llistar empleats a assignacions: " + error);
                    }
                }
            }
        });

        seleccionarAtraccio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object indiceA=llistaAtraccions.getSelectedValue();
                IO.imprimirTI("Contingut: "+ (indiceA));
                if (indiceA == null){
                    JOptionPane.showMessageDialog(frame_menuRegistrarAssignacio, "Selecciona una atraccio");
                }else {
                    try {
                        atraccioSeleccionada.setText("Atraccio seleccionada: " + Atraccio.arrayAtraccio.get(Atraccio.arrayAtraccio.indexOf(indiceA)).getNom());
                        seleccio_atraccio = Atraccio.arrayAtraccio.indexOf(indiceA);
                    }catch (Exception error){
                        IO.imprimirTI("Error al llistar atraccions a assignacions: " + error);
                    }
                }
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_menuRegistrarAssignacio.setVisible(false);
                Menu_assignacio.Menu_assignacio();
            }
        });
        assignarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (seleccio_empleat==-1 || seleccio_atraccio==-1 || dataText.toString().isEmpty()){
                    JOptionPane.showMessageDialog(frame_menuRegistrarAssignacio, "Error: Hi ha algun camp per a omplir");
                    IO.imprimirTI("Se ha intentat registrar una assignacio en algun camp buit");
                }else {
                    try {
                        Arrays.arrayAssignacio.add(new Assignacio((Empleat) Arrays.arrayPersones.get(seleccio_empleat), Atraccio.arrayAtraccio.get(seleccio_atraccio), dataText.getText()));
                        IO.imprimirTI("Size: " + Arrays.arrayAssignacio.size());
                        IO.imprimirTI(Arrays.arrayAssignacio.get(Arrays.arrayAssignacio.size()-1).toString());
                        IO.imprimirTI("Se ha registrat una assignacio");
                        JOptionPane.showMessageDialog(frame_menuRegistrarAssignacio, "Assignacio creada correctament");
                        seleccio_empleat = -1;
                        seleccio_atraccio = -1;
                        dataText.setText("");
                        empleatSeleccionat.setText("");
                        atraccioSeleccionada.setText("");
                    }catch (Exception error){
                        IO.imprimirTI("Error al assignar: " + error);
                    }
                }
            }
        });
        buscarEmpleats.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats(buscarEmpleats, llistaEmpleats);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats(buscarEmpleats, llistaEmpleats);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats(buscarEmpleats, llistaEmpleats);
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
