package subject.impl;

import java.util.ArrayList;
import java.util.List;

import observer.ObserverInterface;
import subject.SubjectInterface;

public class WeatherStation implements SubjectInterface {
	
	private List<ObserverInterface> observers = new ArrayList<ObserverInterface>();
	private double temperature;
	private double humidity; //wilgotnoœæ
	private int wind; //wiatr
	private String cloud; //zachmurzenie
	
	@Override
	public void attachObserver(ObserverInterface observer) {
		observers.add(observer);
	}

	@Override
	public void detachObserver(ObserverInterface observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (ObserverInterface observer : observers) {
			observer.update(temperature, humidity, wind, cloud);
		}
	}
	
	public void dataChanged() {
		notifyObserver();
	}
	
	public void setData(double temperature, double humidity, int wind, String cloud) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.wind = wind;
		this.cloud = cloud;
		dataChanged();
	}

}
