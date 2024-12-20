package problem2;

import java.util.Objects;

public abstract class Piece {
	Position a;
	private Color color;
	public abstract boolean isLegalMove(Position b);
	
	public void move(Position b, Board board) {
		if(this.isLegalMove(b) && b.isPositionEmpty() ) {
			board.removePiece(this.a);
			this.a = b;
		}
	};
	
	public void eat(Piece piece,Board board) {
		if(this.isLegalMove(piece.a) && !(piece.a.isPositionEmpty() &&  this.getColor() != piece.getColor())){
			board.removePiece(this.a);
			this.a = piece.a;
			board.takePosition(piece);
		}
	}
	public boolean isNoneZero(Position b) {
		return !this.a.equals(b);
	}
	
	
//	public boolean isPieceAhead() {
//		if this.a.getRow() + 1;
//		return false;
//	}
	
	public Piece() {}
	public Piece(Position a, Color color) {
		this.a = a;
		this.color = color;
	}

	@Override
	public String toString() {
		return a.toString() + ", color: " + this.color;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj.getClass() != this.getClass() || obj == null) return false;
		Piece piece = (Piece)obj;
		return Objects.equals(a, piece.a);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public int rowDifference(Position b) {
		if(this.color == Color.BLACK) return this.a.getRow() - b.getRow();
		return b.getRow() - this.a.getRow();
	}
	
	public int columnDifference(Position b) {
		if(this.color == Color.WHITE) return this.a.getColumn() - b.getColumn();
		return b.getColumn() - this.a.getColumn();

	}
}
