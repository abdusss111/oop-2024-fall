package taskC;

import java.util.Objects;

public class Shirt extends Cloth {
	private String title;
	
	public Shirt(String title, Type type, Season season, int size) {
		super(type, season, size);
		this.title = title;
	}
	
	public Shirt() {
	
	}
	
	public String putOn() {
		return this.title + " successfully put on.";
	}

	public String tryOn() {
		return this.title + " fits you.";
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	@Override
	public boolean equals(Object obj) {

	    if (!super.equals(obj)) return false;
		Shirt sh = (Shirt)obj;
		return Objects.equals(title, sh.title);
	}
	
	@Override
	public String toString() {
		return super.toString() + ", title: " + this.title;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), title);
	}
	
}
