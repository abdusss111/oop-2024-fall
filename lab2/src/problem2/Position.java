package problem2;

import java.util.Objects;

public class Position {
	private char row;
	private int column;
	
	public Position() {}
	public Position(char row, int column) {
		this.setRow(row);
		this.setColumn(column);
	}
	public char getRow() {
		return row;
	}
	public void setRow(char row) {
		if(row < 'a' || row > 'h'){
			throw new IllegalArgumentException("invalid row");
		}
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	
	public void setColumn(int column) {
		if(column < 1 || column > 8){
			throw new IllegalArgumentException("invalid column");
		}
		this.column = column;	
	}
	
	public String toString() {
		return "Position " + this.row + ":" + this.column;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj.getClass() != this.getClass() || obj == null) return false;
		Position pos = (Position)obj;
		return Objects.equals(this.column, pos.column) && this.column == pos.column;
	}
	
	public int hashCode() {
		return Objects.hash(row, column);
	}
}
