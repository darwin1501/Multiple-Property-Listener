package com.darwin.controller;

import com.darwin.model.PersonModel;
import com.darwin.view.PersonView;

import javax.swing.*;

public class PersonController {

    private PersonView personView;
    private PersonModel personModel;
    private String name;
    private String age;

    public PersonController(PersonView personView, PersonModel personModel){
        this.personView = personView;
        this.personModel = personModel;

        initController();
    }

    public void initController(){

        personModel.addPropertyChangeListenerForName((e)->{
            personView.changeName((String) e.getNewValue());
        });

        personModel.addPropertyChangeListenerForAge((e)->{
            personView.changeAge((String) e.getNewValue());
        });

        personView.getChangeNameBtn().addActionListener((e)->{
            name = JOptionPane.showInputDialog("Enter name:");
            if(name != null){
                personModel.changeName(name);
            }
        });

        personView.getChangeAgeBtn().addActionListener((e)->{
           age = JOptionPane.showInputDialog("Enter Age:");
           if(age != null){
               personModel.changeAge(age);
           }
        });
    }

}
