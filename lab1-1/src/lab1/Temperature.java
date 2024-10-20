package lab1;

public class Temperature {
	private double tempValue;
	private char scale;
	
	
	public Temperature() { //empty
		this.tempValue = 0.0;
		this.scale = 'C';
	}
	
	public Temperature(double tempValue) { //with temperature but w/o scale
        this.tempValue = tempValue;
        this.scale = 'C';
    }
	
	public Temperature(char scale) { //w/o temperature but with scale
		this.tempValue = 0.0;
		this.scale = scale;
	}
	
	public Temperature( double tempValue, char scale) { //full
		this.tempValue = tempValue;
		this.scale = scale;
	}
	
	public double getCelsius() {
		if (this.scale == 'C') {
			return this.tempValue;
		}
		else return 5*(this.tempValue - 32)/9;
	}
	
	public double getFahrenheit() {
		if (this.scale == 'F') {
			return this.tempValue;
		}
		else return 9*this.tempValue/5 + 32;
	}
	public String getScaleName() {
		return this.scale == 'F' ? "Fahrenheit" : "Celsius";
	}
	
	
	public double getTempValue() {
		return this.tempValue;
	}
	
	public char getScale() {
		return this.scale;
	}
	
	public void setTempValue(double tempValue) {
		this.tempValue = tempValue;;
	}
	
	public void setScale(char scale) {
		if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            throw new IllegalArgumentException("Invalid scale: " + scale + ". Only 'C' or 'F' are allowed.");
        }
	}
	
	public void setTemperature(double tempValue, char scale) {
		this.tempValue = tempValue;
		this.scale = scale;
	}
	
	public String toString() {
		return "Temperature is " + this.tempValue  + " degrees by " + getScaleName();
	}
}