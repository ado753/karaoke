package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                VentanaPrincipal app = new VentanaPrincipal();
                //VentanaPrincipal
                app.setVisible(true);

            }
        });
    }
}
