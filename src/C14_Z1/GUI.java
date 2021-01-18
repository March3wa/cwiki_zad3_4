package C14_Z1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GUI {

    JFrame ramka;
    JPanel panel;
    JButton kolorPrzycisk;
    //JButton pozycjaPrzycisk;

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.start();
    }

    public void start() {

        ramka = new JFrame();
        panel = new JPanel();
        kolorPrzycisk = new JButton("Zmień kolor tła");
        ramka.getContentPane().add(panel);
        panel.add(BorderLayout.SOUTH, kolorPrzycisk);
        //panel.add(pozycjaPrzycisk);
        kolorPrzycisk.addActionListener(new KolorListener());

        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setVisible(true);
        ramka.setSize(500, 500);

    }
        class KolorListener implements ActionListener{
            Color color;
            Random random = new Random();
            public void actionPerformed(ActionEvent e) {
                color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256));
                panel.setBackground(color);
            }
        }
}

