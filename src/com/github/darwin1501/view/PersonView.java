package com.github.darwin1501.view;

import javax.swing.*;
import java.awt.*;

public class PersonView{


    private JFrame frame;
    private JLabel labelName;
    private JLabel labelNameValue;
    private JLabel labelAge;
    private JLabel labelAgeValue;
    private JButton changeNameBtn;
    private JButton changeAgeBtn;

    public PersonView(){

//        frame
        frame = new JFrame("Person");
        frame.setSize(350,180);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

//      name label
        labelName = new JLabel("Name:");
        labelName.setBounds(10,10,100,50);
        frame.add(labelName);
//        age label
        labelAge = new JLabel("Age:");
        labelAge.setBounds(10,70,100,50);
        frame.add(labelAge);
//      name value
        labelNameValue = new JLabel("Jhon");
        labelNameValue.setBounds(50,10,100,50);
        labelNameValue.setHorizontalAlignment(SwingConstants.CENTER);
        labelNameValue.setOpaque(true);
        labelNameValue.setBackground(Color.GRAY);
        frame.add(labelNameValue);
//        age value
        labelAgeValue = new JLabel("20");
        labelAgeValue.setBounds(50,70,100,50);
        labelAgeValue.setHorizontalAlignment(SwingConstants.CENTER);
        labelAgeValue.setOpaque(true);
        labelAgeValue.setBackground(Color.GRAY);
        frame.add(labelAgeValue);

        changeNameBtn = new JButton("change name");
        changeNameBtn.setBounds(160,10,150,50);
        frame.add(changeNameBtn);

        changeAgeBtn = new JButton("change age");
        changeAgeBtn.setBounds(160,70,150,50);
        frame.add(changeAgeBtn);

        frame.setVisible(true);

    }

//    @Override
//    public void propertyChange(PropertyChangeEvent evt) {
//        this.changeName((String) evt.getNewValue());
//    }
//
    public void changeName(String name){
        this.labelNameValue.setText(name);
    }

    public void changeAge(String age){
        this.labelAgeValue.setText(age);
    }


    public JButton getChangeNameBtn() { return changeNameBtn; }

    public JButton getChangeAgeBtn()  { return changeAgeBtn; }

    public JLabel getLabelNameValue() { return labelNameValue; }

    public JLabel getLabelAgeValue()  { return labelAgeValue; }
}
