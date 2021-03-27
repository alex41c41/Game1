import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import javax.swing.JOptionPane;

public class musicStuff {

    void playMusic(String musicLocation) {

        try {
            File musicPath = new File(musicLocation);

            if(musicPath.exists())
            {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.start();
                clip.loop(50);

                //JOptionPane.showMessageDialog(null, "Press OK to stop playing");
            }
            else {
                System.out.println("cant find anything");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }
}
