package problem2;

public class Knight extends Piece {

	public Knight(Position a, Color color) {
		super(a, color);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		int colDiff = Math.abs(this.columnDifference(b));
		int rowDiff = Math.abs(this.rowDifference(b));
		if(isNoneZero(b)) {
			if((colDiff == 2 && rowDiff == 1) || (colDiff == 1 && rowDiff == 2)) return true;
		}
		return false;
	}
	
	public String toString() {
		return "king, " + super.toString();
	}

}
