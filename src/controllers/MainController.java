package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import views.MainView;

public class MainController implements ActionListener {
	
	public static void main(String[]args){
		new MainView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getSource());
		
	}
	
	

}
