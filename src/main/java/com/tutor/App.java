package com.tutor;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String inUser,String inPassword) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		if(rb.getString("username").equalsIgnoreCase(inUser) && 	rb.getString("password").equalsIgnoreCase(inPassword))
			return 1;
			
			else return 0;
		
	}

	public static void main(String[] args) {
		App app=new App();
		app.userLogin("asd", "as");
	}

}
