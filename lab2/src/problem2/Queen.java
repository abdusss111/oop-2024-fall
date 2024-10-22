package problem2;

public class Queen extends Piece {
	
	public Queen(Position a, Color color) {
		super(a, color);
	}
	
	public boolean isLegalMove(Position b) {
		Rook rook = new Rook(this.a, this.getColor());
		Bishop bishop = new Bishop(this.a, this.getColor());
		
		if (rook.isLegalMove(b) || bishop.isLegalMove(b)) return true;
		return false;
	}
	
	public String toString() {
		return "Queen, " + super.toString();
	}
}
