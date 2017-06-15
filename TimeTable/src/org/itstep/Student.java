package org.itstep;

public class Student extends User{

	public Student(){
		
	}
	public Student(String login, String pass, String name, String city){
		
		this.setCity(city);
		this.setLogin(login);
		this.setPass(pass);
		this.setName(name);
		
	}
}
