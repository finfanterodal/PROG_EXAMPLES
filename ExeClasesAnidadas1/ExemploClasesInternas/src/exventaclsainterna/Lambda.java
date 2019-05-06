package exventaclsainterna;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author finfanterodal
 */
public class Lambda {

    JPanel panel;
    JButton boton;
    JFrame marco;

    public Lambda() {
        marco = new JFrame();
        panel = new JPanel();
        boton = new JButton("pon cor");
        marco.setSize(500, 200);

        panel.add(boton);
        marco.add(panel);
        boton.addActionListener((ActionEvent e) -> {
            panel.setBackground(Color.red);
        });

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}
