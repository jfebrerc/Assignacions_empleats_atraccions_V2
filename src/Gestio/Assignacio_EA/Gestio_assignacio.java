package Gestio.Assignacio_EA;

import Biblioteques.Arrays;
import Biblioteques.Auxiliar;
import Biblioteques.IO;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Gestio_assignacio {
    private JPanel assignJpanel;
    private JList JlistAssign;
    private JTextField buscarAssign;
    private JButton BUIDARButton;
    private JButton CARREGARButton;
    private JButton ELIMINARButton;
    private JTextField dataText;
    private JButton BUIDARButton1;
    private JButton ENREREButton;
    private JButton MODIFICARButton;
    private static JFrame frame_gestioAssignacio = new JFrame("assignJpanel");
    int seleccio = -1;


    public Gestio_assignacio() {
        JlistAssign.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                Auxiliar.llistar_Assignacio(buscarAssign, JlistAssign);
            }
        });
        ENREREButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_gestioAssignacio.setVisible(false);
                Menu_assignacio.Menu_assignacio();
            }
        });
        BUIDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAssign.setText("");
            }
        });
        buscarAssign.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Auxiliar.llistar_Assignacio(buscarAssign, JlistAssign);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Auxiliar.llistar_Assignacio(buscarAssign, JlistAssign);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                Auxiliar.llistar_Assignacio(buscarAssign, JlistAssign);
            }
        });
        CARREGARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object indiceAssign=JlistAssign.getSelectedValue();
                IO.imprimirTI("Contingut: "+ (indiceAssign));
                if (indiceAssign == null){
                    JOptionPane.showMessageDialog(frame_gestioAssignacio, "Selecciona una assignacio");
                }else {
                    try {
                        seleccio = Arrays.arrayAssignacio.indexOf(indiceAssign);
                        dataText.setText(Arrays.arrayAssignacio.get(seleccio).getData());
                    }catch (Exception error){
                        IO.imprimirTI("Error al carregar assignacions: " + error);
                        seleccio = -1;
                        dataText.setText("");
                    }
                }
            }
        });
        BUIDARButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seleccio = -1;
                dataText.setText("");
            }
        });
        MODIFICARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (seleccio==-1){
                    JOptionPane.showMessageDialog(frame_gestioAssignacio, "Carrega una assignacio per a modificar");
                }else {
                    try {
                        Arrays.arrayAssignacio.get(seleccio).setData(dataText.getText());
                        JOptionPane.showMessageDialog(frame_gestioAssignacio, "Assignacio modificada correctament");
                        Auxiliar.llistar_empleats(buscarAssign, JlistAssign);
                    } catch (Exception error) {
                        IO.imprimirTI("Error al modificar una assignacio: " + error);
                    }
                }
            }
        });
        ELIMINARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object seleccio_eliminar=JlistAssign.getSelectedValue();
                if (seleccio_eliminar==null){
                    JOptionPane.showMessageDialog(frame_gestioAssignacio, "No hi ha cap assignacio seleccionada");
                }else {
                    try {
                        Arrays.arrayAssignacio.remove(seleccio_eliminar);
                        JOptionPane.showMessageDialog(frame_gestioAssignacio, "Assignacio eliminada correctament");
                        Auxiliar.llistar_empleats(buscarAssign, JlistAssign);
                        seleccio = -1;
                        dataText.setText("");
                    } catch (Exception error) {
                        IO.imprimirTI("Error al eliminar una assignacio: " + error);
                    }
                }
            }
        });
    }

    public static void Gestio_assignacio_main(){
        frame_gestioAssignacio.setContentPane(new Gestio_assignacio().assignJpanel);
        frame_gestioAssignacio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame_gestioAssignacio.pack();
        frame_gestioAssignacio.setVisible(true);
        frame_gestioAssignacio.setLocationRelativeTo(null);

    }
}
