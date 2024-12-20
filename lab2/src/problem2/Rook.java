package problem2;

public class Rook extends Piece {

	public Rook(Position a, Color color) {
		super(a, color);
	}
	
	@Override
	public boolean isLegalMove(Position b) {
		boolean isColumnChanged = this.columnDifference(b) != 0;
		boolean isRowChanged = this.rowDifference(b) != 0;
		if((isColumnChanged && !isRowChanged) || (!isColumnChanged && isRowChanged))return true;
		
		return false;
	}
	
	public String toString() {
		return "Rook, " + super.toString();
	}

//	@Override
//	public void move(Position b, Board board) {
//		if(this.isLegalMove(b) && b.isPositionEmpty(board)) {
//			board.removePiece(this.a);
//			this.a = b;
//		}
//		
//	}
	
}
