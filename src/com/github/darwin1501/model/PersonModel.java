package com.github.darwin1501.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class PersonModel {

    private String name;
    private String age;
    private PropertyChangeSupport support;

    public PersonModel(){
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListenerForName(PropertyChangeListener object){
        support.addPropertyChangeListener("name",object);
    }

    public void addPropertyChangeListenerForAge(PropertyChangeListener object){
        support.addPropertyChangeListener("age",object);
    }

    public void removePropertyChangeListener(PropertyChangeListener object){
        support.removePropertyChangeListener(object);
    }

    public void changeName(String name){
        support.firePropertyChange("name", this.name,name);
        this.name = name;
    }

    public void changeAge(String age){
        support.firePropertyChange("age",this.age,age);
        this.age = age;
    }
}
