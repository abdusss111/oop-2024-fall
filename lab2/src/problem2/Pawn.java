package problem2;

public class Pawn extends Piece {
	
	public Pawn(Position a, Color color) {
		super(a, color);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		boolean is2ndRow = (this.a.getRow() == 7 || this.a.getRow() == 2);
		boolean is1row = this.rowDifference(b) == 1 && this.a.equalColumns(b);
		if(isNoneZero(b)) {
			if ((this.rowDifference(b) == 2 && this.a.equalColumns(b) && is2ndRow) || is1row) return true;
		}
		return false;
	}
	
	public String toString() {
		return "Pawn, " + super.toString();
	}

//	public void move(Position b, Board board) {
//		if(this.isLegalMove(b) && b.isPositionEmpty(board)) {
//			board.removePiece(this.a);
//			this.a = b;
//		}
//
//	}
	
}
