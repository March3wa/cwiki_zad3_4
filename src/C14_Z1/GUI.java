package C14_Z1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI {

    JFrame ramka;
    JPanel panelPrzycisk;
    JPanel panelKolor;
    JButton kolorPrzycisk;
    //JButton pozycjaLicznik;
    JLabel pozycjalicznik;

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.start();
    }

    public void start() {

        pozycjalicznik = new JLabel();
        panelKolor = new JPanel();
        ramka = new JFrame();
        panelPrzycisk = new JPanel();
        kolorPrzycisk = new JButton("Zmień kolor tła");
        ramka.getContentPane().add(panelKolor);
        ramka.getContentPane().add(BorderLayout.EAST, kolorPrzycisk);
        ramka.getContentPane().add(BorderLayout.SOUTH,panelPrzycisk);
        panelPrzycisk.add(BorderLayout.CENTER, pozycjalicznik);
        //panelPrzycisk.add(BorderLayout.CENTER,kolorPrzycisk);
        //panel.add(pozycjaPrzycisk);
        kolorPrzycisk.addActionListener(new KolorListener());

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);
        ramka.setSize(500, 500);

    }
        class KolorListener implements ActionListener{
            Color color;
            Graphics circle;
            int i = 1;

            Random random = new Random();
            public void actionPerformed(ActionEvent e) {
                color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                panelKolor.setBackground(color);
                pozycjalicznik.setText("Kliknąłeś " + i + " razy");
                i++;
            }
        }
}

