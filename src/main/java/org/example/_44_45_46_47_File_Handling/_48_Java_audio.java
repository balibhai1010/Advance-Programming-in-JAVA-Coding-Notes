package org.example._44_45_46_47_File_Handling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*; //Commonly supported formats include WAV, AU, and AIFF.
//https://www.youtube.com/audiolibrary?feature=blog
public class _48_Java_audio {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

        Scanner scanner = new Scanner(System.in);

        File file = new File("src/main/java/org/example/rough/Webdriver Torso.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";

        while(!response.equals("Q")) {
            System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
            System.out.print("Enter your choice: ");

            response = scanner.next();
            response = response.toUpperCase();

            switch(response) {
                case ("P"): clip.start();
                    break;
                case ("S"): clip.stop();
                    break;
                case ("R"): clip.setMicrosecondPosition(0);
                    break;
                case ("Q"): clip.close();
                    break;
                default: System.out.println("Not a valid response");
            }
        }
        System.out.println("Byeeee!");
    }
}
//how the fucc did it accept p,s,r,q