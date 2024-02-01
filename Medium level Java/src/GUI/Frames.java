package GUI;

import javax.swing.*;
import java.awt.*;

public class Frames {
    public static void main(String[] args) {
        //Jframe - Graphical user interface window
        JFrame frame = new JFrame(); //creating a instance
        frame.setTitle("My First GUI Frame"); //setting title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //if x is clicked exiting
        frame.setResizable(true); //to resize
        frame.setSize(1080, 1080); //display width
        frame.setVisible(true); //once run is click, this makes frame visible on screeen
        frame.getContentPane().setBackground(Color.lightGray);

        ImageIcon image = new ImageIcon("src/GUI/IMG_6717.heic");
        frame.setIconImage(image.getImage());

    }
}
