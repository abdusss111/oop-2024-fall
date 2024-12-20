package problem2;

import java.util.Objects;

public class Position {
	private int row;
	private char column;
	
	public Position() {}
	public Position(char column, int row) {
		this.setRow(row);
		this.setColumn(column);
	}
	
	public boolean isPositionEmpty(){
		int i = Math.abs(row - 9)-1;
		int j = column - 96 - 1;
		return Board.board[i][j] == " |.| ";
	}
	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		if(row < 1 || row > 8){
			throw new IllegalArgumentException("invalid row");
		}
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	
	public void setColumn(char column) {
		if(column < 'a' || column > 'h'){
			throw new IllegalArgumentException("invalid column");
		}
		this.column = column;	
	}
	
	public boolean equalRows(Position b) {
		if(row == b.getRow()) return true;
		return false;
	}
	
	public boolean equalColumns(Position b) {
		if(column == b.getColumn()) return true;
		return false;
	}
	
	public String toString() {
		return "Position " + this.column + ":" + this.row;
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj.getClass() != this.getClass() || obj == null) return false;
		Position pos = (Position)obj;
		return Objects.equals(this.column, pos.column) && this.row == pos.row;
	}
	
	public int hashCode() {
		return Objects.hash(row, column);
	}
	
}
