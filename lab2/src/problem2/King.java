package problem2;

public class King extends Piece {
	public King(Position a, Color color) {
		super(a, color);
	}
	@Override
	public boolean isLegalMove(Position b) {
		boolean isDifferenceEqualsOne = 
				(Math.abs(this.columnDifference(b)) == 1) || 
				(Math.abs(this.rowDifference(b)) == 1);
		boolean isLargerThanOne = 
				(Math.abs(this.columnDifference(b)) > 1) || 
				(Math.abs(this.rowDifference(b)) > 1);
		if(isNoneZero(b)) {
			if(isLargerThanOne) return false;
			if(isDifferenceEqualsOne) return true;
		}
		return false;
	}
	
	public String toString() {
		return "King, " + super.toString();
	}

}
