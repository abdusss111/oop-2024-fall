package week2;

public class Time {
	private int hour;
	private int minute;
	private int second;

	public Time(int hour, int minute, int second) {
		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			throw new IllegalArgumentException("Invalid time values");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			throw new IllegalArgumentException("Invalid time values");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String toUniversal() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public String toStandard() {
		String amPm = hour < 12 ? "AM" : "PM";
		int standardHour = hour % 12;
		if (standardHour == 0) {
			standardHour = 12;
		}
		return String.format("%02d:%02d:%02d %s", standardHour, minute, second, amPm);
	}

	public Time add(Time other) {
		int newHour = this.hour + other.hour + (this.minute + other.minute) / 60;
		int newMinute = this.minute + other.minute + (this.second + other.second) / 60;
		int newSecond = (this.second + other.second) % 60;
		return new Time(newHour % 24, newMinute % 60, newSecond);
	}

	public String toString(Time time) {
		return hour + ":" + minute + ":" + second;
	}
}
