package observer.impl;

import observer.ObserverInterface;
import subject.SubjectInterface;

public class Mobile implements ObserverInterface {
	
	private SubjectInterface subject;
	
	private double temperature;
	private double humidity; //wilgotnoœæ
	private int wind; //wiatr
	private String cloud; //zachmurzenie
	
	public Mobile(SubjectInterface subjet) {
		this.subject = subjet;
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
		System.out.println("MOBILE");
		System.out.println("Temperatura: " + temperature + "°C");
		System.out.println("Wilgotnoœæ: " + humidity + "%");
		System.out.println("Wiatr: " + wind + "km/h");
		System.out.println("Zachmurzenie: " + cloud);
		return "";
	}
}
