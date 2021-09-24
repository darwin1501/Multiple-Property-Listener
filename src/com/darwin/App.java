package com.darwin;

import com.darwin.controller.PersonController;
import com.darwin.model.PersonModel;
import com.darwin.view.PersonView;

public class App {

    public static void main(String[] args) {
	// write your code here
        PersonView personView = new PersonView();
        PersonModel personModel = new PersonModel();

        PersonController personController = new PersonController(personView, personModel);
    }
}
