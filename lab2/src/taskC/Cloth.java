package taskC;

import java.util.Objects;

public abstract class Cloth {
	private Type type;
	private Season season;
	private int size;
	public abstract String putOn();
	public abstract String tryOn();
	
	public Cloth(Type type, Season season, int size) {
		this.type = type;
		this.season = season;
		this.size = size;
	}
	
	public Cloth() {
		
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Cloth)) return false;
		Cloth cl = (Cloth)obj;
		return size == cl.size &&
				Objects.equals(type, cl.type) &&
				season == cl.season;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.season, this.size, this.type);
	}
	
	@Override
	public String toString() {
		return "type: " + this.type + ", season: " + this.season + ", size: " + this.size;
	}

}
