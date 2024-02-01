package GUI;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("/Users/issackondreddy/Desktop/Education/Java/Medium level Java/src/GUI/Inthandham.wav");
        AudioInputStream audiostream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audiostream);
        String response = "";
        while (!response.equals("Q")){
            System.out.println("Play = P, Stop = S, Reset = R, Quit = Q");
            System.out.print("Enter your choice: ");
            response = scanner.next();
            response = response.toUpperCase();
            switch (response){
                case "P":
                    clip.start();
                    break;
                case "S":
                    clip.stop();
                    break;
                case "R":
                    clip.setMicrosecondPosition(0);
                    break;
                case "Q":
                    clip.close();
                    break;
                default:
                    System.out.println("Enter a valid character");
            }
        }

    }
}
