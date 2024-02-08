package GUI;

import javax.swing.*;
import java.awt.*;

public class panels {
    public static void main(String[] args) {
        //Jpanel = A GUI component that functions as a container to hold other components

        ImageIcon icon = new ImageIcon("src/GUI/dude.jpeg");
        JLabel label = new JLabel();
        label.setText("Hi");
        //label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);


        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.red);
        redpanel.setBounds(0,0,250,250);

        JPanel bluepanel = new JPanel();
        bluepanel.setBackground(Color.blue);
        bluepanel.setBounds(250,0,250,250);

        JPanel greenpanel = new JPanel();
        greenpanel.setBackground(Color.green);

        greenpanel.setBounds(250,0,500,250);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(750,750);
        greenpanel.add(label);
        //bluepanel.add(label);
        frame.add(redpanel);
        frame.add(bluepanel);
        frame.add(greenpanel);
    }
}
