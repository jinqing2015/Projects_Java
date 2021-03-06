package cn.schema.observer;

import java.util.ArrayList;


public class WeatherData implements Subject{

	
	private ArrayList observers;
	private float temperature;
	private float humdity;
	private float pressure;
	
	public WeatherData(){
		this.observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = this.observers.indexOf(o);
		if(i >= 0){
			this.observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(int i = 0; i<this.observers.size(); ++i){
			Observer obs = (Observer)this.observers.get(i);
			obs.update(this.temperature, this.humdity, this.pressure);
		}
		
	}
	
	public void measurementsChanged(){
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		
		this.temperature = temperature;
		this.humdity = humidity;
		this.pressure = pressure;
		
		this.measurementsChanged();
		
	}
	
}
