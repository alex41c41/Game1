import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Menu implements ActionListener {


    JButton spell = new JButton("Spell");
    JButton add = new JButton("Add");



// C:\\Users\\Kaiser the Third\\Desktop\\Lab 6\\src \\poki.mp3

    JLabel menu_picture = new JLabel();
    JLabel bottom = new JLabel();


    JFrame frame = new JFrame();
    //  JTextField textfield = new JTextField();
    //  JTextArea textarea = new JTextArea();


    public Menu() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,980);
        frame.getContentPane().setBackground(new Color(0,0,0));
        frame.setLayout(null);
        frame.setResizable(false);


        spell.setBounds(0,680,200,60);
        spell.setFont(new Font("MV Boli",Font.BOLD,35));
        spell.setFocusable(false);
        spell.addActionListener(this);
        spell.setText("English");

        add.setBounds(400,680,200,60);
        add.setFont(new Font("MV Boli",Font.BOLD,35));
        add.setFocusable(false);
        add.addActionListener(this);
        add.setText("Math");



        ImageIcon main_picture1 = new ImageIcon("C:\\Users\\Kaiser the Third\\Desktop\\Game\\src\\farms.gif");
        menu_picture.setForeground(new Color(255,0,0));
        menu_picture.setBounds(0,-10,700,700);
        menu_picture.setIcon(main_picture1);

        ImageIcon bot = new ImageIcon("C:\\Users\\Kaiser the Third\\Desktop\\Game\\src\\zoid_menu.jpg");
        bottom.setForeground(new Color(255,0,0));
        bottom.setBounds(0,740,600,200);
        bottom.setIcon(bot);


        frame.add(bottom);
        frame.add(menu_picture);
        frame.add(add);
        frame.add(spell);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==spell){
            English Quiz = new English();
            frame.dispose();
        }

        if(e.getSource()==add) {
            Math Quiz2 = new Math();
            frame.dispose();
        }


    }
}