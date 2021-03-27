import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Preview implements ActionListener {


    JButton take = new JButton("I'm Ready!");




// C:\\Users\\Kaiser the Third\\Desktop\\Lab 6\\src \\poki.mp3

    JLabel menu_picture = new JLabel();


    JFrame frame = new JFrame();
    //  JTextField textfield = new JTextField();
    //  JTextArea textarea = new JTextArea();


    public Preview() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,830);
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setLayout(null);
        frame.setResizable(false);


        take.setBounds(350,0,200,60);
        take.setFont(new Font("MV Boli",Font.BOLD,35));
        take.setFocusable(false);
        take.addActionListener(this);
        take.setText("Start!");





        ImageIcon main_picture1 = new ImageIcon("C:\\Users\\Kaiser the Third\\Desktop\\Game\\src\\pre2.png");
        menu_picture.setForeground(new Color(255,0,0));

        menu_picture.setBounds(0,0,900,900);
        menu_picture.setIcon(main_picture1);


        frame.add(menu_picture);
        frame.add(take);

        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==take){
            Menu menu = new Menu();
            frame.dispose();
        }


    }


}
