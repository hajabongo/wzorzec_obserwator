package main;

import observer.ObserverInterface;
import observer.impl.Mobile;
import observer.impl.Web;
import subject.impl.WeatherStation;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		WeatherStation karpacz = new WeatherStation();
		ObserverInterface mobile = new Mobile(karpacz);
		ObserverInterface web = new Web(karpacz);
		
		karpacz.setData(16, 50, 26, "Du¿e");
		System.out.println("");
		Thread.sleep(2000);
		karpacz.setData(18, 48, 30, "Œrednie");
		System.out.println("");
		Thread.sleep(2000);
		karpacz.setData(21, 42, 24, "Ma³e");

	}

}
