package com.amigoscode;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MFrame extends JFrame implements ActionListener {
    //adding components
    JCheckBox checkBox = new JCheckBox();
    ImageIcon title;
    JButton btn;
    JLabel name;
    JLabel surename;
    JLabel email;
    JLabel password;
    JTextField Name;
    JTextField SureName;
    JTextField Email;
    JPasswordField Password;
//initialization
    MFrame(){

//creating frame
        title = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\unnamed.jpg");
        this.setSize(300,400);
        ImageIcon image = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\unnamed.jpg");
        this.setIconImage(image.getImage());
        this.setTitle("log in");
        this.setLayout(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exit out of app

//adding and creating labels and makking them looking goooood
        name = new JLabel("Name");
        name.setBounds(20, 40, 80, 30);
        add(name);
        surename=new JLabel("Last Name:");
        surename.setBounds(20, 80, 80,30);
        add(surename);
        email =new JLabel("Email:");
        email.setBounds(20,120, 80,30);
        add(email);
        password = new JLabel("Password");
        password.setBounds(20,160,80,30);
        add(password);

//adding textfields and passwordfield
        Name = new JTextField();
        Name.setBounds(100, 40, 100,30);
        add(Name);
        SureName  = new JTextField();
        SureName.setBounds(100,80, 100,30);
        add(SureName);
        Email = new JTextField();
        Email.setBounds(100,120, 100,30);
        add(Email);
        Password = new JPasswordField();
        Password.setBounds(100,160,100,30);
        add(Password);
//adding checkbox and connect to action
        checkBox.setText("i am not a robot");
        checkBox.setBounds(90,250,113,22);
        checkBox.addActionListener(this);
        checkBox.setSelected(false);
        checkBox.addActionListener(e -> new MyFrame());//add action without huge another method
        add(checkBox);
//adding btn and connect to the action
        btn = new JButton("Submit");
        btn.setBounds(100,280,100,30);
        btn.setFocusable(false);
        btn.addActionListener(this);
        btn.setVisible(true);
        add(btn);

        this.setVisible(true);//makes everything visible

    }

//this is action that will be displayed
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn){

            if (checkBox.isSelected()){
                String mesage = "hello" +"  " + Name.getText();
                JOptionPane.showMessageDialog(null,mesage);//add msgbox
            }
            else {
                String huy = "Please check that you are not a robot";
                JOptionPane.showMessageDialog(null,huy); //add msgbox
            }
        }
    }
}





