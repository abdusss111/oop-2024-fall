package problem2;

public class Bishop extends Piece {
	public Bishop(Position a, Color color) {
		super(a, color);
	}

	@Override
	public boolean isLegalMove(Position b) {
		if(isNoneZero(b)) {
			if(Math.abs(this.columnDifference(b)) == Math.abs(this.rowDifference(b)))return true;
		}
		return false;
	}
	
	public String toString() {
		return "Bishop, " + super.toString();
	}
}
