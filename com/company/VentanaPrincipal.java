package com.company;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VentanaPrincipal extends JFrame {
    private JLabel campo1;
    private JList listas;
    private Visor v1;

    public VentanaPrincipal() {
        super("lista de canciones");
        setSize(800, 800);

        String[] lista = new String[3];
        lista[0] = "Ella y El";
        lista[1] = "Irresponsables";
        lista[2] = "Ganas Locas";

        listas = new JList(lista);


        campo1 = new JLabel("Lista de Canciones");

        setLayout(null);

        campo1.setBounds(350, 75, 150, 20);
        listas.setBounds(350, 175, 100, 80);


        add(campo1);
        add(listas);

        v1 = new Visor(this);
        listas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                v1.setVisible(true);
                setVisible(false);

            }
        });


    }
}
