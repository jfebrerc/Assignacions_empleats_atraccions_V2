package Gestio.Empleats;

import Biblioteques.Arrays;
import Biblioteques.Auxiliar;
import Biblioteques.IO;
import Classes.Empleat;
import Classes.Persona;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.*;
import java.util.Iterator;

public class Gestionar_empleats extends javax.swing.JFrame{
    private JPanel LlistarPanel;
    private JList llistaEmpleats;
    private JButton llimpiarButton;
    private JTextField textBusqueda;
    private JButton CARREGARButton;
    private JButton ELIMINARButton;
    private JButton ENREREButton;
    private JTextField nomText;
    private JTextField cognomsText;
    private JTextField dniText;
    private JTextField nominaText;
    private JButton BUIDARButton;
    private JButton modificarButton;
    private static JFrame frame_llistaEmpleats = new JFrame("LlistarPanel");
    int seleccio = -1;

    public Gestionar_empleats() {
        llimpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textBusqueda.setText("");
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
        LlistarPanel.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats); //Llistar empleats al entrar al jframe
            }
        });
        textBusqueda.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats);
            }
        });
        ELIMINARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //JButton ELIMINARButton = new JButton("ELIMINARButton");
                //getContentPane().add(ELIMINARButton);
                Object indices2=llistaEmpleats.getSelectedValue();
                IO.imprimirTI("Contingut: "+ (indices2));
                if (indices2 == null){
                    JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
                }else {
                    try{
                        int dialogButton = JOptionPane.YES_NO_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog(null, "Estas segur de que vols eliminar el empleat " + Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getNom() + "?", "CONFIRMACIO", dialogButton);
                        if(dialogResult == 0) {
                            IO.imprimirTI("Opcio 'SI'");
                            IO.imprimirTI("Posicio: " + Arrays.arrayPersones.indexOf(indices2));
                            IO.imprimirTI("Se ha eliminat el empleat: " + Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)));
                            Arrays.arrayPersones.remove(indices2);
                            seleccio = -1;
                            nomText.setText("");
                            cognomsText.setText("");
                            dniText.setText("");
                            nominaText.setText("");
                            Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats);
                        }else {
                            IO.imprimirTI("Opcio 'NO'");
                        }
                }catch (Exception error){
                        IO.imprimirTI("Error al eliminar empleat: " + error);
                    }
            }
            }
        });
        modificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //MODIFICAR
                if (seleccio==-1){
                    JOptionPane.showMessageDialog(frame_llistaEmpleats, "Carrega un empleat per a modificar");
                }else {
                    try {
                        Arrays.arrayPersones.get(seleccio).setNom(nomText.getText());
                        Arrays.arrayPersones.get(seleccio).setCognom1(cognomsText.getText());
                        Arrays.arrayPersones.get(seleccio).setDNI(dniText.getText());
                        ((Empleat)Arrays.arrayPersones.get(seleccio)).setNomina(nominaText.getText());
                        Auxiliar.llistar_empleats(textBusqueda, llistaEmpleats);
                        JOptionPane.showMessageDialog(frame_llistaEmpleats, "Empleat " + Arrays.arrayPersones.get(seleccio).getNom()  +  " modificat correctament");
                    } catch (Exception error) {
                        IO.imprimirTI("Error al modificar: " + error);
                    }
                }
            }
        });
        CARREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //CARREGAR DADES ELEMENT
                Object indices2=llistaEmpleats.getSelectedValue();
                IO.imprimirTI("Contingut: "+ (indices2));
                if (indices2 == null){
                    JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
                }else {
                    try {
                        nomText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getNom());
                        cognomsText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getCognom1());
                        dniText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getDNI());
                        nominaText.setText(((Empleat)Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2))).getNomina());
                        seleccio = Arrays.arrayPersones.indexOf(indices2);
                        IO.imprimirTI("Element seleccionat: " + seleccio);
                    } catch (Exception error) {
                        IO.imprimirTI("Error al carregar empleat: " + error);
                    }
                }
            }
        });
        BUIDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccio = -1;
                nomText.setText("");
                cognomsText.setText("");
                dniText.setText("");
                nominaText.setText("");
            }
        });
        llistaEmpleats.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getClickCount()==2 && e.getButton() == MouseEvent.BUTTON1){
                    Object indices2=llistaEmpleats.getSelectedValue();
                    IO.imprimirTI("Contingut: "+ (indices2));
                    if (indices2 == null){
                        JOptionPane.showMessageDialog(frame_llistaEmpleats, "Selecciona un empleat");
                    }else {
                        try {
                            nomText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getNom());
                            cognomsText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getCognom1());
                            dniText.setText(Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2)).getDNI());
                            nominaText.setText(((Empleat)Arrays.arrayPersones.get(Arrays.arrayPersones.indexOf(indices2))).getNomina());
                            seleccio = Arrays.arrayPersones.indexOf(indices2);
                            IO.imprimirTI("Element seleccionat: " + seleccio);
                        } catch (Exception error) {
                            IO.imprimirTI("Error al carregar empleat: " + error);
                        }
                    }
                }
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
