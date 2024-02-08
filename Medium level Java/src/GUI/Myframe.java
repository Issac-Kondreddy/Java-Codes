package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Myframe extends JFrame{
    JButton button;
    Myframe() {

        ImageIcon icon = new ImageIcon("src/GUI/img.png");
        button = new JButton();
        button.setBounds(0, 0, 700, 700);
        button.addActionListener(e -> System.out.println("Hey!!"));
        button.setText("Button!!");
        button.setIcon(icon);
        button.setHorizontalAlignment(JButton.CENTER);
        button.setVerticalAlignment(JButton.CENTER);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(1080, 1080);
        this.setVisible(true);
        this.add(button);
    }
}
