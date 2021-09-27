package com.github.darwin1501;

import com.github.darwin1501.controller.PersonController;
import com.github.darwin1501.model.PersonModel;
import com.github.darwin1501.view.PersonView;

public class App {

    public static void main(String[] args) {
	// write your code here
        PersonView personView = new PersonView();
        PersonModel personModel = new PersonModel();

        PersonController personController = new PersonController(personView, personModel);
    }
}
