import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.spi.AudioFileReader;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class Main {

    public static void main(String[] args) {

        Preview preview = new Preview();
        // Menu menu = new Menu();

        //    Quiz quiz = new Quiz();

        //     Quiz2 quiz2 = new Quiz2();



        String filepath = "C:\\Users\\Kaiser the Third\\Desktop\\Game\\src\\ufo.wav";
        musicStuff musicObject = new musicStuff();
        musicObject.playMusic(filepath);







    }


}