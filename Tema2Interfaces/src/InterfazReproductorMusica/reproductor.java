package InterfazReproductorMusica;

import java.awt.BorderLayout;

import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class reproductor {

      public static void main(String[] args) {

            JFrame frame=new JFrame("reproductor");

            JPanel p1=new JPanel(new GridLayout(3,3));

            JButton button = new JButton("ON/OFF");

            p1.add(button);

            button = new JButton("PLAY");

            p1.add(button);

            button = new JButton("RECORD");

            p1.add(button);

            button = new JButton("PISTA ANTERIOR");

            p1.add(button);

            button = new JButton("PAUSE");

            p1.add(button);

            button = new JButton("PISTA POSTERIOR");

            p1.add(button);

            button = new JButton("REBOBINAR ATRÁS");

            p1.add(button);

            button = new JButton("STOP");

            p1.add(button);

            button = new JButton("REBOBINAR DELANTE");

            p1.add(button);

            frame.add(p1, BorderLayout.CENTER);

            frame.pack();

            frame.setVisible(true);

      }

}