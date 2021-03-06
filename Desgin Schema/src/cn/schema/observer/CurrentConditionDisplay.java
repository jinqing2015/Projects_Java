package cn.schema.observer;

import java.util.ArrayList;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	
	private float temperature;
	private float humdity;
	private float pressure;
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(
				" tempeature = "+this.temperature
				+"\n humidity = "+this.humdity
				+"\n pressure = "+this.pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humdity = humidity;
		this.pressure = pressure;
	}

	public static void main(String args[]){
		
		System.out.println("------Observer schema begin-------");
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay ccd1 = new CurrentConditionDisplay(weatherData);
		CurrentConditionDisplay ccd2 = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(100, 30, 105);
		ccd1.display();
		ccd2.display();
		
		System.out.println("------weather change-------");
		
		weatherData.setMeasurements(101, 31, 106);
		ccd1.display();
		ccd2.display();
	}

}
