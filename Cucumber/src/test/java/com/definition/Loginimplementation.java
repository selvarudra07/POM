package com.definition; 

public class Loginimplementation extends Utilclass{


	public static void main(String[] args) throws InterruptedException {
			
		getDriver();
			
		
		loadurl("https://www.facebook.com/login/");
		
		Facebookloginpage obj=new Facebookloginpage();
		sendInput(obj.getTxtTitle(), "asdf@gmail.com");
		sendInput(obj.getTxtpassword(), "admin123455");
		click(obj.getbuttonlogin());
		
	}


}
