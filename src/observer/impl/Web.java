package observer.impl;

import observer.ObserverInterface;
import subject.SubjectInterface;

public class Web implements ObserverInterface {
	
	private SubjectInterface subject;
	
	private double temperature;
	private double humidity; //wilgotnoœæ
	private int wind; //wiatr
	private String cloud; //zachmurzenie
	
	public Web(SubjectInterface subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}
	
	@Override
	public void update(double temperature, double humidity, int wind, String cloud) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.wind = wind;
		this.cloud = cloud;
		toString();
	}
	
	public String toString() {
		System.out.println("WEB");
		System.out.println("Temperatura: " + temperature + "°C");
		System.out.println("Wilgotnoœæ: " + humidity + "%");
		System.out.println("Wiatr: " + wind + "km/h");
		System.out.println("Zachmurzenie: " + cloud);
		return "";
	}

}
