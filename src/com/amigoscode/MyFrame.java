
package com.amigoscode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
//adding components
    JButton button;
    JLabel catLabel;
    JLabel cat1Label;
    JLabel dogLabel;
    JLabel dog1Label;
    JLabel wolfLabel;
    JLabel wolf1Label;
    JCheckBox catBox;
    JCheckBox cat1Box;
    JCheckBox dogBox;
    JCheckBox dog1Box;
    JCheckBox wolfBox;
    JCheckBox wolf1Box;
    ImageIcon catIcon;
    ImageIcon cat1Icon;
    ImageIcon dogIcon;
    ImageIcon dog1Icon;
    ImageIcon wolfIcon;
    ImageIcon wolf1Icon;



//creating frame and what will be inside and how it will be look like
    MyFrame() {

//adding some images
        catIcon = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\IT\\v989187-1844716273.jpg");
        cat1Icon = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\IT\\1gzp5Wdn6Yblu3CJaTPfPimrqfPLxBSqOR7HunfJFAnJ1wwMFOsXpFKMVBsB0lPcjChOseIi.jpg");
        dogIcon = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\IT\\ad6a73639b2904c013e2efdd3472e828_100_100.jpg");
        dog1Icon = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\IT\\2yR20quaDVCBP88wPlFTZWlnoTtRS9f-UKKQLZDLtL3KeXHp45jt7f-ZWwO91vrToGt-7Nzn.jpg");
        wolfIcon = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\IT\\-eLX4QFvw5yAqxYx4BBLlT5ZbAIW0eB87wf1CjHbTukOA8qeJ7Wn2J2P22FCd4OEIQMkA7Gb.jpg");
        wolf1Icon = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\IT\\picture-1933-1590333732.jpg");

//creating labels
        catLabel = new JLabel();
        catLabel.setIcon(catIcon);
        catLabel.setBounds(50, 100, 100, 100);

        dogLabel = new JLabel();
        dogLabel.setIcon(dogIcon);
        dogLabel.setBounds(160, 100, 100, 100);

        wolfLabel = new JLabel();
        wolfLabel.setIcon(wolfIcon);
        wolfLabel.setBounds(50, 210, 100, 100);

        cat1Label = new JLabel();
        cat1Label.setIcon(cat1Icon);
        cat1Label.setBounds(160, 210, 100, 100);

        dog1Label = new JLabel();
        dog1Label.setIcon(dog1Icon);
        dog1Label.setBounds(50, 320, 100, 100);

        wolf1Label = new JLabel();
        wolf1Label.setIcon(wolf1Icon);
        wolf1Label.setBounds(160, 320, 100, 100);


 //creating checkboxes and connecting them with some simple actions
        catBox = new JCheckBox();
        catBox.setFocusable(false);
        catBox.setBackground(new Color(255, 250, 250));
        catBox.setBounds(47, 100, 18, 15);
        catBox.addActionListener(this);


        dogBox = new JCheckBox();
        dogBox.setFocusable(false);
        dogBox.setBackground(new Color(255, 250, 250));
        dogBox.setBounds(157, 100, 18, 15);
        dogBox.addActionListener(this);

        wolfBox = new JCheckBox();
        wolfBox.setFocusable(false);
        wolfBox.setBackground(new Color(255, 250, 250));
        wolfBox.setBounds(47, 210, 18, 15);
        wolfBox.addActionListener(this);

        cat1Box = new JCheckBox();
        cat1Box.setFocusable(false);
        cat1Box.setBackground(new Color(255, 250, 250));
        cat1Box.setBounds(157, 210, 18, 15);
        cat1Box.addActionListener(this);

        dog1Box = new JCheckBox();
        dog1Box.setFocusable(false);
        dog1Box.setBackground(new Color(255, 250, 250));
        dog1Box.setBounds(47, 320, 18, 15);
        dog1Box.addActionListener(this);

        wolf1Box = new JCheckBox();
        wolf1Box.setFocusable(false);
        wolf1Box.setBackground(new Color(255, 250, 250));
        wolf1Box.setBounds(157, 320, 18, 15);
        wolf1Box.addActionListener(this);


        this.setSize(330, 550); //sets size of a this
        this.setTitle("Captcha"); //sets title of a this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); //exit out of app

        ImageIcon image = new ImageIcon("C:\\Users\\intel\\OneDrive\\Рабочий стол\\unnamed.jpg");
        this.setIconImage(image.getImage());//adding image
        this.getContentPane().setBackground(new Color(255, 250, 250));

        JLabel label = new JLabel();
        label.setText("Choose image where only cat is given");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(217, 104, 70));
        label.setFont(new Font("Times New Roman", Font.PLAIN, 20));//some creativity things
//adding button and connect with some actions
        button = new JButton();
        button.setBounds(105, 450, 100, 50);
        button.setText("Submit");
        button.setFocusable(false);//just looks better
        button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        button.setBackground(new Color(89, 98, 53));
        button.setForeground(Color.white);
        button.addActionListener(this);

//adding everything into a frame
        this.add(catBox);
        this.add(cat1Box);
        this.add(dogBox);
        this.add(dog1Box);
        this.add(wolfBox);
        this.add(wolf1Box);


        this.add(catLabel);
        this.add(dogLabel);
        this.add(cat1Label);
        this.add(wolfLabel);
        this.add(dog1Label);
        this.add(wolf1Label);
        this.add(button);
        this.add(label);
        this.setVisible(true);//make this visual
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){

            if (catBox.isSelected() && cat1Box.isSelected() && !dog1Box.isSelected() &&!dogBox.isSelected()&&!wolf1Box.isSelected() && !wolf1Box.isSelected()){
                String answr = "You are a human";
                JOptionPane.showMessageDialog(null,answr);//made msgbox
                this.setVisible(false);

            }

            else {
                String err = "Please try again";
                JOptionPane.showMessageDialog(null,err);//made msgbox
            }

        }

    }
}