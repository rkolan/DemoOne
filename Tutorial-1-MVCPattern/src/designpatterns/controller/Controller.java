package designpatterns.controller;

import designpatterns.model.Model;
import designpatterns.view.View;

public class Controller {
private View view;
private Model model;
public Controller(Model model, View view ) {
	super();
	this.view = view;
	this.model = model;
}

}
